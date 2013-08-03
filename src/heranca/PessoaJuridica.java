package heranca;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String rua){
        super(nome,rua,null,null);
    }
    
    public PessoaJuridica(String nome, String rua, Integer numero, String cidade, String cnpj){
        super(nome,rua,numero,cidade);
        this.cnpj = cnpj;
    }
    
    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void mostra(){
        System.out.println("---Pessoa Juridica---");
        System.out.println("Nome:"+this.getNome());
        System.out.print("Rua:"+this.endereco.getRua());
        System.out.print(" N°:"+this.endereco.getNumero());
        System.out.println(" Cidade:"+this.endereco.getCidade());
        System.out.println("CNPJ:"+this.getCNPJ());

    }
    
}
