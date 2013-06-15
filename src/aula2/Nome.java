package aula2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Formatter;
import javax.swing.JOptionPane;


public class Nome {
   public static void main (String[] args) throws IOException {
       int num1, num2, num3;
       String n1, n2,n3;
       InputStreamReader ler = new InputStreamReader(System.in);
       //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedReader br = new BufferedReader(ler);
       /*
       System.out.print("Entre com o n1:");
       n1 = br.readLine();
       try { 
           num1 = Integer.valueOf(n1);
       }
       catch (NumberFormatException e) {
               
       }*/
       
       // FORMATANDO TEXTO
       /*int x = 1, y = 2;
       System.out.format("Valor de x = %s, y = %s",x,y);
       System.out.println("");
       String aux;
       aux = String.format("Valor de x = %s, y = %s",x,y);
       System.out.println(aux);
       */
       
       /*
       Scanner sc = new Scanner(System.in);
       System.out.println("Palavra 1:");
       String name1 = sc.next();
       System.out.println("Palavra 2:");
       String name2 = sc.next();
       System.out.println("Palavra 3:");
       String name3 = sc.next();
       System.out.println(name1 + name2 + name3);
       */
       /*
       Scanner sc = new Scanner(System.in);
       System.out.println("Nome:");
       String name1 = sc.next();
       System.out.println("Idade:");
       int idade = sc.nextInt();
       System.out.format("Nome: %s idade %s.",name1,idade);
       */
       /*
       String name;
       name = JOptionPane.showInputDialog("Entre com o seu nome:");
       String msg = "Ola " + name + "!";
       JOptionPane.showMessageDialog(null, msg);
       */
       
       
       /*
       double valor, imposto, aliquota;
       String strValor, strImposto, strAliquota;
       strValor = JOptionPane.showInputDialog("Entre com o Salário:");
       
       valor = Float.valueOf(strValor);
       // até 1164 isento
       // 1164,01 2326 15%
       // > 2326,01 27,5%
       //StringBuilder sb = new StringBuilder();
       //Formatter formatter = new Formatter(sb, Locale.US) {};
       
       aliquota = (valor <= 1164)?0:(valor <= 2326)?15:27.5;
       imposto = (aliquota * valor) / 100;
       strImposto = String.format(" $ %(,.2f",imposto);
       strAliquota = String.format(" $ %(,.2f",aliquota);
       
       strAliquota = String.format("%.2f",aliquota);
       System.out.println(String.format("%.2f",12345678.987));
       
       * String msg = "Imposto devido :" + strImposto + " aliquota de "+ strAliquota;
       JOptionPane.showMessageDialog(null, msg);
       */
       
       // IF
       /*
       int x,y;
       x = 1;
       y = 2;
       
       if (x == y) { System.out.println("x=y"); }
       if (x > y) { System.out.println("x>y"); }
       if (x < y) { System.out.println("x<y"); }
       
       if (x == y) System.out.println("x=y");
       if (x > y) System.out.println("x>y");
       if (x < y) System.out.println("x<y");

       if (x == y) {
           System.out.println("x=y");
       } else {
           if (x > y) {
              System.out.println("x>y");
           } else {
              System.out.println("x<y"); 
           }   
       }
           
       if (x == y) {
           System.out.println("x=y");
       } else if (x > y) {
           System.out.println("x>y");
       } else if (x < y) {
           System.out.println("x<y"); 
       }
       */
       
       
       /*
       int x;
       x = 1;
       switch (x) {
           case 1:
               System.out.println("1");
               break;
           case 2:
               System.out.println("2");
               break;
           case 3:
               System.out.println("3");
               break;
           default:
               System.out.println("nao declarado");
       }
       */
       
       /*
       int x;
       x=0;
       while (x++ < 3) {
           System.out.println(x);
       }
       x=0;
       do{
           System.out.println(x);
       } while (x++ < 3);
       */
       /*
       int x,j;
       for (x=1;x<=3;x++){
           System.out.println(x);
       }
       for (x=1,j=1;(x<=3 && j<=5);x++,j++){
           System.out.println(x+"-"+j);
       }
       */
       
       /*
       int x;
       for (x=1;x<=3;x++){
           System.out.println(x);
           break;
       }
       
       for (x=1;x<=3;x++){
           if (x == 2) continue;
           System.out.println(x);
       }
       */
       
       // UTILIZACAO DE LABEL PARA ESTRUTURAS
       for1: for (int x=1;x<=3;x++){
           for2: for (int j=1;j<3;j++){
               System.out.println(x+"-"+j);
               break for1;
           }
           
       }
       
       
       
       
       
       
   }    
}
