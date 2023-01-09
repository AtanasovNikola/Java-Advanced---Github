package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;
public class P11ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int num = Integer.parseInt(scanner.nextLine());
        Collections.reverse(list);
       list.stream().filter(e -> e % num != 0).forEach(e-> System.out.printf("%d ",e));


    }
}
