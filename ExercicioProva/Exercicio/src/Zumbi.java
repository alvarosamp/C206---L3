public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos) {
        super(idade, vida, energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }
    void atacarComMordida(Monstro monstroAlvo){

        int novaenergia = getEnergia();
        if(novaenergia >=30){
            novaenergia-=30;
            setEnergia(novaenergia);
            int vidaAlvo = monstroAlvo.getVida(); // Obtém a vida do monstro alvo
            vidaAlvo -= 30; // Reduz 30 pontos de vida do monstro alvo
            monstroAlvo.setVida(vidaAlvo); // Atualiza a vida do monstro alvo
            System.out.println("Vida do monstro alvo" + monstroAlvo.getVida());
            System.out.println("Sua energia é de"+getEnergia());
        }
        else{
            System.out.println("Sem energia");
        }


    }
}
