package fields;

import java.io.BufferedReader;
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
		
		readFile("data/data.txt");
		//readData();
		/*for(int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getName() + " - " + data.get(i).getColor());
			
		}
		

		
		for(int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getName() + " - " + data.get(i).getColor());
			
		}*/
		
	}
	
	public static void readData() throws IOException {
		Scanner in = new Scanner(new FileReader(new File("data/data.txt")));
		while(in.hasNextLine()) {
			String line = in.nextLine();
			if(line.equals("#")) {
				Person person = new Person();
				person.setName(in.nextLine()) ;
				data.add(person);
				
			} else {
				switch(line) {
					case "color" :
					data.getLast().setName(in.nextLine());
					break;
		
				}
				
			}

		}
		
	}
	
  public static void readFile(String path) {
	  try {
		  
		  BufferedReader reader = new BufferedReader(new FileReader(path));
		  String line="";
		  
		  while((line = reader.readLine()) != null){
			  if(line == "#") {
				  
			  }
		  }
		  
	  } catch(Exception e){
		  
	  }
  
  }
	
	public static void writeData(String name, double color) throws IOException {
		Person person = new Person();
		person.setName(name);
		person.setColor(color);
		data.add(person);
		
		Scanner in = new Scanner(new FileReader(new File("data/data.txt")));
		ArrayList<String> writelist = new ArrayList<String>();
		
		for(int i = 0; i < data.size(); i++) {
			writelist.add("#");
			writelist.add(data.get(i).getName());
			
			if(data.get(i).getColor() != -1) {
				writelist.add("color");
				writelist.add(Double.toString(data.get(i).getColor()));
				
			}
			
		}
		
		while(in.hasNextLine()) {
			writelist.add(in.nextLine());
			
		}
		
		FileWriter writer = new FileWriter("data/data.txt");
		
		for(int i = 0; i < writelist.size(); i++) {
			writer.write(writelist.get(i));
			writer.write("\n");
			
		}
		
		writer.write("#");
		writer.write("\n");
		writer.write(name);
		writer.write("color");
		writer.write(Double.toString(color));
		
	}
	
}
