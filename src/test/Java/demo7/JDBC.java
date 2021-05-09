package demo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC {
    public static void main(String[] args) throws Exception {
        DbUtil d=new DbUtil();
        d.getcon();
        d.closecon(DbUtil.re,DbUtil.st,DbUtil.con);
    }
}
class DbUtil {
    //static String URL ="jdbc:mysql://localhost:3306/zhourun";
    static String URL ="jdbc:mysql://localhost:3306/java";
    //private String dburl = "jdbc:mysql://localhost:3306/qg_addressbook?useUnicode=true&characterEncoding=utf8";
    public static String dbUsername = "root";//用户
    public static String dbPassword = "123456";//密码
    public static String jdbcname = "com.mysql.jdbc.Driver";//驱动名称
    public static Connection con = null;
    public static Statement st=null;
    public static ResultSet re=null;

    //获取数据库连接
    public  void getcon() throws Exception {
        try {
            Class.forName(jdbcname);      //加载驱动
        }catch(Exception e) {
            e.printStackTrace();    //打印异常
        }
        try {//获取连接
            con = DriverManager.getConnection(URL, dbUsername, dbPassword);
        }catch(SQLException e) {
            e.printStackTrace();   //打印异常
        }
        //return con;//这个con是代表着连接对象，连接对话，

        //对数据库操作
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sql="SELECT * FROM students";
        String sql1 = "INSERT INTO students(Snumber,Sname,Sage)VALUES(1841330105,'rain',19)";
        String sql2="UPDATE students SET Snumber=1841330103 WHERE Snumber=1841330104";
        String sql3="DELETE FROM students WHERE Snumber=1841330105";

        st=con.createStatement();
        int row=st.executeUpdate(sql1);   //SQL查询更新了多少行
        //System.out.println(len);

        re=st.executeQuery(sql);
        while (re.next()){
            System.out.println(re.getInt(1));
            System.out.println(re.getString("Sname"));
            System.out.println(re.getInt(3));
        }

    }

    //关闭数据库连接
    public void closecon(ResultSet re,Statement st,Connection con)
    {
        if(con != null)
        {
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }          //关闭数据库
        }
        if(re!=null)
        {
            try {
                re.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(st!=null)
        {
            try {
                st.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
