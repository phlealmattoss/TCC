/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author rcosta
 */
public class AtendimentoModel {
    private int id;
    private int idPaciente;
    private int idProfissional;
    private int idHospital;
    private String dataHora;
    private String observacoes;
    private String diagnostico;
    private String tratamentoPrescrito;

    public AtendimentoModel() {
    }

    public AtendimentoModel(int id, int idPaciente, int idProfissional, int idHospital, String dataHora, String observacoes, String diagnostico, String tratamentoPrescrito) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idProfissional = idProfissional;
        this.idHospital = idHospital;
        this.dataHora = dataHora;
        this.observacoes = observacoes;
        this.diagnostico = diagnostico;
        this.tratamentoPrescrito = tratamentoPrescrito;
    }

    // getters e setters para cada campo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamentoPrescrito() {
        return tratamentoPrescrito;
    }

    public void setTratamentoPrescrito(String tratamentoPrescrito) {
        this.tratamentoPrescrito = tratamentoPrescrito;
    }
}