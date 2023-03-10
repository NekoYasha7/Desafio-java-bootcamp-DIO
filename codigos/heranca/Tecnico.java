package herança;

public class Tecnico extends Aluno{
    
    //----------------------------{Atributos}----------------------------//
    
    private String registroProfissional;

    
    //----------------------------{Getters e Setters}----------------------------//

    public String getRegistroProfissional() {
        return registroProfissional;
    }
    
    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    //----------------------------{Metódos}----------------------------//
    
    @Override
    public void fazerAniversario(){
        
        //Faz aniversário incrementando o atributo idade com operado ++
        this.setIdade(++this.idade);
        
    }
    
    public void praticar(){
        
        System.out.println("Aluno técnico praticando");
        
    }
    
    
}
