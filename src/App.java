import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        TreeBook treeBook = new TreeBook();
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        while (option != 4) {
            System.out.println("=== Book Manager ===");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. List books");
            System.out.println("4. Exit");
            System.out.print("Option: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println("===== Add book =====");
                System.out.print("Enter book name: ");
                String name = scanner.nextLine();
                treeBook.add(new Book(name));
            } else if (option == 2) {
                System.out.println("===== Remove book =====");
                System.out.print("Enter book name: ");
                String name = scanner.nextLine();
                treeBook.remove(new Book(name));
            } else if (option == 3) {
                System.out.println("===== List books =====");
                treeBook.travel();
            } else if (option == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}
