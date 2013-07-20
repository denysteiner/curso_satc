/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioLocacao;

/**
 *
 * @author deny
 */
public class Teste2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Klaus");
        
        Locacao locacao = new Locacao(cliente);
        
        ItemLocacao item = new ItemLocacao("123", new Filme("O Corvo", new Genero("Terror"), new Categoria("Lançamernto", 1)), new TipoMidia("DVD", 2.5));
        
        locacao.adicionaItem(item);
    }
}
