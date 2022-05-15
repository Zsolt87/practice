package phonescreen;

public class VariableFlip {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        System.out.println(String.format("%s/%s",a,b));

        a = a + b; //13
        b = a - b; //4
        a = a - b;

        System.out.println(String.format("%s/%s",a,b));
    }
}
