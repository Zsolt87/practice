package phonescreen;

import java.util.Arrays;

public class InPlaceReverseWithoutTempVariable {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new Integer[]{12,35,6,7})));
    }

    public static Integer[] reverseArray(Integer[] input){
        for(int i = 0; i < input.length/2; i++){
            input[i] = input[i] + input[input.length - 1 - i];
            input[input.length - 1 - i] = input[i] - input[input.length - 1 - i];
            input[i] = input[i] - input[input.length - 1 - i];
        }

        return input;
    }
}
