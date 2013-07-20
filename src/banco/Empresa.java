package banco;

public class Empresa {

    Funcionario[] empregados = new Funcionario[10];
    private String cnpj;
    private Integer totalFuncionarios = 0;

    void adiciona(Funcionario f) {
        //this.empregados[totalFuncionarios] = new Funcionario(f);
        this.empregados[totalFuncionarios] = f;
        totalFuncionarios++;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    public Integer getTotalFuncionarios() {
        return totalFuncionarios;
    }

    void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    double getTotalFolhaMensal() {
        Double valorTotalFolha = 0.;
        for (Funcionario funcionarios : empregados) {
            if (funcionarios != null) {
                valorTotalFolha += funcionarios.getSalario();
            }
        }
        return valorTotalFolha;
    }

    void getListaFuncionarios() {
        for (Funcionario funcionarios : empregados) {
            if (funcionarios != null) {
                funcionarios.mostra();
            }
        }
    }
}
