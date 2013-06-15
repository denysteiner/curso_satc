package aula3;

import javax.swing.JOptionPane;

public class aula {
   public static void main (String[] args){
       int i;
       /*
       // Exercicio 2.1
       String[] dias_semana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};
       for (i=0;i<7;i++){
          System.out.println(dias_semana[i]);
       }
       i=0;
       while (i<7){
          System.out.println(dias_semana[i++]);
       }
       i=0;
       do {
          System.out.println(dias_semana[i++]);
       } while (i<7);
       */
       
       /*
       // Exercicio 2.2
       int[] n = new int[10];
       int maior = 0;
       for (i=0;i<5;i++){
          n[i] = 0 ;
          n[i] = Integer.valueOf(JOptionPane.showInputDialog("Entre com o numero:["+i+"]:"));
          if (n[i]>maior){
              maior = n[i];
          }
       }
       JOptionPane.showMessageDialog(null, maior);
       */
       
       
       /*
       String[][] pessoas;
       pessoas = new String[4][2];
       pessoas[0][0] = "pessoa1";
       pessoas[0][1] = "email1";
       pessoas[1][0] = "pessoa2";
       pessoas[1][1] = "email2";
       pessoas[2][0] = "pessoa3";
       pessoas[2][1] = "email3";
       pessoas[3][0] = "pessoa4";
       pessoas[3][1] = "email4";
       
       for (int x=0;x<4;x++){
        for (int y=0;y<2;y++){
            if (y==0) System.out.print("Nome:"+pessoas[x][y]); 
            else System.out.println(" Email:"+pessoas[x][y]);
           
        }   
       }
       */

      String[] pessoas = "teste0;teste1;teste2".split(";");
      for (String pessoa : pessoas){
          System.out.println(pessoa);
      }
       
   } 
}
