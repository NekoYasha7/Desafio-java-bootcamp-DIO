package herança;

public class Bolsista extends Aluno{
    
    //----------------------------{Atributos}----------------------------//
    
    private boolean bolsa;
    
    //----------------------------{Getters e Setters}----------------------------//

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
    
    //----------------------------{Metódos}----------------------------//
    
    public void fazerAniversario(){
        
        //Bolsista faz aniversário com Setter adicionando mais 1
        this.setIdade(this.getIdade() + 1);
        
    }
    public void renovarBolsa(){
        
        System.out.println("Renovando bolsa de Bolsista");
        this.setBolsa(true);
        
    }
    
    /**
     *
     */
    public void pagarMensalidade(){
        
        System.out.println("Pagando mensalidade de Bolsista");
        
    }
}
