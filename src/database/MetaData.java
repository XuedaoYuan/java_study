package database;

import java.sql.*;

public class MetaData {
    /*获取数据库的元数据*/
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager
                .getConnection(
                        "jdbc:mysql://127.0.0.1:3306/java?characterEncoding=UTF-8",
                        "root", "xdyuan");) {
          /*  DatabaseMetaData dbmd = c.getMetaData();
            // 获取数据库服务器产品名称
            System.out.println("数据库产品名称:\t" + dbmd.getDatabaseProductName());
            // 获取数据库服务器产品版本号
            System.out.println("数据库产品版本:\t" + dbmd.getDatabaseProductVersion());
            // 获取数据库服务器用作类别和表名之间的分隔符 如test.user
            System.out.println("数据库和表分隔符:\t" + dbmd.getCatalogSeparator());
            // 获取驱动版本
            System.out.println("驱动版本:\t" + dbmd.getDriverVersion());

            System.out.println("可用的数据库列表：");
            // 获取数据库名称
            ResultSet rs = dbmd.getCatalogs();

            while (rs.next()) {
                System.out.println("数据库名称:\t" + rs.getString(1));
            }*/


            /*事务*/
            // 关闭自动提交
            c.setAutoCommit(false);
            String sql1 = "update hero set hp=hp+1 where id = 1";
           /* PreparedStatement ps = c.prepareStatement(sql1);
            ps.execute();*/
            Statement s = c.createStatement();
            s.execute(sql1);

            String sql2 = "update hero set hp=hp+1 where id = 1";
            s.execute(sql2);
            // 手动提交
            c.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
