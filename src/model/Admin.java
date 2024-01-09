

package model;

import java.io.Serializable;
import java.util.*;
import java.util.List;


/**
 *
 * @author GANZA
 */

public class Admin implements Serializable{
   public static final long serialVersionUID = 6837802604957796888L;
    private String ADID;
    private String names;
    private String adUsername;
    private String adPassword;
    
    private Updates updates;
    List<Employees> employees=new ArrayList<>();

    public Admin() {
    }

    public Admin(String ADID) {
        this.ADID = ADID;
    }

    public Admin(String ADID, String names, String adUsername, String adPassword, Updates updates) {
        this.ADID = ADID;
        this.names = names;
        this.adUsername = adUsername;
        this.adPassword = adPassword;
        this.updates = updates;
    }

    public String getADID() {
        return ADID;
    }

    public void setADID(String ADID) {
        this.ADID = ADID;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAdUsername() {
        return adUsername;
    }

    public void setAdUsername(String adUsername) {
        this.adUsername = adUsername;
    }

    public String getAdPassword() {
        return adPassword;
    }

    public void setAdPassword(String adPassword) {
        this.adPassword = adPassword;
    }

    public Updates getUpdates() {
        return updates;
    }

    public void setUpdates(Updates updates) {
        this.updates = updates;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return names;
    }
    
}
