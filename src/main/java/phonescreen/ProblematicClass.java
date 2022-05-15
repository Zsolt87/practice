package phonescreen;

import lombok.AllArgsConstructor;

public class ProblematicClass { //change to private

    public static void main(String[] args){
        System.out.println(calculateReturn(new Integer[]{12,1,2}));
        System.out.println((new ProblematicClass() //remove instance
                .new ConvertedReturn(349)
                .getConvertedReturn(calculateReturn(new Integer[]{12,1,2}))));
    }

    public static int calculateReturn(Integer[] profitInDollar){ //Remove static + add checked exception
        Integer fullProfit = 0;

        if(profitInDollar == null){
            return 0; //change to null
        }

        for(int i = 0; i <= profitInDollar.length-1; i++){ //Remove i++ and remove length-1
                fullProfit += profitInDollar[i];
        }

        return fullProfit;
    }

    @AllArgsConstructor
    private class ConvertedReturn{
        final double fxRate;

        public void setFxRate(double fxRate){
            fxRate = fxRate; //Remove final
        }

        public double getConvertedReturn(int profitInDollar){
            return fxRate * profitInDollar;
        }
    }
}
