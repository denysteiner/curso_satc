package GeraListaM3u;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author deny
 */
public abstract class GravaArquivo {
    /**
     *
     * @param arquivo
     * @param conteudo
     */
    public static void Grava(String arquivo, String conteudo) {
        try {  
            File arq = new File(arquivo);  
            FileWriter fw = new FileWriter(arq);  
            BufferedWriter grava = new BufferedWriter(fw);  
            if (arq.exists()) {
                grava.write(conteudo.toString());  
                grava.close();  
                fw.close();  
            }  
        } catch (IOException e) { 
            System.out.print("Erro 01 :" + e.toString());  
        } catch (SecurityException erro2) { 
            System.out.print("Erro 02 :" + erro2.toString());  
        }
    }
}
