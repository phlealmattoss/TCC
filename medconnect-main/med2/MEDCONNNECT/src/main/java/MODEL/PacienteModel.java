/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.sql.Date;

public class PacienteModel {
    private int id_paciente;
    private String algomais;
    private String nome;
    private String genero;
    private String endereco;
    private String estado;
    private String telefone;
    private String email;
    private String complemento;
    private String cidade;
    private Date data_nascimento;
    private int idade;
    private String queixa;
    private String alergias;
    private String medicamentos_uso;
    private String sintomas_febre;
    private String dores_corpo;

    public PacienteModel(String algomais, String nome, String genero, String endereco, String estado_civil, String telefone,
            String email, String complemento, String cidade, Date data_nascimento, int idade, String queixa,
            String alergias, String medicamentos_uso, String sintomas_febre, String dores_corpo) {
        this.algomais = algomais;
        this.nome = nome;
        this.genero = genero;
        this.endereco = endereco;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.complemento = complemento;
        this.cidade = cidade;
        this.data_nascimento = data_nascimento;
        this.idade = idade;
        this.queixa = queixa;
        this.alergias = alergias;
        this.medicamentos_uso = medicamentos_uso;
        this.sintomas_febre = sintomas_febre;
        this.dores_corpo = dores_corpo;
    }

    public PacienteModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getalgomais() {
        return algomais;
    }

    public void setalgomais(String cpf) {
        this.algomais = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadol) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentos_uso() {
        return medicamentos_uso;
    }

    public void setMedicamentos_uso(String medicamentos_uso) {
        this.medicamentos_uso = medicamentos_uso;
    }

    public String getSintomas_febre() {
        return sintomas_febre;
    }

    public void setSintomas_febre(String sintomas_febre) {
        this.sintomas_febre = sintomas_febre;
    }

    public String getDores_corpo() {
        return dores_corpo;
    }

    public void setDores_corpo(String dores_corpo) {
        this.dores_corpo = dores_corpo;
    }
}
