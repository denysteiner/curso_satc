package banco;

public class Data {
    Integer dia, mes, ano;
    public void setData(Integer p_dia, Integer p_mes, Integer p_ano){
        dia = p_dia;
        mes = p_mes;
        ano = p_ano;
    }
    public String mostraData(){
        return dia+"/"+mes+"/"+ano;
    }
}
