package aula07;

import java.util.Random;

public class Luta {
    
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //MÉTODOS
    public void marcarLuta(Lutador um, Lutador dois){
        if(um.getCategoria().equals(dois.getCategoria()) && um != dois){
                aprovado = true;
                System.out.println("Luta aprovada!");
                desafiante = um;
                desafiado = dois;    
        } else {
            System.out.println("Não foi possivel marcar luta");
            setAprovado(false);
        }
    }
    public void lutar(){
        if(this.aprovado){
            desafiante.apresentar();
            desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0: //Empate
                    System.out.println("------------------------------------------");
                    System.out.println("Empate!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1: //Desafiante ganhou a luta
                    System.out.println("------------------------------------------");
                    System.out.println("O desafiante " + desafiante.getNome() + " ganhou a luta!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2: //Desafiado ganhou a luta
                    System.out.println("------------------------------------------");
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
            }            
        }
    }
    
    //MÉTODOS SETTERS
     public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }   
    //MÉTODOS GETTERS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }
}
