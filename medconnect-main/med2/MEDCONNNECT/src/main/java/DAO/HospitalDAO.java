/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import MODEL.HospitalModel;

import Conexao.conexao;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HospitalDAO {

    public void CadastrarHospital(HospitalModel pm) {

        String sql = "INSERT INTO Hospital (nome_hospital, endereco_hospital) VALUES (?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, pm.getNome_hospital());
            ps.setString(2, pm.getEndereco_hospital());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Hospital cadastrado com sucesso");

        } catch (Exception exception) {

            exception.printStackTrace();

        }

    }

    public List<HospitalModel> ShowHospital() {

        String sql = "SELECT * FROM Hospital";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<HospitalModel> Hospital = new ArrayList<>();

        try {

            connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                HospitalModel pm = new HospitalModel();

                pm.setId_hospital(resultSet.getInt("id_hospital"));
                pm.setNome_hospital(resultSet.getString("nome_hospital"));
                pm.setEndereco_hospital(resultSet.getString("endereco_hospital"));

                Hospital.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return Hospital;
    }

    public void DeletarHospital(int id_hospital) {

        String sql = "DELETE FROM Hospital WHERE id_hospital = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.conexao.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_hospital);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Hospital deletado com sucesso");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em deletar hospital: " + e);

        }

    }

}

/**
 *
 * @author rcosta
 */

   
