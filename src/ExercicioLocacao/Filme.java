package ExercicioLocacao;

public class Filme {
   private String titulo;
    private Genero genero;
    private Categoria categoria;
   
    public Filme(String titulo, Genero genero, Categoria categoria) {
	   this.titulo = titulo;
	   this.genero = genero;
	   this.categoria = categoria;
   }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
