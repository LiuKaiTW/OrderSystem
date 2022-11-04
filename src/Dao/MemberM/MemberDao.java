
package Dao.MemberM;

import Model.Member;
import java.util.List;


public interface MemberDao {
    //新增
    void add(Member m);
    //查詢
    boolean query(String username,String password);//帳號密碼
    boolean query(String username);//帳號重複
    List<Member> querySum();//調閱總資料
    //修改
    
    //刪除
    public void delete(int id);
}
