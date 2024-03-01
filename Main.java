import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        File f = new File("names.txt");

        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String n = s.nextLine();
                names.add(n);
            }
        }
        catch (Exception e) {

        }

        System.out.println(names);
    }
}