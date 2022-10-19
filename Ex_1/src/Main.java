public class Main {
    public static void main(String[] args){
        Pilha p1 = new Pilha();
        p1.setTam();
        for(int i = 0; i < p1.tam; i++){
            p1.push(); // Pilha toda preenchida
        }
        p1.preencheX();
        p1.preencheY();
        p1.comparaXY();

    }
}
