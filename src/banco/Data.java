package banco;

import java.text.DecimalFormat;

public class Data {
    private Integer dia, mes, ano;

    Data() {
    }
    Data(Integer dia, Integer mes, Integer ano) {
        this.setData(dia, mes, ano);
    }
    public void setData(Integer dia, Integer mes, Integer ano) {
        if (dia == null || dia <= 0) {
            System.out.println("Dia inválido");
        }
        if (mes == null || mes <= 0) {
            System.out.println("Dia inválido");
        }
        if (ano == null || ano <= 0) {
            System.out.println("Dia inválido");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String mostraData(){
        DecimalFormat dfzero = new DecimalFormat("00");
        return dfzero.format(dia)+"/"+dfzero.format(mes)+"/"+ano;
    }
    public Integer getDia(){
        return dia;
    }
    public Integer getMes(){
        return mes;
    }
    public Integer getAno(){
        return ano;
    }
}
