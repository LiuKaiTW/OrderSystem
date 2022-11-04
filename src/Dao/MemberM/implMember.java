
package Dao.MemberM;
import Dao.DbConnection;

import Model.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;



public class implMember implements MemberDao{

   
    public static void main(String[] args) {
        int memberid=0;
     //新增帳號的流程
     //Member M=new Member("cde","456","09456");
     //new implMember().add(M);
     //確認帳號密碼
     //System.out.println(new implMember().query("cde", "456"));
     //確認帳號是否註冊過
     //System.out.println(new implMember().query("de"));
     String username="andrew";
      List<Member> l=new implMember().querySum2(username);
       Member[] s1=l.toArray(new Member[l.size()]);
        for(int i=0;i<s1.length;i++)
        {System.out.println(s1[i].getID()+"\t"+s1[i].getUSERNAME());
       
        }
      // System.out.println( memberid=s1[s1.length-1].getID());
   //  System.out.println(""+memberid);
     /*if(new implMember().query(username) )
     {Member M=new Member(username,"setted","setted");
      new implMember().add(M);
     }*/
     
    }

    @Override //註冊帳號密碼
     public void add(Member m) {
         Connection conn=DbConnection.getDB();
            String SQL="insert into orderdata(username,password,phone) values(?,?,?)";
        try {          
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setString(1, m.getUSERNAME());
            ps.setString(2, m.getPASSWORD());
            ps.setString(3, m.getPHONE());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override //確認帳號密碼是否是資料庫的內容
    public boolean query(String username, String password) {
      boolean x=false;
      Connection conn=DbConnection.getDB();
      String SQL="select* from orderdata where username=? and password=?";
        try {
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) x=true;
            
        } catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
       return x;   }

    @Override //檢查註冊的帳號是否重複
    public boolean query(String username) {
        Connection conn=DbConnection.getDB();
        String Sql="select * from orderdata where username=?";
       boolean x=false;
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1, username);
          
            ResultSet rs=ps.executeQuery();            
            if(rs.next()) x=true;
            
        } catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        return x; }
    
    //調閱帳戶資訊
    public List<Member> querySum() {
        List<Member> l=new ArrayList();
       Connection conn=DbConnection.getDB();
       String sql="select * from orderdata ";
       
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();//database資料,rs--->student
            while(rs.next())//每一筆
            {
                Member s=new Member();//空白資料的 student
                s.setID(rs.getInt("id"));
                s.setUSERNAME(rs.getString("username"));
                s.setPASSWORD(rs.getString("password"));

            l.add(s);//新增student物件
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
            }
    
     public List<Member> querySum2(String username) {
        List<Member> l=new ArrayList();
       Connection conn=DbConnection.getDB();
       String sql="select * from orderdata where username='"+username+"'";
       
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();//database資料,rs--->student
            while(rs.next())//每一筆
            {
                Member s=new Member();//空白資料的 student
                s.setID(rs.getInt("id"));
                s.setUSERNAME(rs.getString("username"));
                s.setPASSWORD(rs.getString("password"));

            l.add(s);//新增student物件
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
            }
    
    @Override
    public void delete(int id) {
         Connection conn=DbConnection.getDB();
    String Sql="delete from student where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}