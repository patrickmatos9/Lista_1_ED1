import java.util.Scanner;
public class Pilha {
    int tam;
    int tam_x;
    int tam_y;
    int topo;
    char vet[];
    char vet_x[];
    char vet_y[];
    Scanner sc;

    public Pilha(){
        this.tam = 10;
        this.tam_x = this.tam / 2;
        this.tam_y = this.tam / 2;
        this.topo = -1;
        this.vet = new char[this.tam];
        this.vet_x = new char[this.tam_x];
        this.vet_y = new char[this.tam_y];
        this.sc = new Scanner(System.in);
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
    public boolean push(){
        while(true){
            if(!this.cheia()){    
                this.topo++;
                System.out.println("Insira elemento (A, B ou C):");
                char elemento = sc.next().charAt(0);
                if(elemento != 'A' && elemento != 'B' && elemento != 'C'){ // Verifica caracter errado
                    this.topo--;
                    continue;
                }
                else{
                    this.vet[this.topo] = elemento;
                    return true;
                }   
            }
            else{
                return false;
            }
        }
    }
    public char pop(){
        char c = '\0';
        if(!this.vazia()){
            c = this.vet[topo];
            this.topo--;
            System.out.println(this.topo);
        }
        return c;
    }
    public void preencheX(){
        for(int i = 0; this.vet[i] == 'C'; i++){
            this.vet_x[i] = this.vet[i];
        }
    }
    public int pegaIndiceC(){
        int indiceC = Integer.MIN_VALUE;
        for(int i = 0; i < this.tam; i++){
            if(this.vet[i] == 'C'){
                indiceC = i;
            }
        }
        return indiceC;
    }
    public void preencheY(){
        int i = Integer.MIN_VALUE;
        for(i = pegaIndiceC() + 1; i < this.tam; i++){
            this.vet_y[i] = this.vet[i];
        }
    }
    public boolean comparaXY(){
        char x_invertido[];
        x_invertido = new char[tam_x];
        for(int i = tam_x-1; i == 0; i--){
            for(int j = 0; j < tam_x; j++){
                x_invertido[j] = vet_x[i];
            }
        }
        for(int i = 0; i < tam_x; i++){
            if(x_invertido[i] != this.vet_y[i]){
                System.out.println("Y não é o inverso de X!");
                return false;
            }
        }
        System.out.println("Y é o inverso de X!");
        return true;
    }
    public void printaPilha(){
        for(int i = 0; i <= topo; i++){
            System.out.println(this.vet[i]);
        }
    }
    public int getTopo(){
        return this.topo;
    }
    public void setTam(){
        while(true){
            System.out.println("Insira o tamanho da Pilha");
            int tam = sc.nextInt();
            this.tam = tam;
            this.tam_x = tam / 2;
            this.tam_y = tam / 2;
            if(tam <= 0){
                System.out.println("Tamanho inválido");
                continue;
            }
            else{
                break;
            }
        }
    }
   
}
