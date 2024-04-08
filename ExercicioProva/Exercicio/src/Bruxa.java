public class Bruxa extends Monstro
{
    private Feitico[] feitico;

    public Bruxa(int idade, int vida, int energia, Feitico[] feitico) {
        super(idade, vida, energia);
        this.feitico = feitico;
    }

    boolean aprenderFeitico(String nome, int poder){
        for (int i = 0; i < feitico.length; i++) {
            if(feitico[i] == null){
                Feitico newfeitico = new Feitico(nome,poder);
                feitico[i] = newfeitico;
                return true;
            }

        }
        return false;

    }


    void listarFeitico() {
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] != null) {
                System.out.println("Nome: " + feitico[i].getNome() + ", Poder: " + feitico[i].getPoder());
            } else {
                System.out.println("Feitiço na posição " + i + " está vazio.");
            }
        }
    }
    void esquecerFeitico(int posicao) {

            if(feitico[posicao] == null){
                System.out.println("Nao temos feitiço na posicao");
            }
            else{
                System.out.println(feitico[posicao].getNome()+ " foi apagado.");
                feitico[posicao] = null;

            }



    }
    void lancarFeitico(Monstro monstroAlvo, int posicao){
        int novaenergia = getEnergia();
        if(novaenergia >=40) {
            novaenergia -= 40;
            monstroAlvo.setEnergia(novaenergia);
            for (int i = 0; i < feitico.length; i++) {
                if (feitico[posicao] != null) {
                    int novavida = monstroAlvo.getVida();
                     novavida = novavida - (feitico[posicao].getPoder());
                    System.out.println("A vida do alvo é de " + novavida);
                    System.out.println("Seu ataque saiu");
                }
            }
        }
        else{
            System.out.println("Sem energia");
        }

    }
}

