package lombok;

import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;

public class Annotations {
    public static void main(String[] args) {
        val newMap = new HashMap<Integer, String>(); //final

        var newList = new ArrayList<Integer>();
        newList = new ArrayList<Integer>();

        System.out.println(newMap.size());

        PrivateAnnotateClass ann = new Annotations().new PrivateAnnotateClass();
        ann.setAge(2).setName("Name");
        System.out.println(ann);
    }

    @ToString
    @Getter
    @Setter @Accessors(chain = true)
    private class PrivateAnnotateClass{
        int age;
        @ToString.Exclude
        String name;
    }
}
