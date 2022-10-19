public class Pilha {
    int tam;
    int topo;
    char vet[];

    public Pilha(int tamanho){
        this.tam = tamanho;
        this.topo = -1;
    }

    public boolean vazia(){
        if(topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean cheia(){
        if(topo == this.tam-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean push(char elemento){
        if(!cheia()){    
            topo++;
            vet[topo] = elemento;
            return true;
        }
        else{
            return false;
        }
    }
    public char pop(){
        char c = '\0';
        if(!vazia()){
            c = vet[topo];
            topo--;
        }
        return c;
    }

}
