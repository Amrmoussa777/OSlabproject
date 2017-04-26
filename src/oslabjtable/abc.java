/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslabjtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author amr
 */
public class abc {
    public abc() throws SQLException{
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer_db","APP",null);
        PreparedStatement st=con.prepareStatement("insert into CUSTOMERS(N_ID,NAME)values(?,?)");
        st.setInt(1, 1);
        st.setString(2, "amr");
        int a =st.executeUpdate();
        if (a>0) {
            System.out.println("updated");
            
        }
        
    }
    
}
