/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.swing1.DAO;

import com.Binita.swing1.entity.StudentEntry;
import java.sql.SQLException;

/**
 *
 * @author Bini
 */
public interface StudentDAO {
    int insert(StudentEntry entry)throws ClassNotFoundException,SQLException;
    
}
