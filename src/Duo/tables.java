/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duo;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author oshad
 */
public class tables {
    
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try{
        con= connectionprovider.getCon();
        st= con.createStatement();
        //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),password int(20))");
        //st.executeUpdate("insert into appuser(userRole,password) values('SUPERADMIN','2001')");
        st.executeUpdate("create table CATEGORY(CATEGORY_ID_pk varchar primary key,NAME varchar(50))");
        //st.executeUpdate("create table PRODUCT(PRODUCT_ID_pk int primary key,SIZE varchar(50),QUANTITY int(10),PRICE int(10), CATEGORY_ID_fk int(11))");
       // st.executeUpdate("create table CUSTOMER(CUSTOMER_ID_pk int primary key,NAME varchar(50),MOBILE varchar(10),ADDRESS varchar(50))");
        JOptionPane.showMessageDialog(null,"Table Created Successfully");}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);            
        }
        finally{
        try{
            con.close();
            st.close();      
            }
        catch(Exception e){}
    }
    }
}
