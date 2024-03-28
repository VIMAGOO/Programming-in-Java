package computer;

/**
 *
 * @author vimago
 */
public class ComputerMain {

    public static void main(String[] args) {
        Computer c1 = new Computer("i7", 1000, "AVG", 2);
        System.out.println("c1: "+c1.toString());
        boolean result;
        result = c1.close();
        System.out.println("result:"+result);
        System.out.println("c1:"+c1.toString());
        result = c1.activeScreenSaver();
        result = c1.executeProgram("Excel");
        
    }
    
}
