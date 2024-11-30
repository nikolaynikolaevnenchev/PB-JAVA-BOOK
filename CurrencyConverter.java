import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        String enterCurrency = scanner.nextLine();
        String finalCurrency = scanner.nextLine();
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        double calculate = 0.0;
        if (enterCurrency.equals("BGN")){
            if (finalCurrency.equals("USd")){
                calculate = amount / usd;
            }else if (finalCurrency.equals("EUR")){
                calculate = amount / eur;
            }else if (finalCurrency.equals("GBP")){
                calculate = amount / gbp;
            }
        }else if (enterCurrency.equals("USD")){
            if (finalCurrency.equals("BGN")){
                calculate = amount * usd;
            }else if (finalCurrency.equals("EUR")){
                calculate = amount * usd / eur;
            }else if (finalCurrency.equals("GBP")){
                calculate = amount * usd / gbp;
            }
        }else if (enterCurrency.equals("EUR")){
            if (finalCurrency.equals("BGN")){
                calculate = amount * eur;
            }else if (finalCurrency.equals("USD")){
                calculate = amount * eur / usd;
            }else if (finalCurrency.equals("GBP")){
                calculate = amount * eur / gbp;
            }
        }else if (enterCurrency.equals("GBP")){
            if (finalCurrency.equals("BGN")){
                calculate = amount * gbp;
            }else if (finalCurrency.equals("USD")){
                calculate = amount * gbp / usd;
            }else if (finalCurrency.equals("EUR")){
                calculate = amount * gbp / eur;
            }
        }
        System.out.printf("%.2f %s",calculate,finalCurrency);
    }
}
