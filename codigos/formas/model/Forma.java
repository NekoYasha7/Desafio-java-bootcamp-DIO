package formas.model;

public abstract class Forma {

    //--------------------{Atributos
    
    private float altura;
    private float lado;    
    
    //--------------------{Getters e Setters}--------------------//

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
  
    
    //--------------------{Metódos}--------------------//
    
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
  
    
}
