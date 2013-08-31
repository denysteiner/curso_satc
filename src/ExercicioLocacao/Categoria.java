package ExercicioLocacao;


public class Categoria {
    private String descricao;
    private Double acrescimo;
    private Integer prazoDevolucao;

    public Categoria(String descricao, Integer prazoDevolucao, Double acrescimo) {
        this.descricao = descricao;
        this.acrescimo = acrescimo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public Categoria(String descricao, Integer prazoDevolucao) {
        this(descricao, prazoDevolucao, 0.);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Double getAcrescimo(Double valor) {
        return valor + (acrescimo / 100 * valor);
    }

    public Integer getPrazoDevolucao() {
        return prazoDevolucao;
    }
}
