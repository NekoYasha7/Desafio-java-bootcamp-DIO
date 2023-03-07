package uec.model;

public class Lutador {

    //-------------------------------------------{ Atributos }-------------------------------------------//    
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //-------------------------------------------{ Construtor }-------------------------------------------//    
    
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        
    }

    
    
    //-------------------------------------------{ Getters e Setters }-------------------------------------------//
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        //--+ Seleciona a categoria com base no peso do lutador +--//
        if(this.getPeso() < 52.2 )
            this.categoria = "Inválido";
        else if(this.getPeso() <= 70.3)
            this.categoria = "Leve";
        else if(this.getPeso() <= 83.9 )
            this.categoria = "Médio";
        else if(this.getPeso() <= 120.2)
            this.categoria = "Pesado";
        else
            this.categoria = "Inválido";
        
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //-------------------------------------------{ Getters e Setters }-------------------------------------------//
    public void apresentar(){
    
        System.out.println("Apresentano o lutado " + this.getNome() + " de "  + this.getNacionalidade() +
                           "Com " + this.getIdade() + " de idade e pesando" + this.getPeso() + "kg e medindo " + this.getAltura() + "de altura\n");
        System.out.println(this.getVitorias() + " Vitórias" +  
                           this.getDerrotas() + " Derrotas" + 
                           this.getEmpates() + " Empates");
    }
    
    public void status(){
        
        //--+ Apresenta o status do Lutador +--//
        System.out.println(this.getNome() + " é uma peso " + this.getCategoria() + "\n" +
                           "Ganhou: " + this.getVitorias() + "\n" +  
                           "Perdeu: " + this.getDerrotas() + "\n" + 
                           "Empatou: " + this.getEmpates());
    }
    
    
    public void ganharLuta(){
        this.setVitorias((this.getVitorias() + 1));
    }
    
    public void perderLuta(){
        this.setDerrotas((this.getDerrotas() + 1));
    }
    
    public void empatarLuta(){
        this.setEmpates((this.getEmpates() + 1));
    }
    
    
    
    
    
    

}
