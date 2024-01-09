

package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Products;

/**
 *
 * @author GANZA
 */
public interface ProductService extends Remote{
     Products registerProduct(Products productObj) throws RemoteException;
    List<Products> allProducts() throws RemoteException;
       Products updateProducts(Products productObj) throws RemoteException;
        Products deleteProducts(Products productObj) throws RemoteException;
        Products searchProducts(Products productObj) throws RemoteException;
}
