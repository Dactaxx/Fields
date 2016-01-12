package fields;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Fields {
	public static LinkedList<Person> data = new LinkedList<Person>();
	
	public static void main(String[] args) {
		Window.createWindow();
		
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

		}
		
	}
	
}
