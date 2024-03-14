public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;

    // Getter para o atributo "arma"
    public Arma    getArma() {
        return arma;
    }

    // Setter para o atributo "arma"
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    // Getter para o atributo "energia"
    public int getEnergia() {
        return energia;
    }

    // Setter para o atributo "energia"
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    // Getter para o atributo "vida"
    public int getVida() {
        return vida;
    }

    // Setter para o atributo "vida"
    public void setVida(int vida) {
        this.vida = vida;
    }

    // Método para realizar um ataque
    public void atacar(Jogador alvo) {
        if (this.energia > arma.getCustoDeEnergia()) {
            System.out.println("A vida do alvo diminuiu em " + arma.getDano());
            alvo.setVida(alvo.getVida() - arma.getDano());
            System.out.println("Sua energia diminuiu em " + arma.getCustoDeEnergia());
            this.setEnergia(this.getEnergia() - arma.getCustoDeEnergia());
        }
    }

    // Construtor padrão
    public Jogador() {
        this.vida = 10;
        this.energia = 10;
    }

    // Construtor com parâmetros
    public Jogador(Arma arma, int energia, int vida) {
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }
}
