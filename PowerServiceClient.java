

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.rmi.Naming;

public class PowerServiceClient {
    public static void main(String args[]) throws Exception
    {
        // Call registry for PowerService
        PowerServiceInterface stub = (PowerServiceInterface) Naming.lookup("rmi://localhost:5000/operators");

        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        for (;;){
            System.out.println("1 - Calculate square");
            System.out.println("2 - Calculate power");
            System.out.println("3 - Calculate sum");
            System.out.println("4 - Calculate difference");
            System.out.println("5 - Calculate product");
            System.out.println("6 - Calculate division");
            System.out.println("7 - Calculate GCD");
            System.out.println("8 - Calculate LCM");
            System.out.println("9 - Exit");

            System.out.println("Choice: ");

            String line  = d.readLine();

            Integer choice = Integer.valueOf(line);

            int value = choice.intValue();

            int num1 = 0;
            int num2 = 0;

            switch(value){
                case 1:
                    System.out.println("Number: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    value = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.square(value));

                    break;
                case 2:
                    System.out.println("Number: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    value = choice.intValue();

                    System.out.println("Power: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    int power = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.power(value, power));

                    break;
                
                case 3:
                    System.out.println("Number 1: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num1 = choice.intValue();

                    System.out.println("Number 2: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num2 = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.addition(num1, num2));

                break;

                case 4:
                    System.out.println("Number 1: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num1 = choice.intValue();

                    System.out.println("Number 2: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num2 = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.difference(num1, num2));

                break;

                case 5:
                    System.out.println("Number 1: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num1 = choice.intValue();

                    System.out.println("Number 2: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num2 = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.product(num1, num2));

                break;

                case 6:
                    System.out.println("Number 1: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num1 = choice.intValue();

                    System.out.println("Number 2: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num2 = choice.intValue();

                    BigInteger[] div = stub.division(num1, num2);
                    // Call remote method
                    System.out.println("Answer: floor: " + div[0] + " Remainder: "+ div[1]);

                break;

                case 7:
                    System.out.println("Number 1: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num1 = choice.intValue();

                    System.out.println("Number 2: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num2 = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.euclidGCD(num1, num2));

                break;

                case 8:
                    System.out.println("Number 1: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num1 = choice.intValue();

                    System.out.println("Number 2: ");
                    line = d.readLine();
                    choice = Integer.valueOf(line);
                    num2 = choice.intValue();

                    // Call remote method
                    System.out.println("Answer: " + stub.getLCM(num1, num2));

                break;

                default:
                    System.out.println("Invalid option chosen");
                    System.exit(0);
                    break;
            }
        }
    }
}
