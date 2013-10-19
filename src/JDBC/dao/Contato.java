/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.dao;

import java.util.Calendar;

/**
 *
 * @author deny
 */
public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private Calendar dataNascimento;
    private Long id;

    Contato(Long id, String nome, String email, String endereco, Calendar dataNascimento){
        setId(id);
        setNome(nome);
        setEmail(email);
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", id=" + id + '}';
    }
    
}
