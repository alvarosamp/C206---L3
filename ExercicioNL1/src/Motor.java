public class Motor {
    private int potencia;
    private boolean turbo;

    public Motor(int potencia, boolean turbo) {
        this.potencia = potencia;
        this.turbo = turbo;
    }

    @Override
    public java.lang.String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", turbo=" + turbo +
                '}';
    }

    public int getPotencia() {
        return potencia;
    }

}
