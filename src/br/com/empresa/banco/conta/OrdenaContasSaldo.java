package br.com.empresa.banco.conta;

import java.util.Comparator;

public class OrdenaContasSaldo implements Comparator<ContaPoupanca>{

    @Override
    public int compare(ContaPoupanca o1, ContaPoupanca o2) {
        if (o1.getSaldo() < o2.getSaldo()){
            return -1;
        }
        if (o1.getSaldo() > o2.getSaldo()){
            return 1;
        }
        return 0;
    }
    
}
