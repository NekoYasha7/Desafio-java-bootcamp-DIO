package uec.model;

//--+ Imports +--//
import java.util.Random;
import uec.model.Lutador;

public class Luta {

    //-------------------------------------------{ Atributos }-------------------------------------------//    
    
    Lutador desafiante;
    Lutador desafiado;
    int rounds;
    boolean aprovada;
    
   
    //-------------------------------------------{ Getters e Setters }-------------------------------------------//    

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //-------------------------------------------{ Metódos }-------------------------------------------//    
    public void marcarLuta(Lutador l1, Lutador l2){
        
        //--+ Verifica que os lutadores seguem as regras das lutas +--//
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
        
    }
    
    public void lutar(){
        
        if(this.isAprovada()){
            
            //--+ Apresenta os lutadores +--//
            System.out.println("DESAFIADO: \n");
            this.getDesafiado().apresentar();
            System.out.println("\n DESAFIANTE: \n");
            this.getDesafiante().apresentar();
            
            /*--+ Lutando +--
            /*--+ 0 = Empate +--
            /*--+ 1 = Desafiante vence +--
            /*--+ 2 = Desafiado vence +--
            */
            
            Random rand = new Random();
            int vencedor = rand.nextInt(3);
            
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!\n");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiante().getNome() + " venceu!");
                    this.getDesafiante().setVitorias(this.getDesafiante().getVitorias() + 1);
                    this.getDesafiado().setDerrotas(this.getDesafiado().getDerrotas() + 1);
                    break;
                case 2:
                    System.out.println(this.getDesafiado().getNome() + " venceu!");
                    this.getDesafiado().setVitorias(this.getDesafiado().getVitorias() + 1);
                    this.getDesafiante().setDerrotas(this.getDesafiante().getDerrotas() + 1);
            }
        }
    }
}
