// import DAO.FuncionarioDAO;
// import bancoDeDados.DataBase;
// import model.Funcionario;

// import java.math.BigDecimal;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

import java.io.IOException;
import java.sql.SQLException;

import DAO.FuncionarioDAO;

/**
 * 1 -> Implemente a função de listar para que retorne todos os funcionários cadastrados.
 *      Utilize o código abaixo (linhas 48:68), mas realize os ajustes necessários:
 *          - Carregue os dados através do modelo Funcionario para, então, apresentá-los
 *          - Corrija o problema no alinhamento das colunas do relatório.
 *
 * 2 -> Implemente a função de alterar/atualizar um funcionário.
 *
 * 3 -> Implemente a função de deletar um funcionário.
 */

public class Main {
    /**
     * @param args
     * @throws IOException 
     * @throws SQLException 
     */
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