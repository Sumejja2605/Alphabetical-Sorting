import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main<chars> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Put your sentence here: ");

        String s = sc.nextLine();

        char chars[] = s.toCharArray();
        char temp;
        int i = 0;


        while (i < chars.length) {
            int j = i + 1;

            while (j < chars.length) {

                if (chars[j] < chars[i]) {

                    temp= chars[i];
                    chars[i]= chars[j];
                    chars[j]=temp;


                }
                j+=1;

            }i+=1;
        }

        System.out.println(chars);
    }




}
