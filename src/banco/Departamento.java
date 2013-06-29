package banco;

public class Departamento {
    String nome;
    double PercentualInsalubridade;
    
    Departamento(String nome, Double PercentualInsalubridade){
        this.nome = nome;
        this.PercentualInsalubridade = PercentualInsalubridade;
    }
    
    double aplicaInsalubridade(Double salario){
        return salario + (salario * (PercentualInsalubridade / 100));
    }
}
