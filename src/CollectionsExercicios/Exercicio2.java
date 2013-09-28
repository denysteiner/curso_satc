package CollectionsExercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("iniciando");
        long inicio,fim,tempo,tempo2;
        inicio = System.currentTimeMillis();
        Collection<Integer> testeArrayList = (Collection<Integer>) new ArrayList<Integer>();
        Collection<Integer> testeLinkedList = (Collection<Integer>) new LinkedList<Integer>();
        Collection<Integer> testeHashSet = (Collection<Integer>) new HashSet<Integer>();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            testeArrayList.add(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo inserção ArrayList:"+tempo);
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < total; i++) {
            testeArrayList.contains(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo pesquisa ArrayList:"+tempo);

        for (int i = 0; i < total; i++) {
            testeLinkedList.add(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo inserção LinkedList:"+tempo);
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < total; i++) {
            testeLinkedList.contains(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo pesquisa LinkedList:"+tempo);

        for (int i = 0; i < total; i++) {
            testeHashSet.add(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo inserção HashSet:"+tempo);
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < total; i++) {
            testeHashSet.contains(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo pesquisa HashSet:"+tempo);
        
    }
}
