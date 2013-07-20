package ExercicioLocacao;

import java.text.DecimalFormat;

public class ItemLocacao {
    private Filme filme;
    private String numeroSerie;
    private TipoMidia tipoMidia;
   
    public ItemLocacao(String numeroSerie, Filme filmes, TipoMidia tipoMidia) {
	   this.numeroSerie = numeroSerie;
        this.filme = filmes;
	   this.tipoMidia = tipoMidia;
    }

    public Filme getFilmes() {
        return filme;
    }

    public TipoMidia getTipoMidia() {
        return tipoMidia;
    }
    public Double getValor() {
        Double valor;
        valor = tipoMidia.getValor();
        valor = (filme.getCategoria().getAcrescimo(valor));
        return valor;
    }

    public Integer getPrazo() {
        return filme.getCategoria().getPrazoDevolucao();
    }
    
    public String getInfo(){
       DecimalFormat df = new DecimalFormat("#,##0.00;(#,##0.00)");
       StringBuilder sb = new StringBuilder("");
       sb.append("Titulo: ").append(this.getFilmes().getTitulo());
       sb.append(" - Genero: ").append(this.getFilmes().getGenero().getDescricao());
       sb.append(" - Valor: ").append(df.format(this.getValor()));
       sb.append(" - Entregar em ").append(this.getPrazo()).append(" dia(s)").append("\n");
       return sb.toString();
    }
}
