package banco;

public class Programa_funcionario2 {

    public static void main(String[] args) {
        Departamento departamentoA = new Departamento("A", 10.);
        Departamento departamentoB = new Departamento("B", 15.);

        Funcionario[] funcionario = new Funcionario[10];

        funcionario[0] = new Funcionario("Joao", departamentoA, "123456", 1000., 5, 1, 2013);
        funcionario[1] = new Funcionario("Maria", departamentoB, "123456", 2000., 5, 1, 2013);
        funcionario[2] = new Funcionario("Pedro", departamentoB, "123456", 2200., 5, 1, 2013);
        funcionario[3] = new Funcionario("teste", departamentoB, "123456", 1000., 5, 1, 2013);

        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        /*
         for (int i = 3; i < 10; i++) {
            funcionario[i] = new Funcionario("teste" + i, departamentoB, "123456", 1000. + (15 * i), 5, 1, 2013);
        }
         */
        for (Funcionario f : funcionario) {
            if (f != null) {
                empresa.adiciona(f);
                System.out.println("Adicionou:" + f.getNome());
            }
        }

        empresa.listaFuncionarios();

        funcionario[5] = new Funcionario("funcionario5", departamentoB, "123456", 1000., 5, 1, 2013);
        for (int i = 0; i < funcionario.length; i++) {
            System.out.print(i + "-" + empresa.eh_funcionario(funcionario[i]) + " ");
        }
        System.out.println("");
        System.out.println("Folha Mensal:" + empresa.obtemTotalFolhaMensal());
        System.out.println("Total de Funcionarios:" + empresa.totalFuncionarios);
    }
}
