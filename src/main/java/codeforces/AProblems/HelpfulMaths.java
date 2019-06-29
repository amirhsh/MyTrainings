package codeforces.AProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Problem number: 339A
 */
public class HelpfulMaths {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String[] strings = bufferedReader.readLine().split("\\+");
            int[] numbers = new int[strings.length];
            for (int i = 0; i < strings.length ; i++) {
                numbers[i] = Integer.parseInt(strings[i]);
            }
            Arrays.sort(numbers);
            for (int i = 0; i <numbers.length ; i++) {
                if(i==numbers.length-1)
                    System.out.printf(String.valueOf(numbers[i]));
                else
                    System.out.printf(String.valueOf(numbers[i]+"+"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
