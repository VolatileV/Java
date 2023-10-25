import java.util.Scanner;


public class age {

    public static void main(String[] args) {

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        
        if(age>=18){

            System.out.println("You can vote");

        }

        else{

            System.out.println("You cannot vote");

        }
    }
}
