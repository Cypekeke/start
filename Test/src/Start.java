import java.util.Scanner;
public class Start {
    public static void Age(String[] args) {
        System.out.println("Podaj wiek Piotrka ");
        Scanner podajAge = new Scanner(System.in);//tworze obiekt podaj age

        int age = podajAge.nextInt();  //nextInt odczytuje age
        // informacja o wieku
        System.out.println("Dzień dobry Piotrusia, słyszałem, że masz " + age + " lat i uczysz się programowania czy to prawda?");

        if (IsAgeRight(age)) {    //sprawdza czy wiek czy age jest zgodny z zalozeniami z boolean
            System.out.println("Tak");
        } else {
            System.out.println("Nie, mam 30 i ucze się programowania.");
        }
        Initials(args); //wywolanie metody Initials do pytania o inicjaly

        podajAge.close();
    }

    public static boolean IsAgeRight(int age) //funckja sprawdzajaca, czy wiek to 30
    {
        return age == 30;
    }

    public static void Initials(String[] args) {
        System.out.println("Podaj inicjały: ");
        Scanner podajInitial = new Scanner(System.in);   //tworze obiekt podaj inicjalow (z racji ze z char mialbym wiecej pisania uzyje string)
        String initial = podajInitial.next();   //odczytuje inicjaly

        // sprawdza czy inicjaly to "PS"
        if (initial.equals("PS")) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie, moje inicjały to PS.");
        }
        podajInitial.close();

    }
}

