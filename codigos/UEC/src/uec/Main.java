package uec;

//--+ Imports +--//
import uec.model.Lutador;
import uec.model.Luta;

public class Main {

    public static void main(String[] args) {
    
        String[] nomes = {"Pretty Boy", "Putscript", "Snapshadow", "Dead Code", "UFOCobol", "Nerdaart"};
        String[] nacionalidades = {"França", "Brasil", "EUA", "Austrália", "Brasil", "EUA"};
        int[] idades = {31, 29, 35, 28, 37, 30};
        double[] alturas = {1.75, 1.68, 1.65, 1.93, 1.70, 1.81};
        double[] pesos = {68.9, 57.8, 80.9, 81.6, 119.3, 105.7};
        int[] vitorias = {11, 14, 12, 13, 5, 12};
        int[] derrotas = {2, 2, 2, 0, 4, 2};
        int[] empates = {1, 3, 1, 2, 3, 4};
        
        Lutador[] lutadores = new Lutador[nomes.length];
        
        for(int i = 0; i <= nomes.length; i++)
            lutadores[i] = new Lutador(nomes[i], nacionalidades[i], idades[i], alturas[i], pesos[i], vitorias[i], derrotas[i], empates[i]);
        
        
        Luta luta = new Luta();
        luta.marcarLuta(lutadores[1],lutadores[2]);
        luta.lutar();
    }
    
}
