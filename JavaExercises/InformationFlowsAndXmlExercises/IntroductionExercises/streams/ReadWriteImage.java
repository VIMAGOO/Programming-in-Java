import java.io.*

public class ReadWriteImage {
	
	public static void main (String[] args) {
		if(args.length == 2) {	//check parameter length
				File fnIn = new File(args[0]);
				File fnOut = new File(args[1]);
				int x = 0; //byte llegit
			try{
				
				FileInputStream fsIn = new FileInputStream(fIn);
				FileOutputStream fsOut = new FileOutputStream (fOut);
				while ((x=fs.read()) != -1) {
					fsOut.write(x);
				}
				fsIn.close();
				fsOut.close();
			} catch (FileNotFoundException e){
				System.out.println ("File not found. Exception info:");
				e.printStackTrace();
			} catch(IOException e) {
				System.out.println("Input or output problem related to this exception:");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Usage: ReadChars filename");
		}
	}
}

