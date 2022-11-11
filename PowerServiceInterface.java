

import java.math.BigInteger;
import java.rmi.*;

// Interface for a RMI service that calculates powers
public interface PowerServiceInterface extends Remote{
    public BigInteger square (int num)
        throws RemoteException;
    
    public BigInteger power(int base, int pow)
        throws RemoteException;
    
    public BigInteger addition(int num1, int num2)
        throws RemoteException;
    
    public BigInteger difference(int num1, int num2)
    throws RemoteException;


    public BigInteger product(int num1, int num2)
    throws RemoteException;  
    
    public BigInteger[] division(int num1, int num2)
    throws RemoteException;

    public BigInteger euclidGCD(int num1, int num2)
    throws RemoteException;

    public BigInteger getLCM(int num1, int num2)
    throws RemoteException;
}