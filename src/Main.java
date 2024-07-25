import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la base del rettangolo: ");
        int base1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci l'altezza del rettangolo:");
        int altezza1 = Integer.parseInt(scanner.nextLine());

        Rettangolo ret1 = new Rettangolo(base1,altezza1);





        System.out.println("Inserisci la base del 2° rettangolo: ");
        int base2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci l'altezza del 2° rettangolo:");
        int altezza2 = Integer.parseInt(scanner.nextLine());

        Rettangolo ret2 = new Rettangolo(base2,altezza2);

        System.out.println("----- RISULTATI -----");
        Rettangolo.stampaDueRettangoli(ret1,ret2);


    }
}