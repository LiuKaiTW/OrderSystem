
package Dao.OrderO;

import Model.Meals;
import java.util.List;


public interface OrderDao {
    //點餐，會自動抓會員名稱，來更新客戶的點餐內容
    void ordermeal(Meals m,String username);
    //查詢訂單，出現該使用者的點餐內容
    public List<Meals> query1(); //總資料
    List<Meals> query2(String username);//選擇特定客戶的資料
    
       //刪除
    void delete(int id);
    
}
