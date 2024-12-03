package com.mycompany.forca;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Random;
public class conexaoSQL {
    
    Connection c;
    Statement s;
    ResultSet rs;
    Random rand = new Random();
    
    String url = "jdbc:mysql://mysql.doctusedtech.com.br:3306/doctusedtech07";
    String user = "doctusedtech07";
    String password = "AulaUSF2024";
    //String driver = "com.mysql.jdbc.Driver";
    public String puxaPalavra() throws SQLException{
        try{
            c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();
            int n = rand.nextInt(272);
            String SQL = "SELECT T2_PALAVRA from T2_PALAVRA WHERE T2_ID =" +n;
            ResultSet result = s.executeQuery(SQL);
                    while(result.next()){
                        //System.out.println(result.getString(1));
                        return result.getString(1);
                    }
        }
            catch(SQLException e){
            System.out.println("Falha ao connectar com banco de dados" + e.toString());
            }
        return null;
    }
}
