

public class Addition {
    public int result;

    public Addition(int num1, int num2) {

        result = num1 + num2;

    }

    public Addition(float f1, float f2) {

        result = (int)(f1 + f2);

    }


    public int getResult() {
    
        return result;
    
       }

    public static void main(String[] args) {
        Addition intAddition = new Addition(45, 33);
        System.out.println("Integer Result: " + intAddition.getResult());
    
        Addition floatAddition = new Addition(4.6f, 5.4f);
        System.out.println("Float Result: " + floatAddition.getResult());

    }
    
}
