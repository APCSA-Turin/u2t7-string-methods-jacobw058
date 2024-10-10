import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String firstWord = scan.nextLine();
        System.out.print("Enter the second word: ");
        String secondWord = scan.nextLine();
        if (firstWord.equals(secondWord)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
        if (firstWord.compareTo(secondWord) < 0) {
            System.out.println(firstWord + " comes before " + secondWord + " alphabeticaly");
        } else if (firstWord.compareTo(secondWord) > 0) {
            System.out.println(secondWord + " comes before " + firstWord + " alphabetically");
        }
    }
}