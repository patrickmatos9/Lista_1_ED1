public class Pilha {
    int tam;
    int tam_aux;
    int topo;
    boolean preenchido;
    char vet[];
    char vet_aux[];
    int topo_aux;
    public Pilha(int tam){
        this.tam = tam;
        this.tam_aux = tam / 2;
        this.topo = -1;
        this.topo_aux = -1;
        this.vet = new char[this.tam];
        this.vet_aux = new char[this.tam_aux];
        this.preenchido = false;
    }
    public int getTam(){
        return this.tam;
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
    public boolean igual(char elemento){
        if(elemento == this.pop()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean push(char elemento){
        if(!this.cheia()){    
            if (elemento == 'C'){ // Ignora o C 
                this.preenchido = true;
                return true;
            }
            if(this.preenchido == true){
                if (!igual(elemento)){ // Se forem diferentes
                    System.out.println("Y nao e inverso de X.");
                    System.exit(0);
                }
                else if(this.vazia()){
                    System.out.println("Y e inverso de X.");
                    return true;
                }
                else{ // Se forem iguais
                    return true;
                }
        }
            this.topo++;
            this.vet[this.topo] = elemento;
            return true;
        }
        else{
            System.out.println("Pilha cheia.");
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
        for(int i = 0; i <= topo; i++){
            System.out.println(this.vet[i]);
        }
    }
    public int getTopo(){
        return this.topo;
    }
    public void setTam(int tam){
       this.tam = tam;
    }
   
}
