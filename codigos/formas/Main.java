package formas;

import formas.model.*;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo  =   new Retangulo(7.5f, 7.8f);
        Circulo circulo      =   new Circulo(3f);
        Quadrado quadrado    =   new Quadrado(2.8f);
        Retangulo retangulo1 =   new Retangulo(6.9f, 9.2f);
        Circulo circulo1     =   new Circulo(6.7f);
        
        //--+ Armazena as formas em uma Array +--//
        Forma[] minhasFormas = {retangulo, circulo, quadrado, retangulo1, circulo1};
        
        //--+ Calcula a area e o perimetro das formas +--//
        for(Forma forma : minhasFormas){
            
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perimentro: " + forma.calcularPerimetro());
            System.out.println("---------------------------");
            
        }

    }
    
}
