package stream;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.IntStream.range;

@Slf4j
public class CustomStream {

    public static void main(String[] args) {
        new CustomStream().generateIntWithString();
        new CustomStream().matchTest();
        new CustomStream().collectorGroup();
        new CustomStream().testMap();
    }

    private void generateIntWithString(){
        range(1,5)
                .map( i -> i*2)
                .mapToObj(i -> "Alma"+i)
                .forEach(System.out::println);
    }

    private void matchTest(){
        range(1,5)
                .filter( i -> i < 4)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private void collectorGroup(){
        val personList = Arrays.asList(new Person(2), new Person(3), new Person(44));

        Map<Boolean, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(p -> p.age % 2 == 0));
        System.out.println(collect);
    }

    private void testMap(){
        log.info("Starting {}", "testMap");
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .stream().mapToObj( p -> new CustomStream())
                .forEach(System.out::println);  // 3

    }

    @AllArgsConstructor
    @ToString
    private class Person{
        int age;
    }
}
