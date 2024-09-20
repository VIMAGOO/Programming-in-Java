import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * WriteBytes.java
 * Example writing bytes to a file
 * @author vimago
 */
public class WriteBytes {
	public static void main(String[] args) {
		byte [] list ={10, 15, 25, 30, 45};
		if(args.length == 1) {	 //check parameter length 
			File f = new File(args[0]);
			try{
				FileOutputStream fs = new FileOutputStream(f);
				for(int i = 0; i < list.length; i++){
					fs.write(list[i]);
				}
				fs.flush();
				fs.close();
			} catch(IOException e) {
				System.out.println("Input or output problem related to this exception:");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Usage: WriteBytes filename");
		}
	}
}
