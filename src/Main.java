import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String args[]) throws Exception {


        Ourlisti<String> ourlist= new Ourlist<String>();

        ourlist.add("");
        ourlist.add("");
        ourlist.add("");
        String a="heeej";
        ourlist.add(a);
        ourlist.add("");
        ourlist.add("");

        System.out.println(ourlist.get(5));

    }
}
