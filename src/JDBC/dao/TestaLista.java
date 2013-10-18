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
        String quebralinha, quebrarlinha;
        
        quebrarlinha = "N";
        
        if (quebrarlinha.equals("S")) {
            quebralinha = "\n";
        } else {
            quebralinha = " | ";
        }
        for(Contato contato: contatos){
            if (quebralinha.equals("\n")) {
                System.out.println("---------------------------------");
            }
            System.out.print("ID:"+contato.getId()+quebralinha);
            System.out.print("Nome:"+contato.getNome()+quebralinha);
            System.out.print("Email:"+contato.getEmail()+quebralinha);
            System.out.print("Endereco:"+contato.getEndereco()+quebralinha);
            System.out.print("Data de Nascimento:"+contato.getDataNascimento().getTime()+"\n");
        }
        System.out.println("Ultimo Codigo:"+dao.ultimoCodigo());
    }
}

