package aula07;
import java.text.DecimalFormat;
public class Lutador  {
    
    //Formatação de float
    DecimalFormat f = new DecimalFormat("0.00");
    
    //ATRIBUTOS
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

     //CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates ) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }
     
    //MÉTODOS ABSTRATOS

    public void apresentar() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos " + getNome());
        System.out.println("local de origem:  " + getNacionalidade());
        System.out.println("de Idade: " + getIdade());
        System.out.println("de Altura: " + f.format(getAltura()) + "m");
        System.out.println("de Peso: " + f.format(getPeso()) + "kg");
        System.out.println("com um total de:  " + getVitorias() + "Vitorias");
        System.out.println("um total de: " + getDerrotas() + "Derrotas");
        System.out.println("e por fim um total de:  " + getEmpates() + "Empates");
    }

    
    public void status() {
        System.out.println("---------------------------Status-----------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }


    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }


    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }


    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    
        
    //MÉTODOS SETTERS

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    private void setCategoria() {
        if(getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
        
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //MÉTODOS GETTERS

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }  
    
}
