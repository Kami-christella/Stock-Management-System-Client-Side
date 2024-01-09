package model;



/**
 *
 * @author GANZA
 */
public class Stocklog2 {
    private String pname;
    private int pid;
    private int quantity;
     private String ddate;
      private String edate;
      private int cp;
      private int sp;
      private int Eid;
        private String efname;
          private String elname;
            private String duty;
             private double salary;
             private String password;
             private String ADID;
             private String names;
             private String adusername;
             private String adpassword;
             private String updDate;
             private String workUpdates;
             private String opNames;
             private int telNummber;
             private String email;
             private String opinion;
            
             public Stocklog2(){
                 
             }

   

    public Stocklog2(String pname, int pid, int quantity, String ddate, String edate, int cp, int sp, String efname, String elname, String duty,String password, int salary) {
        this.pname = pname;
        this.pid = pid;
        this.quantity = quantity;
        this.ddate = ddate;
        this.edate = edate;
        this.cp = cp;
        this.sp = sp;
        this.efname = efname;
        this.elname = elname;
        this.duty = duty;
        this.salary = salary;
        this.password=password;
    }

   

    public Stocklog2(int Eid) {
        this.Eid = Eid;
    }

    public Stocklog2(String ADID, String names, String adusername, String adpassword) {
        this.ADID = ADID;
        this.names = names;
        this.adusername = adusername;
        this.adpassword = adpassword;
    }

    

    public Stocklog2(String updDate, String workUpdates, String opNames, int telNummber, String email, String opinion) {
        this.updDate = updDate;
        this.workUpdates = workUpdates;
        this.opNames = opNames;
        this.telNummber = telNummber;
        this.email = email;
        this.opinion = opinion;
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate;
    }

    public String getWorkUpdates() {
        return workUpdates;
    }

    public void setWorkUpdates(String workUpdates) {
        this.workUpdates = workUpdates;
    }

    public String getOpNames() {
        return opNames;
    }

    public void setOpNames(String opNames) {
        this.opNames = opNames;
    }

    public int getTelNummber() {
        return telNummber;
    }

    public void setTelNummber(int telNummber) {
        this.telNummber = telNummber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
    

    public int getEid() {
        return Eid;
    }

    public void setEid(int Eid) {
        this.Eid = Eid;
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

    public String getAdusername() {
        return adusername;
    }

    public void setAdusername(String adusername) {
        this.adusername = adusername;
    }

    public String getAdpassword() {
        return adpassword;
    }

   public void setAdpassword(String adpassword) {
       this.adpassword = adpassword;
    }
    
     public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public int getPid() {
//        return pid;
//    }

    public void setPid(int pid) {
        this.pid = pid;
    }

//    public int getQuantity() {
//        return quantity;
//    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public String getEfname() {
        return efname;
    }

    public void setEfname(String efname) {
        this.efname = efname;
    }

    public String getElname() {
        return elname;
    }

    public void setElname(String elname) {
        this.elname = elname;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPid() {
           return pid;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getQuantity() {
          return quantity;
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setAdusername() {
        return this.adusername = adusername;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         
    }
//
//    public Object setSp() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object setCp() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object setQuantity() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object setPid() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   
             
}
