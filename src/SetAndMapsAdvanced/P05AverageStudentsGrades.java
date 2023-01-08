package SetAndMapsAdvanced;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new TreeMap<>();

        for (int i = 0; i < numOfStudents; i++) {
            String[] studentAndGrade = scanner.nextLine().split("\\s+");
            String name = studentAndGrade[0];
            double grade = Double.parseDouble(studentAndGrade[1]);
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(grade);
        }
        map.entrySet()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", avgSum);
                });
    }
}