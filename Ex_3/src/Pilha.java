public class Pilha {
    private int tam;
    private char vet[];
    private int topo_p1;
    private int topo_p2;

    public Pilha(int tam){
        this.tam = tam;
        this.topo_p1 = -1;
        this.topo_p2 = tam;
        this.vet = new char[this.tam];
    }
    private boolean cheia(){
        if(topo_p1 == tam - 1 || topo_p2 == 0)
            return true;
        else
            return false;
    }
    private boolean vazia(){
        if(topo_p1 == -1 && topo_p2 == tam)
            return true;
        else
            return false;
    }
    public char pop_p1(){
        char c = '\0';
        if(!vazia()){
            c = vet[topo_p1];
            topo_p1--;
        }
        else
            System.out.println("A pilha está vazia!");
        return c;
    }
    public boolean push_p1(char elemento){
        if(!cheia()){
            topo_p1++;
            vet[topo_p1] = elemento;
            return true;
        }
        else{
            System.out.println("A pilha está cheia!");
            return false;
        }
    }
    public char pop_p2(){
        char c = '\0';
        if(!vazia()){
            c = vet[topo_p2];
            topo_p2++;
        }
        else
            System.out.println("A pilha está vazia!");
        return c;
    }
    public boolean push_p2(char elemento){
        if(!cheia()){
            topo_p2--;
            vet[topo_p2] = elemento;
            return true;
        }
        else{
            System.out.println("A pilha está cheia!");
            return false;
        }
    }
    public void printPilha(){
        for(int i = 0; i < tam; i++)
            System.out.println(vet[i]);
    }
}
