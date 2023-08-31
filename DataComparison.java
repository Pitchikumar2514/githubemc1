package DataComparison;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DataComparison {
public static void main(String[] args) {
	        Set<String> file1Emails = readEmailsFromFile("file1.txt");
	        Set<String> file2Emails = readEmailsFromFile("file2.txt");

	        // Emails present in both files
	        Set<String> commonEmails = new HashSet<>(file1Emails);
	        commonEmails.retainAll(file2Emails);
	        System.out.println("Emails present in both files:");
	        System.out.println(commonEmails);

	        // Emails present in file1 but not in file2
	        Set<String> uniqueToFile1 = new HashSet<>(file1Emails);
	        uniqueToFile1.removeAll(file2Emails);
	        System.out.println("Emails present in file1 but not in file2:");
	        System.out.println(uniqueToFile1);

	        // Emails present in file2 but not in file1
	        Set<String> uniqueToFile2 = new HashSet<>(file2Emails);
	        uniqueToFile2.removeAll(file1Emails);
	        System.out.println("Emails present in file2 but not in file1:");
	        System.out.println(uniqueToFile2);

	        // All unique emails present in both files
	        Set<String> allUniqueEmails = new HashSet<>(file1Emails);
	        allUniqueEmails.addAll(file2Emails);
	        System.out.println("All unique emails present in both files:");
	        System.out.println(allUniqueEmails);
	    }

	    private static Set<String> readEmailsFromFile(String filename) {
	        Set<String> emails = new HashSet<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                emails.add(line.trim());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return emails;
	    }
	}


