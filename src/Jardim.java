public class Jardim {
    private int quantidadeArvores;

    public void plantaArvores(int quantidade){
        if(quantidade > 0)
            this.quantidadeArvores += quantidade;
        else System.out.println("Impossível plantar número negativo de árvores");
    }

    public void cortaArvores(int quantidade){
        if(quantidade > 0 && quantidade <= this.quantidadeArvores)
            this.quantidadeArvores -= quantidade;
        else System.out.println("Impossível cortar " + quantidade + " árvore(s)");
    }

    public int getQuantidadeArvores(){
        return this.quantidadeArvores;
    }
}
