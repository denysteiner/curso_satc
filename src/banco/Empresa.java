package banco;

public class Empresa {
    Funcionario[] empregados = new Funcionario[10];
    String cnpj;
    Integer totalFuncionarios = 0;
    
    void adiciona(Funcionario f){
        this.empregados[totalFuncionarios] = new Funcionario(f);
        totalFuncionarios++;
    }
}
