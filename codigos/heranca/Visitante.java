package herança;

public class Visitante extends Pessoa{

    //----------------------------{Metódos}----------------------------//
  
    @Override
    public void fazerAniversario() {
        
        //Faz idade pegando a idade atual com get e adicioanndo +1
        
        this.setIdade(this.getIdade() + 1);
    }
    
}
