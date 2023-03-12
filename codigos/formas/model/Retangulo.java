package formas.model;

public class Retangulo extends Forma{


    //--------------------{Construtor}--------------------//
    
    public Retangulo(float altura, float lado) {
        
        this.setAltura(altura);
        this.setLado(lado);
        
    }

    //--------------------{Metódos}--------------------//
    @Override
    public float calcularArea() {
        
        float area = 0.0f;
        
        //--+ Fórmula para calculo da área: A = b * h; +--//
        area = (this.getLado() * this.getAltura());
        
        return area;
    }

    @Override
    public float calcularPerimetro() {
        
        float perimetro = 0.0f;
        
        //--+ Fórmula para cálculo do perimetr: P = 2 * (b + h); +--//
        perimetro = (2 *(this.getLado() + this.getAltura()));
        
        return perimetro;
    }
    
}
