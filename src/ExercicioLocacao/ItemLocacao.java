package ExercicioLocacao;

public class ItemLocacao {
   private Filmes filmes;
   private String numeroSerie;
   private Integer tipoMidia;
   
   public ItemLocacao(String numeroSerie, Filmes filmes, Integer tipoMidia) {
	   this.numeroSerie = numeroSerie;
	   this.filmes = filmes;
	   this.tipoMidia = tipoMidia;
    }

    public Filmes getFilmes() {
        return filmes;
    }

    public Integer getTipoMidia() {
        return tipoMidia;
    }
    public Double getValor() {
        Double valor;
        valor = TipoMidia.getValor(tipoMidia);
        valor = valor + (Categoria.getAcrescimo(filmes.getCategoria()) / 100 * valor);
        return valor;
    }

    public Integer getPrazo() {
        return Categoria.getPrazoDevolucao(filmes.getCategoria());
    }
   
}
