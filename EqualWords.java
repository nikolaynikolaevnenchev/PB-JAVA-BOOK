import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine().toLowerCase();
        String secondsWord = scanner.nextLine().toLowerCase();
        if (firstWord.equals(secondsWord)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
