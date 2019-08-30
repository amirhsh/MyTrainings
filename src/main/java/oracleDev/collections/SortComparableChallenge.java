package oracleDev.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortComparableChallenge {
    public static void main(String... doYourBest) {
        Set set = new TreeSet<>();
        set.add(new Simpson("Homer"));
        set.add(new Simpson("Marge"));
        set.add(new Simpson("Lisa"));
        set.add(new Simpson("Bart"));
        set.add(new Simpson("Maggie"));

        List list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);

        list.forEach(System.out::println);
    }



    static class Simpson implements Comparable<Simpson> {
        String name;

        public Simpson(String name) {
            this.name = name;
        }

        public int compareTo(Simpson simpson) {
            return simpson.name.compareTo(this.name); // This will sort inverted way
        }

        public String toString() {
            return this.name;
        }

    }


}