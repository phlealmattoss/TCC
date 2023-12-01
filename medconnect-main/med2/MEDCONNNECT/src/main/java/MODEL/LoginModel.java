/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author rcosta
 */
public class LoginModel {
     private String email_cpf;
    private String senha;
    
  public LoginModel() {
    }

public LoginModel(String emailCpf, String senha) {
        this.email_cpf = emailCpf;
        this.senha = senha;
    }
 public String getemail_cpf() {
        return email_cpf;
    }

    public void setemail_cpf(String email_cpf) {
        this.email_cpf = email_cpf;
}
     public String getsenha() {
        return  senha;
    }

    public void setsenha(String  senha) {
        this.senha =  senha;
    }
}