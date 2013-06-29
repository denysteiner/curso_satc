package banco;

import java.text.DecimalFormat;

public class Funcionario {
   private String nome = "", rg = "";
   private Departamento departamento;// = new Departamento();
   private Data data_entrada = new Data();
   private Double salario;
   private DecimalFormat dfn = new DecimalFormat("#,##0.00;(#,##0.00)");
          
   public Funcionario (Funcionario f){
       this.nome = f.getNome();
       this.departamento = f.getDepartamento();
       this.rg = f.getRG();
       this.salario = f.getSalario();
       data_entrada.setData(f.getAdmissaoDia(),f.getAdmissaoMes(),f.getAdmissaoAno());
   }
   
   public Funcionario (String nome,Departamento departamento,String rg,Double salario,Integer dia,Integer mes,Integer ano){
       this.nome = nome;
       this.departamento = departamento;
       this.rg = rg;
       this.salario = salario;
       data_entrada.setData(dia,mes,ano);
   }
   
   public String getNome(){
       return nome;
   }
   public Departamento getDepartamento(){
       return departamento;
   }
   void recebeAumento(Double valor){
       salario += valor;
   }
   
   Double calculaGanhoAnual (){
       return salario * 12;
   }
   
   void mostra(){
       StringBuilder sb = new StringBuilder();
       sb.append("Funcionario:").append(nome);
       sb.append(" | Salario base:").append(dfn.format(salario));
       sb.append(" | Salario:").append(dfn.format(getSalario()));
       sb.append(" | Depto:").append(departamento.nome);
       sb.append(" | Perc/insal:").append(dfn.format(departamento.PercentualInsalubridade));
       sb.append(" | Entr.Bco:").append(data_entrada.mostraData());
       sb.append(" | RG:").append(rg);
       System.out.println(sb.toString());
   }
   
   double getSalario(){
       return departamento.aplicaInsalubridade(salario);
   }
   Integer getAdmissaoDia(){
       return data_entrada.getDia();
   }
   Integer getAdmissaoMes(){
       return data_entrada.getMes();
   }
   Integer getAdmissaoAno(){
       return data_entrada.getAno();
   }
   String getRG(){
       return rg;
   }
}
