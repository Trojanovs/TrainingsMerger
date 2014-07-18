package com.trojanov;

import java.io.File;


import com.trojanov.models.slf.SLFModel;
import com.trojanov.models.tcx.TCXModel;
import com.trojanov.parser.SLFParser;
import com.trojanov.parser.TCXParser;

public class TrainingsMerger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TCXModel tcxModel = TCXParser.parseTCX(new File("C:/endomondo.tcx"));
		SLFModel slfModel = SLFParser.parseSLF(new File("C:/sigma.slf"));		
	}
	
	
	

}
