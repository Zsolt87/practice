package functionalinterface;

import lombok.val;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class FunctionalInterfacePractice {
    private static Integer alma = Integer.valueOf(5);

    private Integer korte = 5;

    private IntFunction<Integer> intFunction = p -> p*2;

    public static void main(String[] args) {
        val innerInstance = new FunctionalInterfacePractice().new InnerClass();
        Function f = innerInstance.doubleIt;

        innerInstance.foo();
        System.out.println(String.format("%d", f.andThen(f).apply(alma)));

        System.out.println(String.format("%s", innerInstance
                        .ifAlmaEqualsFive
                        .or(innerInstance.ifAlmaCanBeDividedByTwo)
                        .test(new FunctionalInterfacePractice())));
    }

    private class InnerClass{
        private Function<Integer, Integer> doubleIt = p -> p*2;
        private Predicate<FunctionalInterfacePractice> ifAlmaEqualsFive = p->p.korte==5;
        private Predicate<FunctionalInterfacePractice> ifAlmaCanBeDividedByTwo = p->p.korte%2==0;

        public void foo(){
            alma = 3;
        }
    }
}
