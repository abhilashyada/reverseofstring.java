import java.util.Scanner;

public class reverseofstring{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String empty = "";
        for (int i = word.length()-1;i >= 0;i--) {
            empty += word.charAt(i);
        } 
        System.out.println(empty);
    }
} 