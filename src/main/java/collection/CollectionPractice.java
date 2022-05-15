package collection;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
        CollectionPractice listCollection = new CollectionPractice();
        listCollection.linkedHashSet();
        listCollection.sortedSet();

        Set<TestInput> set = new HashSet<>();

        TestInput elso = new TestInput();
        elso.a = 1;
        elso.b = 4;
        TestInput masodik = new TestInput();
        masodik.a = 1;
        masodik.b = 3;

        set.add(elso);
        set.add(masodik);

        System.out.println(set);

    }

    public void linkedHashSet(){

        Set<Integer> sortedSet = new LinkedHashSet<>();

        sortedSet.add(2);
        sortedSet.add(5);
        sortedSet.add(7);

        sortedSet.forEach( e -> System.out.println(e));
    }

    public void sortedSet(){
        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("korte");
        sortedSet.add("banan");
        sortedSet.add("alma");

        sortedSet.forEach(e-> System.out.println(e));
    }

    @ToString
    @EqualsAndHashCode
    private static class TestInput{
        public int a;

        @EqualsAndHashCode.Exclude
        public int b;
    }
}
