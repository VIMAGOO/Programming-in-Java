package dirlist;

import java.io.File;

/**
 * Dla -format path Default format: -1 Default path: .
 *
 * @author vimago
 */
public class Dla {

    private String format;
    private String path;

    public static void main(String[] args) {
        Dla dla = new Dla();
        dla.run(args);
    }

    private void run(String[] args) {
        switch (args.length) {
            case 0:
                format = "-1";
                path = ".";
                break;
            case 1:
                //TODO
                if (args[0].equals("-1")) {
                    path = ".";
                } else {
                    path = "-1";
                }
                break;

            case 2:
                format = args[0];
                path = args[1];
                break;
            default:
                System.out.println("Wrong number of arguments.");
                break;

        }
        //get and show directory files with attributes
        String result = getFilesInfoInDir();
        System.out.println(result);
    }

    private String getFilesInfoInDir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Listing path " + path + " with format " + format);
        File dir = new File(path);
        System.out.println("Listing directoty: " + dir.getPath());
        //get files
        File[] files = dir.listFiles();
        //get attributes for each file
        //TODO
        return sb.toString();
    }

}
