

package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Opinions;

/**
 *
 * @author GANZA
 */
public interface OpinionService extends Remote{
     Opinions registerOpinion(Opinions opinionObj) throws RemoteException;
      List<Opinions> allOpinions() throws RemoteException;
       Opinions updateOpinions(Opinions opinionObj) throws RemoteException;
        Opinions deleteOpinions(Opinions opinionObj) throws RemoteException;
        Opinions searchOpinions(Opinions opinionObj) throws RemoteException;
}
