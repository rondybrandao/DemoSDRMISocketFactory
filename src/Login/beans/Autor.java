
package Login.beans;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private ArrayList<String> livros = new ArrayList();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public List lista1(){
    livros.add("Deuses Americanos, ISBN: 8995764590 "
            + "O livro do Cemiterio, "
            + "Sandman");
    return livros;
    }
    public List lista2(){
    livros.add("Google Android, ISBN: 9576164590"
            + "Web Service RESTFull, ISBN: 978-85-7522-454-0");
            
    return livros;
    }
    public List lista3(){
    livros.add("Cavalo de Troia 1 2 3 4 5 6 7");
    return livros;
    }
    public List lista4(){
    livros.add("Java como Programar, ISBN: 2676164597");
    return livros;
    }
    public List lista5(){
    livros.add("Historias extraordinárias, ISBN: 1276164597");
    return livros;
    }
}
