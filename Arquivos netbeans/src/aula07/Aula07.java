package aula07;
public class Aula07 {
    public static void main(String[] args) {
        
        //CARACTERISTICAS DO LUTADOR
        //(NOME, NACIONALIDADE, IDADE, ALTURA, PESO,  VITORIAS, DERROTAS E EMPATES)    
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Puts Script", "Brasil", 29, 1.68f, 57.8f, 14, 2, 1);
        l[2] = new Lutador("Snap Shadow", "EUA", 35, 1.65f, 80.9f,  12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f,  13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f,  5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
    
        //LUTA
        Luta uec01 = new Luta();
        uec01.marcarLuta(l[1],l[1]);
        uec01.lutar();
        for(int i = 0; i <= 1; i++){
            l[i].status();
        }
    }
}

