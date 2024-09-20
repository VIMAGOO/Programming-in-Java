import java.io.*;
/**
 * WriteChars.java
 * Example writing characters to a file
 * @author Jose
 */
public class WriteChars {
	public static void main(String[] args) {
		char [] list = {'a', 'e', 'i', 'o', 'u'};
		if(args.length == 1) {	//check parameter length 
			try{
				FileWriter fs = new FileWriter(args[0]);
				//BufferedWriter fs = new BufferedWriter(new FileWriter(args[0]));
				for(int i = 0; i < list.length; i++){
					fs.write(list[i]);
				}
				fs.close();
			} catch(IOException e) {
				System.out.println("Input or output problem related to this exception:");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Usage: WriteChars filename");
		}
	}
}
