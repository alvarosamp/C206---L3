public class Arma {
    private int dano;
    private int custoDeEnergia;

    // Getter para o atributo "dano"
    public int getDano() {
        return dano;
    }

    // Setter para o atributo "dano"
    public void setDano(int dano) {
        this.dano = dano;
    }

    // Getter para o atributo "custoDeEnergia"
    public int getCustoDeEnergia() {
        return custoDeEnergia;
    }

    // Setter para o atributo "custoDeEnergia"
    public void setCustoDeEnergia(int custoDeEnergia) {
        this.custoDeEnergia = custoDeEnergia;
    }

    // Construtor para inicializar os atributos
    public Arma(int dano, int custoDeEnergia) {
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }
}
