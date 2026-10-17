package DAO;

import java.sql.*;

public class Mod_conexao {
    
    public static Connection  conector(){
       Connection conexao = null;
        //a linha abaixo chama o driver
        //String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/pizzariadelivery";
        
        String user ="root";
        String password = "";
        
        try{
           // Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
            
        }catch (SQLException e){
            return null;
        }
        
    }
}
