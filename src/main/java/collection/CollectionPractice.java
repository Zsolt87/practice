package collection;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

/** Demonstrate different characteristic of different collections */
public class CollectionPractice {

  /**
   * Keeps insertion order
   *
   * @return concatenated string with insertion order
   */
  public String linkedHashSet() {
    StringBuilder output = new StringBuilder();
    Set<Integer> linkedHashSet = new LinkedHashSet<>();

    linkedHashSet.add(2);
    linkedHashSet.add(7);
    linkedHashSet.add(5);

    linkedHashSet.forEach(
        e -> {
          output.append(e);
          output.append(" ");
        });

    return output.toString();
  }

  /**
   * Sorting items in natural order
   *
   * @return concatenated string with ordered items
   */
  public String sortedSet() {
    StringBuilder output = new StringBuilder();
    SortedSet<String> sortedSet = new TreeSet<>();

    sortedSet.add("peach");
    sortedSet.add("banana");
    sortedSet.add("apple");

    sortedSet.forEach(
        e -> {
          output.append(e);
          output.append(" ");
        });

    return output.toString();
  }

  /**
   * Testing set behaviour with class using custom equals and hashcode
   * @return
   */
  public Set<CustomEqualsAndHashCodeClass> customEqualsHashCodeWithSet() {
    CustomEqualsAndHashCodeClass first = new CustomEqualsAndHashCodeClass(1, 2);
    CustomEqualsAndHashCodeClass second = new CustomEqualsAndHashCodeClass(1, 5);

    Set<CustomEqualsAndHashCodeClass> set = new HashSet<>();
    set.add(first);
    set.add(second);

    return set;
  }

  @ToString
  @EqualsAndHashCode
  @AllArgsConstructor
  @Getter
  public static class CustomEqualsAndHashCodeClass {
    private int a;
    @ToString.Exclude @EqualsAndHashCode.Exclude private int b;
  }
}
