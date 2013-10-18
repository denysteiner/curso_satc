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
public class TestaInsere {
    public static void main(String[] args) {
        //Contato contato = new Contato(1L,"Wily Wonka","wily@oompaloompla.com","R. Wonka",Calendar.getInstance());
        //Contato contato = new Contato(2L,"Maria","maria@gmail.com","R. rua",Calendar.getInstance());
        //Contato contato = new Contato(3L,"Joao","joao@gmail.com","R. rua 22",Calendar.getInstance());
        //Contato contato = new Contato(4L,"Pedro","pedro@gmail.com","R. rua 44",Calendar.getInstance());
        Contato contato = new Contato(5L,"Pedro","pedro@gmail.com","R. rua 44",Calendar.getInstance());
        
        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);
        System.out.println("Gravado");
    }
    
}
