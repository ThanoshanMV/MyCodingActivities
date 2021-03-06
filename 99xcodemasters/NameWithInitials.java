import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String[] stringArray = s.split(" ");
        
        String name = "";
        
        for (int i = 0; i < stringArray.length; i++) {
            // get last part of name
            if (i == stringArray.length-1) {
                name += stringArray[i].substring(0,1).toUpperCase();
                name += stringArray[i].substring(1);
            }
            // remaining parts of the full name
            else {
                name += stringArray[i].substring(0,1).toUpperCase() + ".";
            }
        }
        System.out.println(name);
}
}
