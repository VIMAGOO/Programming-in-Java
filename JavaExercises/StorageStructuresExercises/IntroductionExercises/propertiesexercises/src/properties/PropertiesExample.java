package properties;

import java.io.*;
import java.util.*;

/**
 * Example of Properties class.
 */
public class PropertiesExample {

    public static void main(String args[]) {
        /* Name of file containing the properties */
        String configFileName = "files/config.properties";
        /* Properties object */
        Properties props = new Properties();
        try {
            /* Read the properties from the file */
            props.load(new FileInputStream(configFileName));
            /* display the properties */
            props.list(System.out);
            //get language filename
            //String langFilename = props.getProperty("language").concat(".properties");
            String langFilename = String.format("%s/%s.properties",
                    props.getProperty("filepath"),
                    props.getProperty("language"));
            //read language properties
            Properties langProps = new Properties();
            langProps.load(new FileInputStream(langFilename));
            /* Input the username and the password */
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            //System.out.print("Input the username: ");
            System.out.println(langProps.getProperty("inputusername"));
            String uname = reader.readLine();
            //System.out.print("Input the password: ");
            System.out.println(langProps.getProperty("inputpassword"));
            String pword = reader.readLine();
            /* Check if username and password are ok */
            if ((uname.equals(props.getProperty("username")))
                    && (pword.equals(props.getProperty("password")))) {
                //System.out.println("Login OK");
                System.out.println(langProps.getProperty("loginsuccess"));
                //System.out.print("Do you want to change your password? (Y/N)");
                System.out.println(langProps.getProperty("changepassword"));
                String change = reader.readLine();
                if (change.equals("Y") || change.equals("S")) {
                    //Console cons = System.console();
                    //System.out.print("Input new password: ");
                    System.out.println(langProps.getProperty("inputnewpassword"));
                    String psw1 = reader.readLine();
                    //String psw1 = new String(cons.readPassword());
                    //System.out.print("Retype new password: ");
                    System.out.println(langProps.getProperty("retypenewpassword"));
                    String psw2 = reader.readLine();
                    //String psw2 = new String(cons.readPassword());
                    if (psw1.equals(psw2)) {
                        props.setProperty("password", psw1);
                        //System.out.println("Password changed. Remember it!");
                        System.out.println(langProps.getProperty("passwordchanged"));
                        props.list(System.out);
                    } else {
                        //System.out.println("Passwords are not equal!");
                        System.out.println(langProps.getProperty("passwordnotequal"));
                    }
                } else {
                    //System.out.println("Goodbye");
                    System.out.println(langProps.getProperty("goodbye"));
                }
            } else {
                //System.out.println("Login failed. Username or password incorrect.");
                System.out.println(langProps.getProperty("loginfail"));
            }
            props.store(new FileOutputStream(configFileName), "Config file");
        } catch (IOException ioe) {
            System.out.println("Error reading config file." + ioe.getMessage());
        }
    }
}
