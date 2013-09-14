package Collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {
        // pagina 234 apostila
        Set<String> cargos = new HashSet<>();
        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Secretaria");
        cargos.add("Funcionario");
        cargos.add("Diretor");
        System.out.println(cargos);
    }
    
}
