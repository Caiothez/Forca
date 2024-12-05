package com.mycompany.forca;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Random;
public class conexaoSQL {
    
    Connection c;
    Statement s;
    ResultSet rs;
    Random rand = new Random();
    int n = rand.nextInt(272);
    
    String url = "jdbc:mysql://mysql.doctusedtech.com.br:3306/doctusedtech07";
    String user = "doctusedtech07";
    String password = "AulaUSF2024";
    //String driver = "com.mysql.jdbc.Driver";
    public String puxaPalavra() throws SQLException{
        try{
            c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();            
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
    public String pegaTema() throws SQLException {
    try {
        // Conexão com o banco
        c = DriverManager.getConnection(url, user, password);
        s = c.createStatement();

        // Executar a query pra poder pegar o valor antes, porque a variavel é um comando e não uma valor né
        String queryIDTema = "SELECT T2_FK_ID_TEMA FROM T2_PALAVRA WHERE T2_ID =" + n;
        ResultSet rsIDTema = s.executeQuery(queryIDTema);

        // Verifique se há resultados
        if (rsIDTema.next()) {
            int nTema = rsIDTema.getInt("T2_FK_ID_TEMA"); // Obtenha o valor do ID do tema

            // Agora busque o nome do tema
            String queryTema = "SELECT T1_TEMA FROM T1_TEMA WHERE T1_ID =" + nTema;
            ResultSet rsTema = s.executeQuery(queryTema);

            if (rsTema.next()) {
                return rsTema.getString("T1_TEMA"); // Retorna o nome do tema
            }
        }
    } catch (SQLException e) {
        System.out.println("Falha ao conectar com banco de dados: " + e.toString());
    }
    return null;
}

}
