

package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Employees;

/**
 *
 * @author GANZA
 */
public interface EmployeeService extends Remote{
     Employees registerEmployee(Employees employeeObj) throws RemoteException;
     List<Employees> allEmployees() throws RemoteException;
       Employees updateEmployees(Employees employeeObj) throws RemoteException;
        Employees deleteEmployees(Employees employeeObj) throws RemoteException;
        Employees searchEmployees(Employees employeeObj) throws RemoteException;
}
