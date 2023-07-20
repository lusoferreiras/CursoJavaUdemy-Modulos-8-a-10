package com.udemy.streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/*
1. Número para string binária... 6 => "110"
2. Inverter a String... "110" => "011"
3. converter de volta para inteiro => "011" => 3

Integer.
 */
public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("\nString Binária");

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s,2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);




    }
}
