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
public class TestaContatoInsere {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Wily Wonka");
        contato.setEmail("wily@oompaloompla.com");
        contato.setEndereco("R. Wonka");
        contato.setDataNascimento(Calendar.getInstance());
        
        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);
        System.out.println("Gravado");
    }
    
}
