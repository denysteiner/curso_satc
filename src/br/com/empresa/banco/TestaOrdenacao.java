package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.OrdenaContasSaldo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {
    public static void main(String[] args) {
        List<ContaPoupanca> contas = new ArrayList<>();
//        List<ContaPoupanca> contas = new ArrayList<>();
        ContaPoupanca c1 = new ContaPoupanca();
        c1.setNumero(1973); // 3
        c1.deposita(4); // 2
        contas.add(c1); // 
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(1462); // 1
        c2.deposita(3); // 2
        contas.add(c2); // 
        ContaPoupanca c3 = new ContaPoupanca();
        c3.setNumero(1854); // 2
        c3.deposita(2); // 1
        contas.add(c3); // 
        Collections.sort(contas);
        
        for (ContaPoupanca cp: contas) {
            System.out.println("Numero:"+cp.getNumero()+" Saldo:"+cp.getSaldo());
        }
        
        System.out.println("--------------------");
        
        OrdenaContasSaldo oc = new OrdenaContasSaldo();
        Collections.sort(contas, oc);
        
        for (ContaPoupanca cp: contas) {
            System.out.println("Numero:"+cp.getNumero()+" Saldo:"+cp.getSaldo());
        }
        
    }
    
}
