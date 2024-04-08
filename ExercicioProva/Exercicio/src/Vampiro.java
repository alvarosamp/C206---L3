public class Vampiro extends Monstro{
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego) {
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;

    }

    boolean transformar() {
        if (formaDeMorcego) {
            System.out.println("Virando morcego");
            return true;
        }
        return false;
    }
    void recuperarVida(){
        int novaVida= getVida()+50;
        int aux = getVida();
        setVida(novaVida);
        System.out.println("Sua vida era " +aux+" agora foi transformada para "+novaVida);


    }
    void atacarComMordida(Monstro monstroAlvo){
        int novaenergia = getEnergia();
        novaenergia -=40;
        if(novaenergia >=40) {
            int vidaalvo =  monstroAlvo.getVida();
            vidaalvo -= 30;
            monstroAlvo.setVida(vidaalvo);
            System.out.println("Seu ataque saiu");
        }
        else{
            System.out.println("Sem energia");
        }

    }

}
