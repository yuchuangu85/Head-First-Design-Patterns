package headfirst.designpatterns.proxy.gumball;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
