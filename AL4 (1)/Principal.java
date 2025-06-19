package saladeaula14;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList<ProgramaTV>();
        
        //programas de TV 
        ProgramaTV p = new ProgramaTV("O outro lado do paraíso", "Novela");
        p.setDiretor(new Pessoa("Diretor 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);
        
        p = new ProgramaTV("Orgulho e Paixão", "Novela");
        p.setDiretor(new Pessoa("Diretor 2", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);
        
        p = new ProgramaTV("Marley e eu", "Filme");
        p.setDiretor(new Pessoa("Diretor 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
        programas.add(p);
        
        p = new ProgramaTV("Show Ivete Sangalo", "Show");
        p.setDiretor(new Pessoa("Diretor 4", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
        programas.add(p);

        //Series 
        Serie s = new Serie("La Casa de Papel", "Série", 5, 41);
        s.setDiretor(new Pessoa("Diretor 5", "Espanhol"));
        s.setArtistas(new Pessoa("Artista 9", "Espanhol"));
        s.setArtistas(new Pessoa("Artista 10", "Mexicano"));
        programas.add(s);
        
        s = new Serie("Stranger Things", "Série", 4, 34);
        s.setDiretor(new Pessoa("Diretor 6", "Americano"));
        s.setArtistas(new Pessoa("Artista 11", "Americana"));
        s.setArtistas(new Pessoa("Artista 12", "Canadense"));
        programas.add(s);
        
        for (ProgramaTV programa : programas) {
            System.out.println(programa);
            System.out.println("----------------------");
        }
    }
}