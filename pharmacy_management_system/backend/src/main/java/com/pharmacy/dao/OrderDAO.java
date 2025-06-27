package com.pharmacy.dao;

import com.pharmacy.model.Order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {
    private final String url = "jdbc:oracle:thin:@your_host:1521/your_service";
    private final String username = "S25_tssb100";
    private final String password = "bm95cHDr";

    public List<Order> getAllOrders() {
        String sql = "SELECT * FROM Orders";
        List<Order> orders = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                orders.add(new Order(rs.getInt("OrderID"), rs.getInt("CustomerID"), rs.getDate("OrderDate")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
