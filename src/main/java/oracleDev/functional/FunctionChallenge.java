package oracleDev.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;


public class FunctionChallenge {

    public static void main(String... doYourBest) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> sub = (a) -> a - 2;
        Function<Integer, Integer> mult = (a) -> a * 3;

        BiConsumer<Integer, Integer> consumer = (a, b)
                -> System.out.println(a + 2 + b + 2);

//        consumer.accept(firstResult, secondResult);
    }

}