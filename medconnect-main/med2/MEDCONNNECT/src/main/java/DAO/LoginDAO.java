package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import MODEL.LoginModel;

import Conexao.conexao;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    public void CadastrarLogin(LoginModel pm) {

        String sql = "INSERT INTO login (email_cpf,senha) VALUES (?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, pm.getemail_cpf());
            ps.setString(2, pm.getsenha());
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "Login com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }
     public List<LoginModel> ShowLogin() {

        String sql = "SELECT * FROM login";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<LoginModel> Login= new ArrayList<>();

        try {

             connection = Conexao.conexao.ConexaoSQL();
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                LoginModel pm = new LoginModel();

               
                pm.setemail_cpf(resultSet.getString("Email/CPF"));
                pm.setsenha(resultSet.getString("Senha"));

               Login.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return Login;
    }

    public void DeletarAlunos(int id) {

        String sql = "DELETE FROM login WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

             connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "login deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em deletar login: " + e);

        }

    }

}