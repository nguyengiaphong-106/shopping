/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data.dao;

import java.util.List;
import model.Category;

/**
 *
 * @author ASUS
 */
public interface CategoryDao {
    public List<Category> findAll();
    public void inssert(String name);
    public void deltet(int id);
    public void update(int id, String newName);
    public Category find(int id);
}
