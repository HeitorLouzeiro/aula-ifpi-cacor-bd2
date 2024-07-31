package test;

import java.io.IOException;
import java.sql.SQLException;

import DAO.FuncionarioDAO;

/**
 * FuncionarioTest
 */
public class FuncionarioTest {

    public static void main(String[] args) throws SQLException, IOException {
        listarFuncionarios();
        
    }

    private static void listarFuncionarios() throws SQLException, IOException {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        try {
            System.out.println("listando funcionarios.");
            funcionarioDAO.getFuncionarios();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}