package oracleDev.generics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class GenericsChallenge {
    public static void main(String... doYourBest) {
        Simpson simpson = new GenericsChallenge().new Simpson("HOMER");
        SimpsonFactory<Simpson> simpsonFactory =
                new GenericsChallenge().new SimpsonFactory<>(simpson);

        List list = simpsonFactory.addToList(new ArrayList<>(),
                new ArrayList());
        System.out.println(((List<Simpson>) list).get(0).name);
    }
     class Simpson {
        String name;
        public Simpson(String name) { this.name = name; }
    }
     class SimpsonFactory<T> {
        T t;

        public SimpsonFactory(T t) { this.t = t; }

        public List<T> addToList(List<T> simpson1,
                                 List<? super Simpson> simpson2) {
            simpson1.add(t);
            simpson2.add(new Simpson("Maggie")); // 26
            return simpson1;
        }
    }
}
