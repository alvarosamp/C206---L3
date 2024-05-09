import java.util.ArrayList;
import java.util.List;

public class Cozinheiro extends Pirata{
    private final Receita receita;
    private List<Receita> livroDeReceitas = new ArrayList<>();

    public Cozinheiro(String nome, String comidaFavorita, int poder,String nome2,int dificuldade) {
        super(nome, comidaFavorita, poder);
        this.receita = new Receita(nome2,dificuldade);
    }

    //funcao preparar prato
    public String prepararPrato(int index){
        Receita receita2 = livroDeReceitas.get(index);
       return (STR."Cozinhando \{receita2.getNome()}");

    }
    public void mostrarReceita(){
        System.out.println("Receitas:");
        for(Receita receita :livroDeReceitas ){
            try{
                System.out.println("" + receita.getNome() +" Nivel de dificulade" + receita.getDificuldade());
            }catch (NullPointerException e){
                System.out.println("Error: "+ e);
            }

        }


    }

    public List<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }

    public void setLivroDeReceitas(List<Receita> livroDeReceitas) {
        this.livroDeReceitas = livroDeReceitas;
    }
}
