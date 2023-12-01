/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author rcosta
 */
import MODEL.AtendimentoModel;

import Conexao.conexao;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class AtendimentoDAO {

    public void cadastrarAtendimento(AtendimentoModel pm) {

        String sql = "INSERT INTO Atendimento (id_paciente, id_profissional, id_hospital, data_hora, observacoes, diagnostico, tratamento_prescrito) VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

           ps.setInt(1, pm.getIdPaciente());
            ps.setInt(2, pm.getIdProfissional());
            ps.setInt(3, pm.getIdHospital());
            ps.setString(4, pm.getDataHora());
            ps.setString(5, pm.getObservacoes());
            ps.setString(6, pm.getDiagnostico());
            ps.setString(7, pm.getTratamentoPrescrito());
            ps.setInt(8, pm.getId());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Registro cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

    public List<AtendimentoModel> mostrarAtendimento() {

        String sql = "SELECT * FROM Atendimento";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<AtendimentoModel> Atendimento = new ArrayList<>();

        try {

            connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                AtendimentoModel pm = new AtendimentoModel();

                pm.setId(resultSet.getInt("id"));
                pm.setIdPaciente(resultSet.getInt("id_paciente"));
                pm.setIdProfissional(resultSet.getInt("id_profissional"));
                pm.setIdHospital(resultSet.getInt("id_hospital"));
                pm.setDataHora(resultSet.getString("data_hora"));
                pm.setObservacoes(resultSet.getString("observacoes"));
                pm.setDiagnostico(resultSet.getString("diagnostico"));
                pm.setTratamentoPrescrito(resultSet.getString("tratamento_prescrito"));

                Atendimento.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return Atendimento;
    }

    public void deletarAtendimento(int id) {

        String sql = "DELETE FROM Atendimento WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao deletar registro: " + e);

        }

    }

}

