package aula3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.##");
       DecimalFormat dfn = new DecimalFormat("#,##0.00;(#,##0.00)");
       DecimalFormat dfzero = new DecimalFormat("000000");
       Double valor;
       
       valor = 12345678.91;
       System.out.println(df.format(valor));
       System.out.println(dfn.format(valor));
       System.out.println(NumberFormat.getCurrencyInstance().format(valor));
       System.out.println(dfzero.format(123));
    }
    
}
