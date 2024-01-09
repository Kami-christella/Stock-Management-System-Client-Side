
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author GANZA
 */

public class Updates implements Serializable{
      public static final long serialVersionUID =-2628138898402207054L;

 //  -2628138898402207054, local class serialVersionUID = 8801440613891283098
    private Integer updN;
    // change date into string data type;
   private String date;
   private String workUpdates;
   private Admin admin;

    public Updates() {
    }

    public Updates(Integer updN) {
        this.updN = updN;
    }

    public Updates(Integer updN, String date, String workUpdates, Admin admin) {
        this.updN = updN;
        this.date = date;
        this.workUpdates = workUpdates;
        this.admin = admin;
    }

    public Integer getUpdN() {
        return updN;
    }

    public void setUpdN(Integer updN) {
        this.updN = updN;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWorkUpdates() {
        return workUpdates;
    }

    public void setWorkUpdates(String workUpdates) {
        this.workUpdates = workUpdates;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

//    public void setDate(String eDate) {
//         this.date = date;
//      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
   
}
