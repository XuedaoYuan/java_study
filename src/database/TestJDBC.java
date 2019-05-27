package database;

import java.sql.*;

public class TestJDBC {


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

            // 用于执行sql语句
            s = c.createStatement();


          /*  for (int i = 0; i < 50; i++) {
                String sql = "insert into hero values(null, " + "'英雄'" + ", " + 50 + ")";
                s.execute(sql);
            }*/

            String sql = "select * from hero";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                int hp = rs.getInt("hp");
                System.out.printf("%d \t %s \t %d \n", id, name, hp);
            }

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
