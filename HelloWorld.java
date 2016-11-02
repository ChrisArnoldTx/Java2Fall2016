import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		//hello.guessingGame();
		hello.userInfo();
		
//		System.out.println("Hello, what is your name?");
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		
//		//Get a single character.
//		char c = scanner.next().charAt(0);
//		scanner.close();
//		
//		
//		System.out.println("Greetings, " + name);
//		
//		//Random between 1 and 10.
//		Random rand = new Random();
//		int x = rand.nextInt(10)+1;
//		
//		HelloWorld.doStaticStuff();
//		
//		HelloWorld blah = new HelloWorld();
//		blah.doStuff();
//		blah.doStaticStuff();
	}
	
	public void userInfo() {
		Scanner scanner = new Scanner(System.in);
		String name, age, color, birthday, gpa;
		
		System.out.println("Name:");
		name = scanner.nextLine();
		System.out.println("Age:");
		age = scanner.nextLine();
		int ageInt = Integer.parseInt(age);
		System.out.println("Color:");
		color = scanner.nextLine();
		System.out.println("Birthday?");
		birthday = scanner.nextLine();
		boolean birthdayBool = Boolean.parseBoolean(birthday);
		System.out.println("GPA:");
		gpa = scanner.nextLine();
		
		this.writeToFile(name, age, color, birthday, gpa);
		this.readFromFile();
	}
	
	public void writeToFile(String name, String age, 
			String color, String birthday, String gpa) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("person.txt");
			PrintStream p = new PrintStream(fout);
			p.println(name);
			p.println(age);
			p.println(color);
			p.println(birthday);
			p.println(gpa);
			p.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void readFromFile() {
		FileInputStream fin;
		try {
			fin = new FileInputStream("person.txt");
			DataInputStream din = new DataInputStream(fin);

			String line = "";
			while (line != null) {
				line = din.readLine();
				System.out.println(line);
			}
			
		}
		catch (Exception e) { }
	}
	
	public void guessingGame() {
		Scanner scanner = new Scanner(System.in);
		String answer;
		do {
			Random rand = new Random();
			int secretNumber = rand.nextInt(10)+1;
			
			int guess = 0;
			boolean success = false;
			do {
				System.out.println("Pick an integer between 1 and 10...");
				String guessString = scanner.nextLine();
			try {
				guess = Integer.parseInt(guessString);
				success = true;
			}
			catch(Exception e) { 
				System.out.println("An integer, jackass.");
				}
			finally { /* Do anything that has to happen. */ }
			} while(success != true);
			 
			if (guess == secretNumber) {
				System.out.println("You got it!");
			}
			else {
				System.out.println("You're wrong! It was really " + secretNumber);
			}
			
			System.out.println("do you want to play again? y/n");
			answer = scanner.nextLine();
			//System.out.println("You entered: " + answer.charAt(0));
			
		} while (answer.length() == 1
				 && answer.toUpperCase().charAt(0) == 'Y');
		scanner.close();
	}
	
	public static void doStaticStuff() {
		System.out.println("I'm doing static stuff.");
	}
	
	public void doStuff() {
		System.out.println("I'm doing stuff, trust me.");
	}
}
