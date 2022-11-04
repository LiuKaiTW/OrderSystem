
package Dao.OrderO;
import Dao.DbConnection;

import Model.Meals;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class implOrder implements OrderDao{
    
     public static void main(String[] args) {
    
    // Meals M=new Meals(1,2,3,4,5,6,7);
     //new implOrder().ordermeal(M,"cde");
     
      Meals M=new Meals(1,2,3,4,5,6,7);
     new implOrder().ordermeal2(M,17);
      //新增
      
      //查詢點餐內容，之後結合table
     /*  List<Meals> l=new implOrder().query1();
        Meals[] s1=l.toArray(new Meals[l.size()]);
        for(int i=0;i<s1.length;i++)
        {System.out.println(s1[i].getBEEF()+"\t"+s1[i].getCHICKEN());
     }*/
        
     /*   List<Meals> l=new implOrder().query1();
        Meals[] s1=l.toArray(new Meals[l.size()]);
       
        {System.out.println(s1[s1.length-1].getBEEF()+"\t"+s1[s1.length-1].getCHICKEN());
     }*/
     
     // new implOrder().delete(9);
     }
     
    public void ordermeal(Meals m,String username)
    { Connection conn=DbConnection.getDB();
            String SQL="update orderdata set milktea=?,mango=?,mocha=?,beef=?,chicken=?,pork=?,membersum=? where username=?";
        try {          
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setInt(1, m.getMILKTEA());
            ps.setInt(2, m.getMANGO());
            ps.setInt(3, m.getMOCHA());
            ps.setInt(4, m.getBEEF());
            ps.setInt(5, m.getCHICKEN());
            ps.setInt(6, m.getPORK());
            ps.setInt(7, m.getMEMBERSUM());
            ps.setString(8,username);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(implOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
//如果是會員的修改訂單方式
    public void ordermeal2(Meals m,int id)
    { Connection conn=DbConnection.getDB();
            String SQL="update orderdata set milktea=?,mango=?,mocha=?,beef=?,chicken=?,pork=?,membersum=? where ID="+id;
        try {          
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setInt(1, m.getMILKTEA());
            ps.setInt(2, m.getMANGO());
            ps.setInt(3, m.getMOCHA());
            ps.setInt(4, m.getBEEF());
            ps.setInt(5, m.getCHICKEN());
            ps.setInt(6, m.getPORK());
            ps.setInt(7, m.getMEMBERSUM());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(implOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public List<Meals> query2(String username) {
       List<Meals> l=new ArrayList();
    Connection conn=DbConnection.getDB();
    String Sql="select * from orderdata where username=?";     
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1, username);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {  Meals s=new Meals();
                s.setMILKTEA(rs.getInt("milktea"));
                s.setMANGO(rs.getInt("mango"));
                s.setMOCHA(rs.getInt("mocha"));
                s.setBEEF(rs.getInt("beef"));
                s.setCHICKEN(rs.getInt("chicken"));
                s.setPORK(rs.getInt("pork"));
                s.setMEMBERSUM(rs.getInt("membersum"));
                l.add(s);
            }
            } catch (SQLException ex) {
            Logger.getLogger(implOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
               return l;
         
    }
    
    
    //查詢總資料
   public List<Meals> query1() {
       List<Meals> l=new ArrayList();
    Connection conn=DbConnection.getDB();
    String Sql="select * from orderdata ";     
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {  Meals s=new Meals();
                s.setMILKTEA(rs.getInt("milktea"));
                s.setMANGO(rs.getInt("mango"));
                s.setMOCHA(rs.getInt("mocha"));
                s.setBEEF(rs.getInt("beef"));
                s.setCHICKEN(rs.getInt("chicken"));
                s.setPORK(rs.getInt("pork"));
                s.setMEMBERSUM(rs.getInt("membersum"));
                l.add(s);
            }
            } catch (SQLException ex) {
            Logger.getLogger(implOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
               return l;
         
    }
    
    
    //修改
   
   
    //刪除  

    @Override
    public void delete(int id) {
         Connection conn=DbConnection.getDB();
    String Sql="delete from orderdata where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(implOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
   

}