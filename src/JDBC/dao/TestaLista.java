/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.dao;

import java.util.List;

/**
 *
 * @author deny
 */
public class TestaLista {
    public static void main(String[] args) {
        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.getLista();
        
        for(Contato contato: contatos){
            System.out.println("---------------------------------");
            System.out.println("ID:"+contato.getId());
            System.out.println("Nome:"+contato.getNome());
            System.out.println("Email:"+contato.getEmail());
            System.out.println("Endereco:"+contato.getEndereco());
            System.out.println("Data de Nascimento:"+contato.getDataNascimento().getTime());
        }
    }
}

