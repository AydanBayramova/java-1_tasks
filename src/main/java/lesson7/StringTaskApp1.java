package lesson7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StringTaskApp1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(stringWord(word));


    }
    public static String stringWord(String word) {
       String words= String.valueOf(word.split("\\s"));
        return word;
    }


}
