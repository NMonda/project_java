import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wanyama wanyama;
        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();
        if (choice == 1){
            wanyama = new Umbwa();
            wanyama.speak();
        }
        else if (choice == 2){
            wanyama = new Paka();
            wanyama.speak();
        }
        else{
            wanyama = new Wanyama();
            System.out.println("Invalid choice!");
            wanyama.speak();
        }


    }
}

