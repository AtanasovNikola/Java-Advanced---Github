package SetAndMapsAdvanced;

import java.util.*;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();
        String currentGuest = scanner.nextLine();
        while (!currentGuest.equals("PARTY")) {
            char firstSymbol = currentGuest.charAt(0);
            if (Character.isDigit(firstSymbol)) {
                vipGuests.add(currentGuest);
            } else {
                regularGuests.add(currentGuest);
            }
            currentGuest = scanner.nextLine();
        }
        currentGuest = scanner.nextLine();
        while (!currentGuest.equals("END")) {

            if (vipGuests.contains(currentGuest) || regularGuests.contains(currentGuest)) {
                vipGuests.remove(currentGuest);
                regularGuests.remove(currentGuest);
            }
                currentGuest = scanner.nextLine();

        }
        System.out.println(vipGuests.size()+ regularGuests.size());
        vipGuests.forEach(System.out::println);
        regularGuests.forEach(System.out::println);
    }
}

