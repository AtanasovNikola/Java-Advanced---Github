package SetAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P10UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set =new LinkedHashSet<>();
        int usernames = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <usernames ; i++) {
            String username = scanner.nextLine();
            set.add(username);
        }
        set.forEach(System.out::println);
    }
}
