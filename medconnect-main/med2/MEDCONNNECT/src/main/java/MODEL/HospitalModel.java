/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

public class HospitalModel {
    private int id_hospital;
    private String nome_hospital;
    private String endereco_hospital;

    public HospitalModel(int id_hospital, String nome_hospital, String endereco_hospitall) {
        this.id_hospital = id_hospital;
        this.nome_hospital = nome_hospital;       
    }

    public HospitalModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_hospital() {
        return id_hospital;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

    public String getNome_hospital() {
        return nome_hospital;
    }

    public void setNome_hospital(String nome_hospital) {
        this.nome_hospital = nome_hospital;
    }

    public String getEndereco_hospital() {
        return endereco_hospital;
    }

    public void setEndereco_hospital(String endereco_hospital) {
        this.endereco_hospital = endereco_hospital;
    }

}

/**
 *
 * @author rcosta
 */
/**
 *
 * @author rcosta
 */