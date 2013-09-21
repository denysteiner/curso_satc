package CollectionsExercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("iniciando");
        long inicio;
        long fim;
        long tempo;
        inicio = System.currentTimeMillis();
        //Collection<Integer> teste = (Collection<Integer>) new ArrayList<Integer>();
        //Collection<Integer> teste = (Collection<Integer>) new ArrayList<Integer>();
        Collection<Integer> teste = (Collection<Integer>) new HashSet<Integer>();
        int total = 3000000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        inicio = System.currentTimeMillis();
        System.out.println("Tempo inserção:"+tempo);
        
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo pesquisa:"+tempo);
        
    }
}
