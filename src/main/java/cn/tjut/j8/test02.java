package cn.tjut.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test02 {
    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(System.out::println);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String collect = G7.stream().map(e -> e.toUpperCase()).collect(Collectors.joining("-"));
        System.out.println(collect);
    }
}
