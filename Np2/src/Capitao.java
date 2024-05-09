public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    public void conquistarNovoSeguidor(Pirata pirata){
        if(getPoder() < pirata.getPoder()){
            System.out.println("Capitao nao te seguiu");
        }
        else{
            System.out.println("Capitao seguiu de volta");
        }
    }
    @Override
    public void darOrdens(){
        System.out.println("O capitao está comandando"+ numeroDeSeguidores);
    }
    public void mudarRota(){
        System.out.println("O imediato esta ordenando os tripulantes");
    }

    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public void setNumeroDeSeguidores(int numeroDeSeguidores) {
        this.numeroDeSeguidores = numeroDeSeguidores;
    }
}
