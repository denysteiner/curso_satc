package banco;

public class Funcionario {
   String nome = "", departamento = "", rg = "";
   Data data_entrada = new Data();
   Double salario;
   public Funcionario (String nome,String departamento,String rg,Double salario,Integer dia,Integer mes,Integer ano){
       this.nome = nome;
       this.departamento = departamento;
       this.rg = rg;
       this.salario = salario;
       data_entrada.setData(dia,mes,ano);
       
   }
   void recebeAumento(Double valor){
       salario += valor;
   }
   
   Double calculaGanhoAnual (){
       return salario * 12;
   }
   
   void mostra(){
       System.out.println("Funcionario:"+nome+
                          " | Salario:"+salario+
                          " | Depto:"+departamento+
                          " | Entr.Bco:"+data_entrada.mostraData()+
                          " | RG:"+rg);
   }
}
