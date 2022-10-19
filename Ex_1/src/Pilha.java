public class Pilha {
    int tam;
    int topo;
    char vet[];

    public Pilha(int tamanho){
        this.tam = tamanho;
        this.topo = -1;
        this.vet = new char[tam];
    }

    public boolean vazia(){
        if(this.topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean cheia(){
        if(this.topo == this.tam - 1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean push(char elemento){
        if(!this.cheia()){    
            this.topo++;
            this.vet[topo] = elemento;
            return true;
        }
        else{
            return false;
        }
    }
    public char pop(){
        char c = '\0';
        if(!this.vazia()){
            c = this.vet[topo];
            this.topo--;
        }
        return c;
    }
    public void printaPilha(){
        for(int i = 0; i < tam; i++){
            for(int j = 1; j <= tam; j++){
                System.out.println(j + ' ' + this.vet[i]);
            }
        }
    }
}
