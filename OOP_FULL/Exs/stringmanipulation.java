import java.util.Scanner;


public class stringmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your String:");
        String word= sc.nextLine();
        System.out.println("to uppercase: "+word.toUpperCase());
        System.out.println("to lowercase: "+word.toLowerCase());
        System.out.println("the length of the string is: "+word.length());
        System.out.println("character at first position: "+word.charAt(0));
        System.out.println("to replace a letter with f: "+word.replaceAll("l", "f"));
    }
    
}
