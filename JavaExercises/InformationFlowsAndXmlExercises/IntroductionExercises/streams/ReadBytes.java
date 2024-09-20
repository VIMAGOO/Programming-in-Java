import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * ReadBytes.java
 * Example reading bytes from file
 * @author vimago
 */
public class ReadBytes {
	public static void main(String[] args) {
		if(args.length == 1) {	 //check parameter length 
			File f = new File(args[0]);
			int x=0; //byte llegit 
			try{
				FileInputStream fs = new FileInputStream(f);
				while ((x = fs.read()) != -1) { //while not end of file,  keep reading
					System.out.print(" "+(byte)x);
				}
				System.out.print("\n");
				fs.close();
			} catch(FileNotFoundException e){
				System.out.println("File not found. Exception info:");
				e.printStackTrace();
			} catch(IOException e) {
				System.out.println("Input or output problem related to this exception:");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Usage: ReadBytes filename");
		}
	}
}
