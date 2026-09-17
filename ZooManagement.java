import java.util.Scanner;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter zoo name: ");
        zoo.zooName = scanner.nextLine();

        while (zoo.zooName.isEmpty()) {
            System.out.print("Zoo name cannot be empty. Enter again: ");
            zoo.zooName = scanner.nextLine();
        }

        System.out.print("Enter number of cages: ");
        zoo.nbrCages = scanner.nextInt();

        while (zoo.nbrCages <= 0) {
            System.out.print("Enter a positive number: ");
            zoo.nbrCages = scanner.nextInt();
        }
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        scanner.close();
    }
}