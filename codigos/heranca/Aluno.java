package herança;

public class Aluno extends Pessoa{
    
    //----------------------------{Atributos}----------------------------//
    private int matricula;
    private String curso;
    
    //----------------------------{Getters e Setters}----------------------------//

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //----------------------------{Metódos}----------------------------//    
    
    public void pagarMensalidade(){
        
        System.out.println("Aluno pagando mensalidade");
        
    }
    
    @Override
    public void fazerAniversario() {
        
        //Faz aniversário incrementando mais 1;
        this.idade++;
        
    }
    
    
}
