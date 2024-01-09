

package model;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author GANZA
 */

public class Employees implements Serializable{
      public static final long serialVersionUID = -684317273783539419L;
   // serialVersionUID = -684317273783539419
  
    private Integer eid;
    private String efName;
     private String elName;
     private String duty;
      private Integer salary;
       private String password;
       private Admin admin;
       List<Opinions> opinions=new ArrayList<>();
       
       private Set<Products> products;

    public Employees() {
    }

    public Employees(Integer eid) {
        this.eid = eid;
    }

    public Employees(Integer eid, String efName, String elName, String duty, Integer salary, String password, Admin admin, Set<Products> products) {
        this.eid = eid;
        this.efName = efName;
        this.elName = elName;
        this.duty = duty;
        this.salary = salary;
        this.password = password;
        this.admin = admin;
        this.products = products;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEfName() {
        return efName;
    }

    public void setEfName(String efName) {
        this.efName = efName;
    }

    public String getElName() {
        return elName;
    }

    public void setElName(String elName) {
        this.elName = elName;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Opinions> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinions> opinions) {
        this.opinions = opinions;
    }

    public Set<Products> getProducts() {
        return products;
    }

    public void setProducts(Set<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return  efName;
    }
       
}
