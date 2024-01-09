

package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Updates;

/**
 *
 * @author GANZA
 */
public interface UpdatesService extends Remote{
     Updates registerUpdate(Updates updateObj) throws RemoteException;
     List<Updates> allUpdates() throws RemoteException;
       Updates updateUpdates(Updates updateObj) throws RemoteException;
        Updates deleteUpdates(Updates updateObj) throws RemoteException;
        Updates searchUpdates(Updates updateObj) throws RemoteException;
}
