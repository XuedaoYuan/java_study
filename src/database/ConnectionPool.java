package database;

import java.sql.*;
import java.util.*;

public class ConnectionPool {
    List<Connection> cs = new ArrayList<>();
    int size;

    public ConnectionPool(int size) {
        this.size = size;
        this.init();
    }

    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            for (int i = 0; i < size; i++) {
                Connection c = DriverManager
                        .getConnection(
                                "jdbc:mysql://127.0.0.1:3306/java?characterEncoding=UTF-8",
                                "root", "xdyuan");
                cs.add(c);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        while (cs.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Connection c = cs.remove(0);
        return c;
    }

    public synchronized void returnConnection(Connection c) {
        cs.add(c);
        this.notifyAll();
    }
}
