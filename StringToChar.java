package Assignment15;
import java.util.*;

public class StringToChar {
  
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Eneter a word");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (char i : ch) {
            System.out.println(i);
        }
    }
}

