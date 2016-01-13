package fields;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Fields {
	public static LinkedList<Person> data = new LinkedList<Person>();
	
	public static void main(String[] args) throws IOException {
		//Window.createWindow();
		readData();
		
	}
	
	public static void readData() throws IOException {
		Scanner in = new Scanner(new FileReader(new File("data/data.txt")));
		while(in.hasNextLine()) {
			String line = in.nextLine();
			Person person = new Person();
			switch(line) {
				case "name" :
				person.name = in.nextLine();
				data.add(person);
				break;
				
			}
			System.out.println(person.name);

		}
		
	}
	
	public static void writeData(String name, double color) throws IOException {
		Person person = new Person();
		person.name = name;
		person.color = color;
		data.add(person);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("data/data.txt")));
		
	}
	
}
