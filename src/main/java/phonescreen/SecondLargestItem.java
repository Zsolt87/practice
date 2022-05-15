package phonescreen;

import java.util.List;

public class SecondLargestItem {

    public static void main(String[] args) {
        System.out.println(new SecondLargestItem().getSecondLargestNumber(new Integer[]{5,4,3,2,1,6,9,11,4})); //9
        System.out.println(new SecondLargestItem().getSecondLargestNumber(new Integer[]{1,2,3,4,5})); //4
        System.out.println(new SecondLargestItem().getSecondLargestNumber(new Integer[]{5,4,3,2,1})); //4
        System.out.println(new SecondLargestItem().getSecondLargestNumber(new Integer[]{1})); //-1
        System.out.println(new SecondLargestItem().getSecondLargestNumber(new Integer[]{2,2})); //-1
        System.out.println(new SecondLargestItem().getSecondLargestNumber(new Integer[]{2,2,1})); //1
    }

    public Integer getSecondLargestNumber(Integer[] input){
        if(input == null){
            throw new IllegalArgumentException("Input is not valid");
        }

        int max = -1;
        int secondMax = -1;

        for(int i = 0; i < input.length; i++){
            if(max < input[i]){
                secondMax = max;
                max = input[i];
            }
            if(max != -1 && secondMax == -1 && input[i] != max){
                secondMax = input[i];
            }
        }

        return secondMax;
    }
}
