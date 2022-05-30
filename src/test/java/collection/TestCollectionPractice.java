package collection;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollectionPractice {

  @Test
  public void testExpectedOutputForSortedSet() {
    String expectedOutput = "apple banana peach ";
    CollectionPractice collectionPractice = new CollectionPractice();
    assertEquals(expectedOutput, collectionPractice.sortedSet());
  }

  @Test
  public void testExpectedOutputForLinkedHashSet() {
    String expectedOutput = "2 7 5 ";
    CollectionPractice collectionPractice = new CollectionPractice();
    assertEquals(expectedOutput, collectionPractice.linkedHashSet());
  }

  @Test
  public void testCustomEqualsHashCode() {
    int expectedSize = 1;
    int expectedValue = 2;
    CollectionPractice collectionPractice = new CollectionPractice();
    Set<CollectionPractice.CustomEqualsAndHashCodeClass> result = collectionPractice.customEqualsHashCodeWithSet();
    assertEquals(expectedSize, result.size());
    assertEquals(expectedValue, result.stream().findFirst().get().getB());
  }
}
