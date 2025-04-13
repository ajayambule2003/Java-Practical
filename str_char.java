// Java program to Converting a String to a List of Characters

import java.util.*;

class str_char {

    public static List<Character>
            convertStringToCharList(String str) {

        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        return chars;
     } 
    public static void main(String[] args) {

        
        String str = "javaprogramming";
        List<Character> chars = convertStringToCharList(str);
        System.out.println(chars);
    }
}
