package SetAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P14UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //IP={IP.Address} message={A&sample&message} user={username}"

        String[] input = scanner.nextLine().split(" ");
        Map<String, Map<String, Integer>> map = new TreeMap<>();
        while (!input[0].equals("end")) {
            String ip = input[0].substring(3);
            String user = input[2].substring(5);
            map.putIfAbsent(user, new TreeMap<>());
            map.get(user).putIfAbsent(ip, 0);
            map.get(user).put(ip, map.get(user).get(ip) + 1);
            input = scanner.nextLine().split(" ");
        }
        print(map);
    }

    private static void print(Map<String, Map<String, Integer>> map) {
        for (var users : map.entrySet()) {
            System.out.println(users.getKey() + ":");
            int iteration = 0;
            for (var ip : map.get(users.getKey()).entrySet()) {
                iteration++;
                System.out.print(ip.getKey() + " => " + ip.getValue());
                if (map.get(users.getKey()).size() != iteration) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }

            }
            System.out.println();
        }

    }
}
