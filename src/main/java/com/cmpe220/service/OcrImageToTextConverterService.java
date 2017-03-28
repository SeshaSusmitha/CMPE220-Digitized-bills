package com.cmpe220.service;

import java.io.File;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Service
public class OcrImageToTextConverterService {
	
	private final static String DEFAULT_TESSDATA_PATH = "/usr/local/share";
    private final static String DEFAULT_PAGE_SEG_MODE = "3";
    private final static String DEFAULT_LANG = "eng";
	

	@ResponseBody
	public void getTextFromPhoto(){
		
		File imageFile = new File("/Users/poojaprakashchand/Desktop/bill.jpg");
		
		Tesseract instance = new Tesseract();
		instance.setLanguage(DEFAULT_LANG);
        instance.setDatapath(DEFAULT_TESSDATA_PATH);
        instance.setPageSegMode(Integer.parseInt(DEFAULT_PAGE_SEG_MODE));
       
		 
		try {
		 
		String result = instance.doOCR(imageFile);
		System.out.println(result);
		 
		} catch (TesseractException e) {
		System.err.println(e.getMessage());
		}
		
	}

}
