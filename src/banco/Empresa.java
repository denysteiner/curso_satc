package banco;

public class Empresa {

    Funcionario[] empregados = new Funcionario[10];
    String cnpj;
    Integer totalFuncionarios = 0;

    void adiciona(Funcionario f) {
        //this.empregados[totalFuncionarios] = new Funcionario(f);
        this.empregados[totalFuncionarios] = f;
        totalFuncionarios++;
    }

    boolean eh_funcionario(Funcionario f) {
        /*for (int i = 0; i < empregados.length; i++) {            if (empregados[i].equals(f)) {
                return true;
            }}*/
        for (Funcionario funcionarios : empregados) {
            if (funcionarios != null) {
                if (funcionarios.equals(f)) {
                    return true;
                }
            }
        }
        return false;
    }

    double obtemTotalFolhaMensal() {
        Double valorTotalFolha = 0.;
        for (Funcionario funcionarios : empregados) {
            if (funcionarios != null) {
                valorTotalFolha += funcionarios.getSalario();
//                System.out.println(valorTotalFolha);
            }
        }
        return valorTotalFolha;
    }

    void listaFuncionarios() {
        for (Funcionario funcionarios : empregados) {
            if (funcionarios != null) {
                funcionarios.mostra();
            }
        }
    }
}
