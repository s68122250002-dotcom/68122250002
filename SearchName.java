import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Somchai", "Somsri", "Anan", "Malee", "Nida"};

        System.out.print("Enter name to search: ");
        String search = input.nextLine();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        input.close();
    }
}