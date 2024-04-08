public class Rato {
    private float velocidade;
    private boolean escondido;
    public Rato(float velocidade, boolean escondido){
        this.velocidade = velocidade;
        this.escondido = escondido;
    }
    void esconder(boolean escondido){
        this.escondido  = true;
    }

    public float getVelocidade() {
        return velocidade;
    }



    public boolean isEscondido() {
        return escondido;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rato{" +
                "velocidade=" + velocidade +
                ", escondido=" + escondido +
                '}';
    }
}
