package banco;

import java.text.DecimalFormat;

public class Data {
    private Integer dia, mes, ano;
    public void setData(Integer dia, Integer mes, Integer ano){
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
