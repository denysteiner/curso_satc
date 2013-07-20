package ExercicioLocacao;

public class Genero {
	 private static String[] 
 genero = {"Ação", "Animação", "Aventura", "Comédia",
        "Documentário", "Drama", "Ficção", "Guerra",
        "Musical", "Policial", "Romance", "Suspense", "Terror"};
	 
	 public static String getGenero(Integer posicao) {
		 return genero[posicao];
	 }
}
