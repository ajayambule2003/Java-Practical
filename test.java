// Java program to demonstrate extracting first letter of each word using Regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String s1 = "Java programming";
        String s2 = "A Computer Science Portal for Geeks";

        Pattern p = Pattern.compile("\\b[a-zA-Z]");

        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);

        System.out.println("First letter of each word from string \"" + s1 + "\" : ");
        while (m1.find()) 
            System.out.print(m1.group());

        System.out.println();

        System.out.println("First letter of each word from string \"" + s2 + "\" : ");

        while (m2.find())
            System.out.print(m2.group());

    }
}
