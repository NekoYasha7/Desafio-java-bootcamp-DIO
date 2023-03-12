package formas.model;

public class Quadrado extends Retangulo{
    
    public Quadrado(float lado) {
        super(lado, lado);
    }
    
    @Override
    public float calcularPerimetro(){
        
        float perimetro = 0.0f;
        
        //--+ Fórmula para cálculo do perimetr: (P = 4 * h); +--//
        perimetro = (4 * this.getAltura());
        
        return perimetro;
    }
    
 
}
