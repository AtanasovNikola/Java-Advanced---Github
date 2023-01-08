package SetAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        Map<String, Double> map = new TreeMap<>();
        for (int student = 0; student < students; student++) {
            String name = scanner.nextLine();
            double[] score = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double averageGrade = average(score);
            map.put(name, averageGrade);
        }
        DecimalFormat format= new DecimalFormat("#.#####################");
        map.forEach((key, value) -> System.out.printf("%s is graduated with %s%n", key, format.format(value)));
    }

    private static double average(double[] score) {
        double average = 0;
        for (int i = 0; i < score.length; i++) {
            average += score[i];
        }
        average /= score.length;
        return average;
    }
}
