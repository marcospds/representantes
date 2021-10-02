package com.representantes;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File html = new File("/home/marcos/git/representantes/proposicoes/2255621");
		
		Document document = null;
		
		try {
			document = Jsoup.parse(html, "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(document == null) {
			// TODO
		} else {
			
			Elements links = document.select("a");

			links.forEach(System.out::println);
		}
	}

}
