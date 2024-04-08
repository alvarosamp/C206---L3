public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

    public  Cliente(String nome, String cpf, double saldo, double limite) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta(saldo, limite);
    }
    boolean sacarDinheiro(double valor){

        if(conta.getSaldo() >= valor){
            double novoSaldo;
            novoSaldo = conta.getSaldo() - valor;
            conta.setSaldo(novoSaldo);
            System.out.println("Seu saldo atual é de "+conta.getSaldo());
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;

        }


    }
    void depositarDinheiro(double valor){
        double novovalor;
        novovalor = valor + conta.getSaldo();
        conta.setSaldo(novovalor);
        System.out.println("Seu novo saldo é de " +conta.getSaldo());
    }
    boolean comprarComCredito(double valor){
        if((conta.getSaldo()+conta.getLimite()) >= valor) {
            System.out.println("Voce pode comprar no credito");
            return true;
        }
        else {
            System.out.println("Nao é possivel comprar no credito");
            return false;
        }
    }

    @Override
    public java.lang.String toString() {
        return "Cliente{" +
                "nome=" + nome +
                ", cpf=" + cpf +
                ", conta=" + conta +
                '}';
    }
}
