package FileHandling;
import java.util.*;
import java.io.*;


public class FileHandling {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the path of the text file here: ");
	String filePath="C:\\Users\\Thayumanasundaram\\Desktop\\Example1.txt";
	String word1=sc.nextLine();
	String word2=sc.nextLine();
	System.out.println("Enter the replacement words: " +word1 + " and " +word2);
	
	sc.close();
	
	findAndReplace(filePath,word1,word2);
	}
	
	public static void findAndReplace(String filePath,String word1,String word2) {
		try {
			BufferedReader br=new BufferedReader(new FileReader(filePath));
			StringBuffer strb=new StringBuffer();
			String line;
			while((line=br.readLine())!=null){
				strb.append(line).append("\n");
				
				}
			br.close();
			String replacedContent=strb.toString().replace(word1, word2);
			PrintWriter pwr=new PrintWriter(new FileWriter(filePath));
			pwr.print(replacedContent);
			pwr.close();
			System.out.println("Replacing operation is successfully completed!!!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
	
	
	
	
	
	
	
	

