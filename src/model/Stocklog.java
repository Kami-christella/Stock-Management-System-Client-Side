package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import model.Stocklog2;
//public sql_reader As MySqlClient .MySqlDateHeader

// 
/**
 *
 * @author GANZA
 */
public class Stocklog {
      private String dbUrl="jdbc:mysql://localhost:3306/stock_mng_system_db";
     private String username="root";
      private String passwd="";
     
      
    public String adminsLogin(Stocklog2 sm) {
    try {
        Connection con = DriverManager.getConnection(dbUrl, username, passwd);
        //employees to be changed to admins
        PreparedStatement ps = con.prepareStatement("SELECT adusername, adpassword FROM admin WHERE adusername = ? AND adpassword = ?");
        ps.setString(1, sm.getAdusername());
        ps.setString(2, sm.getAdpassword());

        ResultSet rs = ps.executeQuery();
        StringBuilder result = new StringBuilder();
        int counter = 0;

        while (rs.next()) {
            counter++;
            String dusername = rs.getString("adusername");
            String password = rs.getString("adpassword");

            result.append(counter).append(") adusername: ").append(dusername).append("\n");
        }

        con.close();

        if (counter > 0) {
            return "Welcome";
        } else {
            return "Incorrect username or password";
        }

    } catch (Exception ex) {
        ex.printStackTrace();
        return "Server Error!";
    }
}
    public String recordAdmin(Stocklog2 sm){
    try{
         Connection con=DriverManager.getConnection(dbUrl,username,passwd);
         PreparedStatement ps=con.prepareStatement("insert into admins(ADID,Names,adusername,adpassword) values(?,?,?,?) ");
         ps.setString(1,sm.getADID());
         ps.setString(2,sm.getNames());
         ps.setString(3,sm.getAdusername());
         ps.setString(4, sm.getAdpassword());
          int rowAffected=ps.executeUpdate();
              con.close();
              if(rowAffected>0){
                  return "data saved";
              }else{
                  return "not data saved";
              }
    }catch(Exception ex){
        ex.printStackTrace();
    }
   return "Server Error"; 
}
     public String employeeLogin(Stocklog2 sm) {
    try {
        Connection con = DriverManager.getConnection(dbUrl, username, passwd);
        
        PreparedStatement ps = con.prepareStatement("SELECT efname, password FROM employees WHERE efname = ? AND password = ?");
        ps.setString(1, sm.getEfname());
        ps.setString(2, sm.getPassword());

        ResultSet rs = ps.executeQuery();
        StringBuilder result = new StringBuilder();
        int counter = 0;

        while (rs.next()) {
            counter++;
            String efname = rs.getString("efname");
            String password = rs.getString("password");

            result.append(counter).append(") First name: ").append(efname).append("\n");
        }

        con.close();

        if (counter > 0) {
            return "Welcome";
        } else {
            return "Incorrect username or password";
        }

    } catch (Exception ex) {
        ex.printStackTrace();
        return "Server Error!";
    }
}
public String recordEmployee(Stocklog2 sm){
    try{
         Connection con=DriverManager.getConnection(dbUrl,username,passwd);
         PreparedStatement ps=con.prepareStatement("insert into employees(efname,elname,duty,password,salary) values(?,?,?,?,?) ");
         ps.setString(1,sm.getEfname());
         ps.setString(2,sm.getElname());
         ps.setString(3,sm.getDuty());
         ps.setDouble(4, sm.getSalary());
         ps.setString(5,sm.getPassword());
          int rowAffected=ps.executeUpdate();
              con.close();
              if(rowAffected>0){
                  return "data saved";
              }else{
                  return "not data saved";
              }
    }catch(Exception ex){
        ex.printStackTrace();
    }
   return "Server Error"; 
}
//     public String updateEmployee(Stocklog2 sOb){
//        try{
//             Connection con = DriverManager.getConnection(dbUrl, username, passwd);
//            String sql="update employees set efname=?,elname=?,duty=?,password=?,salary=? where Eid=?";
//            PreparedStatement pst = con.prepareStatement(sql);
//           pst.setString(1, sOb.getEfname());
//           pst.setString(2, sOb.getElname());
//           pst.setString(3,sOb.getDuty());
//           pst.setString(4,sOb.getPassword());
//          pst.setInt(5,sOb.getSalary());
//            pst.setInt(6,sOb.getEid());
//           //pst.setString(1, bookObj.getBookId());
//           int rowsAffected = pst.executeUpdate();
//           con.close();
//           if(rowsAffected>=1){
////              con.close();
//               return "Data updated Successful";
//           }else{
//             con.close();
//               return "Data Not Saved";
//           }
//            
//        }catch(Exception ex){
//            ex.printStackTrace();
//           return "Server Error!";
//        }
//     
//    }
      public String recordProduct(Stocklog2 sm){
          try{
              Connection con=DriverManager.getConnection(dbUrl,username,passwd);
             Statement st=con.createStatement();
              PreparedStatement ps=con.prepareStatement("insert into product (pname,pid, quantity,deliverydate,expirydate,cp,sp) values(?,?,?,?,?,?,?)");
              ps.setString(1, sm.getPname());
              ps.setInt(2, sm.getPid());
              ps.setInt(3, sm.getQuantity());
              ps.setString(4, sm.getDdate()); 
              ps.setString(5, sm.getEdate());
              ps.setInt(6, sm.getSp());
              ps.setInt(7, sm.getCp());
              int rowAffected=ps.executeUpdate();
            
              
             // String sql="select pname from product where pname='"+sm.getPname()+"'";
//              ResultSet rs;
//              rs = st.executeQuery(sql);
        //  {
                 if(rowAffected>0){
                  return "data saved";
              }else{
                  return "not data saved";
              } 
                 
              //}
             
          }catch(Exception ex){
              ex.printStackTrace();
            
          }
          return "server error!";
           
      } 
      public String updateProduct(Stocklog2 sOb){
           try{
             Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql="update product set pname=?, quantity=?,deliverydate=?,expirydate=?,cp=?,sp=? where pid=?";
            PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, sOb.getPname());
           pst.setInt(2, sOb.getQuantity());
           pst.setString(3,sOb.getDdate());
           pst.setString(4,sOb.getEdate());
          pst.setInt(5,sOb.getCp());
            pst.setInt(6,sOb.getSp());
             pst.setInt(7,sOb.getPid());
           //pst.setString(1, bookObj.getBookId());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data updated Successful";
           }else{
             con.close();
               return "Data Not Saved";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
           return "Server Error!";
        }
      }
      

    public String updateEmployee(Stocklog2 sOb) {
        try{
             Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql="update employees set efname=?,elname=?,duty=?,password=?,salary=? where Eid=?";
            PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, sOb.getEfname());
           pst.setString(2, sOb.getElname());
           pst.setString(3,sOb.getDuty());
           pst.setString(4,sOb.getPassword());
          pst.setDouble(5,sOb.getSalary());
            pst.setInt(6,sOb.getEid());
           //pst.setString(1, bookObj.getBookId());
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data updated Successful";
           }else{
             con.close();
               return "Data Not Saved";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
           return "Server Error!";
        }
    }
     public String deleteEmployee(Stocklog2 sobj){
        try{
              Connection con = DriverManager.getConnection(dbUrl, username, passwd);
              String sql="delete from employees where Eid=?";
              PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, sobj.getEid());
            int rowsAffected = ps.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data deleted Successful";
           }else{
             con.close();
               return "Data Not deleted";
           }
        }catch(Exception ex){
            
        }
                   return "Server Error!";

    }
         public String deleteOp(Stocklog2 sObj){
        try{
              Connection con = DriverManager.getConnection(dbUrl, username, passwd);
              String sql="delete from eopinions where Eid=?";
              PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, sObj.getEid());
            int rowsAffected = ps.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data deleted Successful";
           }else{
             con.close();
               return "Data Not deleted";
           }
        }catch(Exception ex){
            
        }
                   return "Server Error!";

    }
     
      
