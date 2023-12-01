/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author rcosta
 */import MODEL.PacienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PacienteDAO {

    public void CadastrarPaciente(PacienteModel pm) {

        String sql = "INSERT INTO paciente (cpf, nome, genero, endereco, estado_civil, telefone, email, complemento, cidade, "
                   + "data_nascimento, idade, queixa, alergias, medicamentos_uso, sintomas_febre, dores_corpo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, pm.getCpf());
            ps.setString(2, pm.getNome());
            ps.setString(3, pm.getGenero());
            ps.setString(4, pm.getEndereco());
            ps.setString(5, pm.getEstado_civil());
            ps.setString(6, pm.getTelefone());
            ps.setString(7, pm.getEmail());
            ps.setString(8, pm.getComplemento());
            ps.setString(9, pm.getCidade());
            ps.setDate(10, new java.sql.Date(pm.getData_nascimento().getTime()));
            ps.setInt(11, pm.getIdade());
            ps.setString(12, pm.getQueixa());
            ps.setString(13, pm.getAlergias());
            ps.setString(14, pm.getMedicamentos_uso());
            ps.setString(15, pm.getSintomas_febre());
            ps.setString(16, pm.getDores_corpo());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public List<PacienteModel> ShowPacientes() {

        String sql = "SELECT * FROM paciente";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<PacienteModel> pacientes = new ArrayList<>();

        try {

            connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

               PacienteModel pm = new PacienteModel();

                pm.setId_paciente(resultSet.getInt("id_paciente"));
                pm.setCpf(resultSet.getString("cpf"));
                pm.setNome(resultSet.getString("nome"));
                pm.setGenero(resultSet.getString("genero"));
                pm.setEndereco(resultSet.getString("endereco"));
                pm.setEstado_civil(resultSet.getString("estado_civil"));
                pm.setTelefone(resultSet.getString("telefone"));
                pm.setEmail(resultSet.getString("email"));
                pm.setComplemento(resultSet.getString("complemento"));
                pm.setCidade(resultSet.getString("cidade"));
                pm.setData_nascimento(resultSet.getDate("data_nascimento"));
                pm.setIdade(resultSet.getInt("idade"));
                pm.setQueixa(resultSet.getString("queixa"));
                pm.setAlergias(resultSet.getString("alergias"));
                pm.setMedicamentos_uso(resultSet.getString("medicamentos_uso"));
                pm.setSintomas_febre(resultSet.getString("sintomas_febre"));
                pm.setDores_corpo(resultSet.getString("dores_corpo"));

                pacientes.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pacientes;
    }

    public void DeletarPaciente(int idPaciente) {

        String sql = "DELETE FROM paciente WHERE id_paciente = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, idPaciente);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Paciente deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao deletar paciente: " + e);

        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
