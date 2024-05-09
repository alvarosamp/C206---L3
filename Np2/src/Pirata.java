import java.util.Objects;

public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;
    private static int qtde = 0;

    public Pirata(String nome, java.lang.String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
        qtde++;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        cozinheiro.prepararPrato(index);
        int aumento =30;
        if(Objects.equals(comidaFavorita, cozinheiro.prepararPrato(index))){
            int newpoder = getPoder()+(aumento *2);
            setPoder(newpoder);
        }
        else{
            int newpoder = getPoder() + aumento;
            setPoder(newpoder);
        }
    }
    //void lutar





public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getComidaFavorita() {
    return comidaFavorita;
}

public void setComidaFavorita(String comidaFavorita) {
    this.comidaFavorita = comidaFavorita;
}

public int getPoder() {
    return poder;
}

public void setPoder(int poder) {
    this.poder = poder;
}
}
