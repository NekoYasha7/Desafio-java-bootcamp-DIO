package herança;

public abstract class Pessoa {
    
    //----------------------------{Atributos}----------------------------//
    
    private String nome;
    protected int idade;
    private String sexo;
    
    //----------------------------{Getters e Setters}----------------------------//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //----------------------------{Metódos}----------------------------//
    public abstract void fazerAniversario();
}
