package FileHandling;
import java.time.*;
import java.time.format.*;
import  java.util.*;


public class DateDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date and time (DD-MM-YYYY-hh:mm): ");
		String input=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("DD-MM-YYYY-HH-MM");
		try {
			LocalDateTime enteredDateTime=LocalDateTime.parse(input,formatter);
			LocalDateTime currentDateTime=LocalDateTime.now();
			
		}
		catch(Exception e) {
			System.out.println("Invalid Date, so please enter valid date.");
		}

	}

}
