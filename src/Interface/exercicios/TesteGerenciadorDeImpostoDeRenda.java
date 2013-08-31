package Interface.exercicios;

import heranca.exercicios.ContaCorrente;
import heranca.exercicios.SegudoDeVida;

public class TesteGerenciadorDeImpostoDeRenda {

    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SegudoDeVida sv = new SegudoDeVida();
        gerenciador.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        gerenciador.adiciona(cc);
        
        System.out.println(gerenciador.getTotal());
        
        
    }
    
}
