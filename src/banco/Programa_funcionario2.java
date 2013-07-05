package banco;

public class Programa_funcionario2 {
    public static void main (String[] args){
        Departamento departamentoA = new Departamento("A",10.);
        Departamento departamentoB = new Departamento("B",15.);
        
        Funcionario[] funcs = new Funcionario[10];
        
        funcs[0] = new Funcionario("Joao",departamentoA,"123456",1000.,5,1,2013);
        funcs[1] = new Funcionario("Maria",departamentoB,"123456",2000.,5,1,2013);
        funcs[2] = new Funcionario("Pedro",departamentoB,"123456",2200.,5,1,2013);
        funcs[3] = new Funcionario("teste",departamentoB,"123456",1000.,5,1,2013);
        
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];
        
        for (int i = 3; i < 10; i++) {
            funcs[i] = new Funcionario("teste"+i,departamentoB,"123456",1000.+(15*i),5,1,2013);
        }
        
        for (Funcionario f: funcs){
            if (f != null){
                empresa.adiciona(f);
                System.out.println("Adicionou:"+f.getNome());
            }
        }
        
        for (Funcionario f: empresa.empregados){
            if (f != null){
                f.mostra();
            }
        }
        for (Funcionario f: empresa.empregados){
            if (f != null){
                //System.out.println("Funcionario:"+f.getNome()+" Salario:"+f.getSalario());
            }
        }
        
    } 
}
