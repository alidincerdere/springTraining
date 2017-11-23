package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFromFileFortuneService implements FortuneService {

	private List<String> data;
	
	private Random myRandom = new Random();
	
	public RandomFromFileFortuneService() {
		
		data = new ArrayList<>();
		
        File f = new File("src/fortunes.txt");

        BufferedReader b = null;
		try {
			b = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        String readLine = "";

        System.out.println("Reading file using Buffered Reader");

        try {
			while ((readLine = b.readLine()) != null) {
			    data.add(readLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.size());
		
		return data.get(index);
	}

}
