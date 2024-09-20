import java.io.*;
import java.util.Scanner;

public class ReadUser {
	
	public static void main (String[] args) {
		int c; //character read
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a phrase: ");
		String phrase = sc.nextLine();
	    if(args.length == 1) {	//check parameter length
			try{
				FileWriter fsw = new FileWriter(args[0], false);
				for(int i = 0; i < phrase.length(); i++) {
					fsw.write(phrase.charAt(i));
				}
				fsw.close();
			} catch (FileNotFoundException e){
				System.out.println ("File not found. Exception info:");
				e.printStackTrace();
			} catch(IOException e) {
				System.out.println("Input or output problem related to this exception:");
				e.printStackTrace();
			}
		} else {
			System.out.println("Usage: ReadChars filename");
		}
	}
}


