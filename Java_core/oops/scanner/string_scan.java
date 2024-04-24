// package oops.scanner;

import java.util.Scanner;

public class string_scan{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        input.nextLine();
        System.out.println("The Value of a is "+a);

        // to get a word -- next()
        // to get a sentence -- nextLine() and also to clear the buffer . s

        System.out.println("First get a input word and then give a sentence");

        String word = input.next();
        input.nextLine();

        

        System.out.println("word is "+ word);

        String sentence = input.nextLine();
        System.out.println(" and sentence is "+ sentence);

        input.close();

        
    }
}