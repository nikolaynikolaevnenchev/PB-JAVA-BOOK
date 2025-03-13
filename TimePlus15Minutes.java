import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalTimeMinuts = hours * 60 + minutes + 15;
        int newHours = totalTimeMinuts / 60;
        int newMinuts = totalTimeMinuts % 60;
        if (newHours >= 24){
            newHours-=24;
        }
        if (newMinuts < 10){
            System.out.printf("%d:0%d",newHours,newMinuts);
        }else {
            System.out.printf("%d:%d",newHours,newMinuts);
        }
    }
}
