package DAO;

import bancoDeDados.DataBase;

import java.io.IOException;
import java.sql.*;

public class FuncionarioDAO {
    private Connection connection;

    public FuncionarioDAO () throws SQLException, IOException {
        connection = DataBase.getInstance().getConnection();
    }

    public void getFuncionarios() {
        String sql = "SELECT * FROM funcionarios";
        
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                System.out.println(
                    "Nome: " + resultSet.getString("nome") + 
                    " Data de Nascimento: " + resultSet.getDate("data_nasc") + 
                    " Salario: " + resultSet.getDouble("salario") +
                    " Data de Registro: " + resultSet.getDate("data_registro") + 
                    " Ativo: " + resultSet.getString("cadastro_ativo")
                    );
            }
        } catch (SQLException e) {
            System.err.println("Erro ao obter funcionários: " + e.getMessage());
        }
    }
}
