import java.net.MalformedURLException;
import java.rmi.*;


public class PowerServiceServer {
    public static void main(String args[]){
        try {
            PowerServiceInterface stub = new PowerService();
            try {
                Naming.rebind("rmi://localhost:5000/operators",stub);
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }  
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}
