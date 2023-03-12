package formas.model;

public class Circulo extends Forma{
    
            
    private final float PI = 3.14f;
    private float raio;
    
    //--------------------{Construtor}--------------------//

    public Circulo(float raio) {
        this.raio = raio;
    }
    
    //--------------------{Getters e Setters}--------------------//

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    //--------------------{Metódos}--------------------//
    
    public float calcularDiametro(){
        
        float diametro = 0.0f;
        
        //--+ Formula para calcular o diametro: (D = 2 * R); +--// 
        diametro = (2 * this.getRaio());
        
        return diametro;
    }
    
    @Override
    public float calcularArea() {
        float area = 0.0f;
        
        //--+ Fórmula para calcular a área: (D = π *(2 * R)); +--//
        area = (PI * (this.getRaio() * this.getRaio()));
        
        return area;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = 0.0f;
        
        //--+ Formula para calcular a circumferência: (2 * π * 3); +--//
        perimetro = (2 * PI * this.getRaio());
        
        return perimetro;
        
    }
    
}
