package com.pharmacy.dao;

import com.pharmacy.model.Medicine;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MedicineDAO {
    private final String url = "jdbc:oracle:thin:@your_host:1521/your_service";
    private final String username = "S25_tssb100";
    private final String password = "bm95cHDr";

    public List<Medicine> getAllMedicines() {
        String sql = "SELECT * FROM Medicines";
        List<Medicine> medicines = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                medicines.add(new Medicine(rs.getInt("MedicineID"), rs.getString("Name"), rs.getDouble("Price"), rs.getInt("Quantity")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicines;
    }
}