//      public Stocklog2 searchEmployee(Stocklog2 sObj){
//        try{
//            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
//            String sql ="select * from employees where Eid=?";
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setInt(1,sObj.getEid());
//            ResultSet rs = st.executeQuery();
//            Stocklog2 sm = new Stocklog2();
//            boolean flag = false;
//            while(rs.next()){
//                sm.setEfname(rs.getString("efname"));
//                sm.setElname(rs.getString("elname"));
//                sm.setDuty(rs.getString("Duty"));
//                // space for salary
//                sm.setPassword(rs.getString("password"));
//                flag=true;
//            }
//            con.close();
//            if(flag){
//                return sm;
//            }
////            while(rs.next()){
////                theBook.setBookid(rs.getString("book_id"));
////                theBook.setTitle(rs.getString("title"));
////                con.close();
////                return theBook;
////            }
//
//            
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return null;
//    }

    /**
     *
     * @param sObj
     * @return
     */
    public Stocklog2 searchEmployee(Stocklog2 sObj) {
 try{
     Stocklog2 sm;
            boolean flag;
     try (Connection con = DriverManager.getConnection(dbUrl, username, passwd)) {
         String sql ="select * from employees where Eid=?";
         PreparedStatement st = con.prepareStatement(sql);
         st.setInt(1,sObj.getEid());
         ResultSet rs = st.executeQuery();
         sm = new Stocklog2();
         flag = false;
         while(rs.next()){
             sm.setEfname(rs.getString("efname"));
             sm.setElname(rs.getString("elname"));
             sm.setDuty(rs.getString("Duty"));
             // space for salary
             sm.setPassword(rs.getString("password"));
             flag=true;
         }
     }
            if(flag){
                return sm;
            }            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public Stocklog2 searchAdmin(Stocklog2 sObj) {
 try{
     Stocklog2 sm;
            boolean flag;
     try (Connection con = DriverManager.getConnection(dbUrl, username, passwd)) {
         String sql ="select * from admin where Employer_ID=?";
         PreparedStatement st = con.prepareStatement(sql);
         st.setString(1,sObj.getADID());
         ResultSet rs = st.executeQuery();
         sm = new Stocklog2();
         flag = false;
         while(rs.next()){
             sm.setADID(rs.getString("Employer_ID"));
             sm.setNames(rs.getString("names"));
             sm.setAdusername(rs.getString("adUsername"));
             sm.setAdpassword(rs.getString("adPassword"));
            
             flag=true;
         }
     }
            if(flag){
                return sm;
            }            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Stocklog2 searchProduct(Stocklog2 sObj) {
 try{
     Stocklog2 sm;
            boolean flag;
     try (Connection con = DriverManager.getConnection(dbUrl, username, passwd)) {
         String sql ="select * from product where pId=?";
         PreparedStatement st = con.prepareStatement(sql);
         st.setString(1,sObj.getADID());
         ResultSet rs = st.executeQuery();
         sm = new Stocklog2();
         flag = false;
         while(rs.next()){
             
             
             sm.setADID(rs.getString("ADID"));
             sm.setNames(rs.getString("Names"));
             sm.setAdusername(rs.getString("adusername"));
             sm.setAdpassword(rs.getString("adpassword"));
            
             flag=true;
         }
     }
            if(flag){
                return sm;
            }            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
      public String updateAdmin(Stocklog2 sm){
        try{
             Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql="update admins set Names=?,adusername=?,adpassword=? where ADID=?";
            PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, sm.getNames());
             pst.setString(2, sm.getAdusername());
               pst.setString(3, sm.getAdpassword());
                 pst.setString(4, sm.getADID());
         ;
           int rowsAffected = pst.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data updated Successful";
           }else{
             con.close();
               return "Data Not Saved";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
           return "Server Error!";
        }
     
    }
     public String deleteAdmin(Stocklog2 sm){
        try{
              Connection con = DriverManager.getConnection(dbUrl, username, passwd);
              String sql="delete from admins where ADID=?";
              PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, sm.getADID());
            int rowsAffected = ps.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data deleted Successful";
           }else{
             con.close();
               return "Data Not deleted";
           }
        }catch(Exception ex){
            
        }
                   return "Server Error!";

    }
       public String deleteProduct(Stocklog2 sm){
        try{
              Connection con = DriverManager.getConnection(dbUrl, username, passwd);
              String sql="delete from product where pid=?";
              PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, sm.getPid());
            int rowsAffected = ps.executeUpdate();
           con.close();
           if(rowsAffected>=1){
//              con.close();
               return "Data deleted Successful";
           }else{
             con.close();
               return "Data Not deleted, Id is not correct!";
           }
        }catch(Exception ex){
            
        }
                   return "Server Error!";

    }
     public String workUpdatesInfo(Stocklog2 sm){
          try{
              Connection con=DriverManager.getConnection(dbUrl,username,passwd);
             
              PreparedStatement ps=con.prepareStatement("insert into workupdates (Date,workUpdates) values(?,?)");
              ps.setString(1, sm.getUpdDate());
              ps.setString(2, sm.getWorkUpdates());
              int rowAffected=ps.executeUpdate();
              con.close();
              if(rowAffected>0){
                  return "data saved";
              }else{
                  return "not data saved";
              }
          }catch(Exception ex){
              ex.printStackTrace();
            
          }
            return "server error";
     }
public String recordEmpOpinions(Stocklog2 sm){
     try{
              Connection con=DriverManager.getConnection(dbUrl,username,passwd);
             
              PreparedStatement ps=con.prepareStatement("insert into opinions (Eid,Names,TelNumber,email,opinion) values(?,?,?,?,?)");
              ps.setInt(1, sm.getEid());
              ps.setString(2, sm.getOpNames());
                ps.setInt(3,sm.getTelNummber());
                ps.setString(4,sm.getEmail());
                 ps.setString(5,sm.getOpinion());
              int rowAffected=ps.executeUpdate();
              con.close();
              if(rowAffected>0){
                  return "Your opinion is recorded";
              }else{
                  return "Your opinion is not recorded";
              }
          }catch(Exception ex){
              ex.printStackTrace();
            
          }
            return "server error";
}
  
    public List<Stocklog2> allEOpinions(){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, passwd);
           String sql="select * from opinions";
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet res = ps.executeQuery();
           List<Stocklog2> opList = new ArrayList<>();
           while(res.next()){
               Stocklog2 sm = new Stocklog2();
               sm.setEid(res.getInt("Eid"));
               sm.setNames(res.getString("Names"));
                sm.setTelNummber(res.getInt("TelNumber"));
                 sm.setEmail(res.getString("email"));
                  sm.setOpinion(res.getString("opinion"));
               opList.add(sm);
           }
           con.close();
           return opList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
       public List<Stocklog2> allWorkUpdates(){
       try{
           Connection con = DriverManager.getConnection(dbUrl, username, passwd);
           String sql="select * from updates";
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet res = ps.executeQuery();
           List<Stocklog2> opList = new ArrayList<>();
           while(res.next()){
               Stocklog2 sm = new Stocklog2();
               sm.setUpdDate(res.getString("Date"));
               sm.setWorkUpdates(res.getString("workUpdates"));
               opList.add(sm);
           }
           con.close();
           return opList;
       }catch(Exception ex){
           ex.printStackTrace();
           return null;
       }
   }
//    public Stocklog2 searchEmployee(StockDao sObj) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public List<Stocklog2> deleteOp() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   



   
      
}
