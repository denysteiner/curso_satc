package ExercicioLocacao;

public class Filmes {
   private String titulo;
   private Integer genero;
   private Integer categoria;
   
   public Filmes (String titulo, Integer genero, Integer categoria) {
	   this.titulo = titulo;
	   this.genero = genero;
	   this.categoria = categoria;
   }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return Genero.getGenero(genero);
    }

    public Integer getCategoria() {
        return categoria;
    }
}
