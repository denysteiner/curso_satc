package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ValorInvalidoException;
import br.com.empresa.banco.conta.ValorSaqueForaDoLimiteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestaSaqueForaDoLimite {
    public static void main(String[] args) {
        Conta cp = new ContaCorrente();
        try {
            cp.deposita(100);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(TestaSaqueForaDoLimite.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Saldo:"+cp.getSaldo());
        try {
            try {
                cp.saca(200);
            } catch (ValorInvalidoException ex) {
                Logger.getLogger(TestaSaqueForaDoLimite.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ValorSaqueForaDoLimiteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("TESTE");
    }
}
