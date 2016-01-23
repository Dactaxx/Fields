package fields;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Fields {
	public static LinkedList<Person> data = new LinkedList<Person>();
	
	public static void main(String[] args) throws IOException {
		//Window.createWindow();
		readData();
		for(int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).name + " - " + data.get(i).color);
			
		}
		

		
		for(int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).name + " - " + data.get(i).color);
			
		}
		
	}
	
	public static void readData() throws IOException {
		Scanner in = new Scanner(new FileReader(new File("data/data.txt")));
		while(in.hasNextLine()) {
			String line = in.nextLine();
			if(line.equals("#")) {
				Person person = new Person();
				person.name = in.nextLine();
				data.add(person);
				
			} else {
				switch(line) {
					case "color" :
					data.getLast().name = in.nextLine();
					break;
		
				}
				
			}

		}
		
	}
	
	public static void writeData(String name, double color) throws IOException {
		Person person = new Person();
		person.name = name;
		person.color = color;
		data.add(person);
		
		Scanner in = new Scanner(new FileReader(new File("data/data.txt")));
		ArrayList<String> writelist = new ArrayList<String>();
		
		for(int i = 0; i < data.size(); i++) {
			writelist.add("#");
			writelist.add(data.get(i).name);
			
			if(data.get(i).color != -1) {
				writelist.add("color");
				writelist.add(Double.toString(data.get(i).color));
				
			}
			
		}
		
		while(in.hasNextLine()) {
			writelist.add(in.nextLine());
			
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("data/data.txt")));
		
		for(int i = 0; i < writelist.size(); i++) {
			writer.write(writelist.get(i));
			writer.newLine();
			
		}
		
		writer.write("#");
		writer.newLine();
		writer.write(name);
		writer.write("color");
		writer.write(Double.toString(color));
		
	}
	
}
