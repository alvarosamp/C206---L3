//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vampiro vampiro = new Vampiro(28,300,200,100,true);
        Zumbi zumbi = new Zumbi(34,250,700,321);
        Monstro monstro = new Monstro(20,400,500);


        Feitico[] feitico = new Feitico[5];
        feitico[0] = new Feitico("Cegueira",50);
        feitico[1] = new Feitico("Invisibiliade", 40);
        Bruxa bruxa = new Bruxa(59,120,600,feitico);

       // bruxa.listarFeitico();
       // bruxa.aprenderFeitico("Envenenamento", 60);
       // bruxa.listarFeitico();
       // bruxa.esquecerFeitico(1);
       // bruxa.listarFeitico();
       // bruxa.lancarFeitico(monstro,1);

       // monstro.assustar(vampiro);

        vampiro.atacarComMordida(bruxa);
        vampiro.recuperarVida();
        vampiro.assustar(bruxa);
        vampiro.transformar();


    }
}