package com.trojanov.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.trojanov.Utils;
import com.trojanov.models.slf.SLFModel;


public class SLFParser {
	public static SLFModel parseSLF(File slfFile ) {		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(slfFile);
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
		
		SLFModel slfModel = null;
		if(doc != null){
			doc.getDocumentElement().normalize();
			 
		 
			NodeList encodedDataList = doc.getElementsByTagName("EncodedData");			
			Node encodedDataNode = encodedDataList.item(0);
			Element encodedDataElement = (Element) encodedDataNode;
			
			
			slfModel = new SLFModel(				
					Integer.parseInt(encodedDataElement.getElementsByTagName("TrainingTime").item(0).getTextContent()),
					Integer.parseInt(encodedDataElement.getElementsByTagName("PauseTime").item(0).getTextContent()), 
					Double.parseDouble(encodedDataElement.getElementsByTagName("Distance").item(0).getTextContent()),
					Integer.parseInt(encodedDataElement.getElementsByTagName("AverageHeartrate").item(0).getTextContent()),
					Integer.parseInt(encodedDataElement.getElementsByTagName("LowerLimit").item(0).getTextContent()),
					Integer.parseInt(encodedDataElement.getElementsByTagName("UpperLimit").item(0).getTextContent()));
			
			slfModel.setStartDate(Utils.getDateFromStrSLF(doc.getElementsByTagName("StartDate").item(0).getTextContent()));
			System.out.println("SLF start date: "+slfModel.getStartDate());
		}
		return null;
		
	}
}
