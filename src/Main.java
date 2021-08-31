public class Main {
    public static void main(String[] args) {
        Jardim meuJardim = new Jardim();

        meuJardim.plantaArvores(2);
        meuJardim.cortaArvores(3);

        System.out.println(meuJardim.getQuantidadeArvores());
    }
}
