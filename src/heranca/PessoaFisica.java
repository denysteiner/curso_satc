package heranca;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String rua){
        super(nome,rua,null,null);
    }
    
    public PessoaFisica(String nome, String rua, Integer numero, String cidade, String cpf){
        super(nome,rua,numero,cidade);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void mostra(){
        System.out.println("---Pessoa Fisica---");
        System.out.println("Nome:"+this.getNome());
        System.out.print("Rua:"+this.endereco.getRua());
        System.out.print(" N°:"+this.endereco.getNumero());
        System.out.println(" Cidade:"+this.endereco.getCidade());
        System.out.println("CPF:"+this.getCpf());

    }

}
