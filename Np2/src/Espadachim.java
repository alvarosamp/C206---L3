public class Espadachim extends Pirata implements Comandar{
    private String nomeDaEspada;

    public Espadachim(String nome, String comidaFavorita, int poder, String nomeDaEspada) {
        super(nome, comidaFavorita, poder);
        this.nomeDaEspada = nomeDaEspada;
    }
    @Override
    public void darOrdens(){
        System.out.println("O imediato esta ordenando os tripulantes");
    }

    public void mudarRota(){
        System.out.println("O imediato está mudando a rota");
    }
    public String getNomeDaEspada() {
        return nomeDaEspada;
    }

    public void setNomeDaEspada(String nomeDaEspada) {
        this.nomeDaEspada = nomeDaEspada;
    }
}
