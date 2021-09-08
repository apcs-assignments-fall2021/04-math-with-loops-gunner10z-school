import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int counter=1;
        int factorial=1;
        while (counter<=x){

            factorial=factorial*counter;
            counter+=1;
        }
        return factorial;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double eValue=1;
        int counter1=1;

        while ((Math.abs(Math.E-eValue))>0.0001){
            //System.out.println("test");
            double factorialValue=factorial(counter1);
            //System.out.println(factorialValue);
            eValue=eValue+(1/factorialValue);
            //System.out.println(eValue);
            counter1++;

        }
        return eValue;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double bab_root=Math.random();
        while (Math.abs(Math.sqrt(x)-bab_root)>0.00001){
            double new_bab=(bab_root + x/bab_root) / 2;
            bab_root=new_bab;
        }
        return bab_root;
    }
    
    
    public static void main(String[] args) {
        //System.out.println(factorial(5));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number(rojan, I know you are looking at this right now, I know that you secretly spy on my projects. Don't hide from me): ");
        double inp= scan.nextDouble();
        System.out.println(babylonian(inp));
        System.out.println(calculateE());


        

        scan.close();
    }
}
