
package data.impl;

import data.dao.CategoryDao;
import data.driver.MySQLDriver;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import model.Category;

public class CategoryImpl implements CategoryDao {

    Connection con = MySQLDriver.getConnection();

    public List<Category> findAll() {
        List<Category> lstCategory = new ArrayList<>();
        String sql = "select * from categories";

        try {
            PreparedStatement sttm = con.prepareStatement(sql);
            ResultSet rs = sttm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                lstCategory.add(new Category(id, name));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lstCategory;
    }

    public void inssert(String name) {
    }

    public void deltet(int id) {
    }

    public void update(int id, String newName) {
    }

    public Category find(int id) {
        return null;
    }
}
