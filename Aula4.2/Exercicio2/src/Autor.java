public class Autor {
    private String nome;
    private Saga[] sagas;

    public Autor(String nome, Saga[] sagas) {
        this.nome = nome;
        this.sagas = sagas;
    }

    void listarSagas(){
        for (int i = 0; i < sagas.length; i++) {
            System.out.println(sagas[i]);
        }
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public Saga[] getSagas() {
        return sagas;
    }

    public void setSagas(Saga[] sagas) {
        this.sagas = sagas;
    }

    void adicionarSaga(Saga saga) {
        // Criando um novo array aumentado em 1
        Saga[] newSagas = new Saga[sagas.length + 1];

        // Copiando as sagas do array original para o novo array
        for (int i = 0; i < sagas.length; i++) {
            newSagas[i] = sagas[i];
        }

        // Adicionando a nova saga ao final do novo array
        newSagas[newSagas.length - 1] = saga;

        // Atualizando a referência para o novo array
        this.sagas = newSagas;
    }

}
