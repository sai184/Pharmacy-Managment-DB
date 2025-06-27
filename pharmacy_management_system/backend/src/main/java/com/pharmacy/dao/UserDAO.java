
package com.pharmacy.dao;
import com.pharmacy.model.User;
import java.sql.*;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    private final String url = "jdbc:oracle:thin:@your_host:1521/your_service";
    private final String username = "S25_tssb100";
    private final String password = "bm95cHDr";

    public boolean login(String user, String pass, String role) {
        String sql = "SELECT * FROM Users WHERE Username = ? AND Password = ? AND Role = ?";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user);
            stmt.setString(2, pass);
            stmt.setString(3, role);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
