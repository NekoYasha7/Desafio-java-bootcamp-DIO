package herança;

public class Main {

    public static void main(String[] args) {
        
        //--+ Instancia objetos +--//
        Visitante visitante = new Visitante();
        Pessoa aluno = new Aluno();
        Pessoa bolsista = new Bolsista();
        Pessoa tecnico = new Tecnico();
        Pessoa professor = new Professor();
        
        //--+ Coloca as pessoas em uma array +--//
        Pessoa[] pessoasDaEscola = {visitante, aluno, bolsista, tecnico, professor};
        
        //--+ Usa o metódo fazerAniversário sobrescrito em cada objeto. +--//
        for(Pessoa pessoa : pessoasDaEscola){
            
            pessoa.setIdade(17);
            pessoa.fazerAniversario();
            System.out.println(pessoa.getIdade());
            
        }
        
    }
    
}
