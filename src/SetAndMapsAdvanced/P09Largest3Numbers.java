package SetAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .sorted((n1,n2)-> n2.compareTo(n1)).collect(Collectors.toList());
        int counter =0;
        for (Integer integer : sorted) {
            System.out.print(integer+ " ");
            counter++;
            if (counter==3){
                break;
            }
        }




    }
}
