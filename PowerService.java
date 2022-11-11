

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.math.*;


// Server for a RMI service
public class PowerService extends UnicastRemoteObject implements PowerServiceInterface{
    PowerService() throws RemoteException{
        super();
    }
    
    // Calculate square of a number
    public BigInteger square(int num){
        String numrep = String.valueOf(num);

        BigInteger bigIntSq = new BigInteger(numrep);

        bigIntSq = bigIntSq.multiply(bigIntSq);

        return bigIntSq;
    }

    // Calculate power of a number
    public BigInteger power(int base, int pow){
        String numrep = String.valueOf(base);
        BigInteger bi = new BigInteger(numrep);

        bi = bi.pow(pow);

        return bi;
    }

    // Calculate sum of two big integer
    public BigInteger addition(int num1, int num2){
        String numrep1 = String.valueOf(num1);
        BigInteger bi1 = new BigInteger(numrep1);

        String numrep2 = String.valueOf(num2);
        BigInteger bi2 = new BigInteger(numrep2);

        BigInteger sum = bi1.add(bi2);

        return sum;
    }

     // Calculate difference of two big integer
    public BigInteger difference(int num1, int num2){
        String numrep1 = String.valueOf(num1);
        BigInteger bi1 = new BigInteger(numrep1);

        String numrep2 = String.valueOf(num2);
        BigInteger bi2 = new BigInteger(numrep2);

        BigInteger dif = bi1.subtract(bi2);

        return dif;
    }

     // Calculate product of two big integer
    public BigInteger product(int num1, int num2){
        String numrep1 = String.valueOf(num1);
        BigInteger bi1 = new BigInteger(numrep1);

        String numrep2 = String.valueOf(num2);
        BigInteger bi2 = new BigInteger(numrep2);

        BigInteger prod = bi1.multiply(bi2);

        return prod;
    }

     // Calculate quotient and remainder of two big integer
    public BigInteger[] division(int num1, int num2){
        String numrep1 = String.valueOf(num1);
        BigInteger bi1 = new BigInteger(numrep1);

        String numrep2 = String.valueOf(num2);
        BigInteger bi2 = new BigInteger(numrep2);

        BigInteger []  div = bi1.divideAndRemainder(bi2);

        return div;
    }

     // Calculate GCD of two big integer using euclidean algorithm
    public BigInteger euclidGCD(int num1, int num2){
        String numrep1 = String.valueOf(num1);
        BigInteger bi1 = new BigInteger(numrep1);

        String numrep2 = String.valueOf(num2);
        BigInteger bi2 = new BigInteger(numrep2);

        BigInteger gcd = bi1.gcd(bi2);

        return gcd;
    }

     // Calculate LCM of two big integer using euclidean algorithm
    public BigInteger getLCM(int num1, int num2)
    throws RemoteException
    {
        String numrep1 = String.valueOf(num1);
        BigInteger bi1 = new BigInteger(numrep1);

        String numrep2 = String.valueOf(num2);
        BigInteger bi2 = new BigInteger(numrep2);

        BigInteger gcd = bi1.gcd(bi2);
        BigInteger prod = product(num1, num2);

        BigInteger []  lcm = prod.divideAndRemainder(gcd);

        return lcm[0];
    }
}
