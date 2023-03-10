package herança;

import java.util.Scanner;

public class Professor extends Pessoa{

    //----------------------------{Atributos}----------------------------//
    
    private String especialidade;
    private double salario;
    
    //----------------------------{Getters e Setters}----------------------------//

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    //----------------------------{Metódos}----------------------------//
  
    @Override
    public void fazerAniversario() {
        
        //Faz aniversário pela subtração do ano atual e o ano de nascimento
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o ano atual: ");
        int anoAtual = scan.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        
        this.setIdade((anoAtual - anoNascimento));
        
    }
    
    public void receberAumento(double aumento){
        
        this.setSalario((salario + aumento));
        
    }
}
