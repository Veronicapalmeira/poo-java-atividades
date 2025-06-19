package saladeaula14;

public class Serie extends ProgramaTV {
    int temporadas;
    int episodios;
    
    Serie(String nome, String categoria, int temporadas, int episodios) {
        super(nome, categoria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }
    
    public int getTemporadas() {
        return temporadas;
    }
    
    public int getEpisodios() {
        return episodios;
    }
    
    public String toString() {
        return super.toString() + 
               "Temporadas: " + temporadas + "\n" +
               "Episódios: " + episodios + "\n";
    }
}