package forloop_sorular;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println(("Passwordunuzu g!r!n!z"));
            password = scan.nextLine();
            if(password.equals("AliCan")) {
                System.out.println("Dogru");
            }else {
                System.out.println("Yanlıs");
            }
        }while(!(password.equals("AliCan")));
    }
}
