/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.dao;

import data.impl.CategoryImpl;

/**
 *
 * @author ASUS
 */
public class Database {
    public static CategoryDao getCategoryDao(){
        return new CategoryImpl();
    }
}
