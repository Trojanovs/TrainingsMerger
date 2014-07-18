package com.trojanov.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.trojanov.Utils;
import com.trojanov.models.tcx.Position;
import com.trojanov.models.tcx.TCXModel;
import com.trojanov.models.tcx.Trackpoint;

import java.util.ArrayList;
import java.util.List;


public class TCXParser {

	public static TCXModel parseTCX(File tcxFile ) {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(tcxFile);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TCXModel tcxModel = null;
		if(doc != null){
			doc.getDocumentElement().normalize();
			 
		 
			NodeList lapList = doc.getElementsByTagName("Lap");			
			Node lapNode = lapList.item(0);
			Element lapElement = (Element) lapNode;
			
			tcxModel = new TCXModel(
					Double.parseDouble(lapElement.getElementsByTagName("TotalTimeSeconds").item(0).getTextContent()), 
					Double.parseDouble(lapElement.getElementsByTagName("DistanceMeters").item(0).getTextContent()), 
					Integer.parseInt(lapElement.getElementsByTagName("Calories").item(0).getTextContent()), 
					Integer.parseInt(lapElement.getElementsByTagName("AverageHeartRateBpm").item(0).getTextContent().trim()), 
					Integer.parseInt(lapElement.getElementsByTagName("MaximumHeartRateBpm").item(0).getTextContent().trim()) 
					);				
			
			List<Trackpoint> trackPoints = new ArrayList<Trackpoint>();
			NodeList trackPointsList = doc.getElementsByTagName("Trackpoint");			
		 
			for (int temp = 0; temp < trackPointsList.getLength(); temp++) {
				Node trackPointItem = trackPointsList.item(temp);
		 
				
		 
				if (trackPointItem.getNodeType() == Node.ELEMENT_NODE) {
		 
					Element trackPointElement = (Element) trackPointItem;
		 
					trackPoints.add(new Trackpoint(
							Utils.getDateFromStrTCX(trackPointElement.getElementsByTagName("Time").item(0).getTextContent()),
							new Position(
									Double.parseDouble(trackPointElement.getElementsByTagName("LatitudeDegrees").item(0).getTextContent()), 
											Double.parseDouble(trackPointElement.getElementsByTagName("LongitudeDegrees").item(0).getTextContent())), 
							Integer.parseInt(trackPointElement.getElementsByTagName("HeartRateBpm").item(0).getTextContent().trim())));
//					System.out.println("Point: "+trackPoints.get(temp).getTime());
				}
				if(tcxModel.getStartTime() == null){
					tcxModel.setStartTime(trackPoints.get(temp).getTime());
				}
			}
			tcxModel.setTrackpoints(trackPoints);			
		}
		return tcxModel;
	}
}
