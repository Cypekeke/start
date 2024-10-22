import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Jeden obiekt Scanner

        // Pobranie wieku
        System.out.println("Podaj wiek Piotrka: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Konsumowanie znaku nowej linii po nextInt()

        // Sprawdzenie wieku
        System.out.println("Dzień dobry, Piotrusiu. Słyszałem, że masz " + age + " lat i uczysz się programowania.");
        System.out.println(IsAgeRight(age) ? "Tak" : "Nie, mam 30 i uczę się programowania.");

        // Pobranie inicjałów
        System.out.println("Podaj inicjały: ");
        String initials = scanner.nextLine();

        // Sprawdzenie inicjałów
        System.out.println(initials.equals("PS") ? "Tak" : "Nie, moje inicjały to PS.");

        scanner.close();  // Zamknięcie Scanner
    }

    public static boolean IsAgeRight(int age) {
        return age == 30;
    }
}
