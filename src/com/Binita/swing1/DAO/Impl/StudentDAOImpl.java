/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.swing1.DAO.Impl;

import com.Binita.swing1.DAO.StudentDAO;
import com.Binita.swing1.entity.StudentEntry;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bini
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public int insert(StudentEntry entry) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/login", "root","");
        String sql="insert into register(first_name,last_name,email,password)values(?,?,?,?)";
        PreparedStatement statement=conn.prepareStatement(sql);
        JOptionPane.showMessageDialog(null, "connection successful");
        statement.setString(1, entry.getFname());
        statement.setString(2, entry.getLname());
        statement.setString(3, entry.getEmail());
        statement.setString(4, entry.getPassword());
        int result=statement.executeUpdate();
        conn.close();
        return result;
    }

    
}