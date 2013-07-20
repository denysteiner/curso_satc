package ExercicioLocacao;

public class TipoMidia {
    private String descricao;
   private Double valor;

    public TipoMidia(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public Double getValor() {
        return this.valor;
    }
}
