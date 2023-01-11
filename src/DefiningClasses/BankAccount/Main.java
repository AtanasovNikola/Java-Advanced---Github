package DefiningClasses.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Integer, BankAccount> map = new HashMap<>();
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            //•	SetInterest {Interest}
            switch (command[0]) {

                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    map.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;

                case "Deposit":
                    int id = Integer.parseInt(command[1]);
                    double amount = Double.parseDouble(command[2]);
                    if (map.containsKey(id)) {
                        map.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest":
                    double interestRate = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;

                case "GetInterest":
                    id = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (map.containsKey(id)) {
                        double interest = map.get(id).getInterest(years);
                        System.out.printf("%.2f%n", interest);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
