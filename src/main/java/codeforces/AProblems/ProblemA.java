package codeforces.AProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProblemA {
    public static void main(String[] args) {


        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader)) {
            String inputLine = "";
            inputLine = bufferedInputStream.readLine();
            String[] numberList = inputLine.split("\\s+");
            List<Integer> myList = new ArrayList<Integer>();
            for(String num : numberList){
                myList.add(Integer.parseInt(num));
            }

            if((myList.get(0) <= myList.get(1)) && myList.get(0) <= myList.get(2)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
