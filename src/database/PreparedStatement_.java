package database;

import java.sql.*;

public class PreparedStatement_ {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据驱动加载成功");

            c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/java?characterEncoding=UTF-8",
                            "root", "xdyuan");
            System.out.println("链接成功:" + c);
            String sql = "insert into hero values(null,?,?)";
            // 根据sql语句创建PreparedStatement
            PreparedStatement ps = c.prepareStatement(sql);

            // 设置参数
            ps.setString(1, "VN");
            ps.setInt(2, 500);
            // 执行sql
            ps.execute();
            /*
            * execute 返回true表示查询， 其余是false
            * executeUpdate 返回Int表示受影响的条数
            * */


        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
