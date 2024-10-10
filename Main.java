import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter the first word: ");
        String previousWord = scan.nextLine();
        while(score < 50) {
            System.out.print("Enter the next word: ");
            String currentWord = scan.nextLine();
            if (currentWord.compareTo(previousWord) > 0) {
                score += 2;
                System.out.println("+2 points, current word alphabetically after");
            } else if (currentWord.compareTo(previousWord) < 0) {
                score -= 5;
                System.out.println("-5 points, current word alphabetically before");
            } else {
                score -= 10;
                System.out.println("-10 points, current word same as previous word");
            }
            if (previousWord.substring(previousWord.length() - 2).equals(currentWord.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points, last 2 letters of previous word match first 2 letters of current word");
            }
            if (currentWord.indexOf(previousWord.substring(0, 1)) >= 0) {
                score += 3;
                System.out.println("+3 points, first letter of previous word found in current word");
            }
            if (previousWord.length() == currentWord.length()) {
                score += 3;
                System.out.println("+3 points, current word same length as previous word");
            }
            previousWord = currentWord;
            System.out.println("Your current score is " + score);
        }
    }
}
