

package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Admin;

/**
 *
 * @author GANZA
 */
public interface AdminService extends Remote{
     Admin registerAdmin(Admin adminObj) throws RemoteException;
     List<Admin> allAdmin() throws RemoteException;
       Admin updateAdmin(Admin adminObj) throws RemoteException;
        Admin deleteAdmin(Admin adminObj) throws RemoteException;
        Admin searchAdmin(Admin adminObj) throws RemoteException;
}
