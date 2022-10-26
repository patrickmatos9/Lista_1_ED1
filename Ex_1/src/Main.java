public class Main {
    public static void main(String[] args){
        Pilha p_principal = new Pilha(4);
        //Pilha p_auxiliar = new Pilha(p_principal.getTam() / 2); // Auxiliar precisa ter a metade inteira do Tam 
        p_principal.push('A');
        p_principal.push('B');
        p_principal.push('C');
        p_principal.push('B');
        p_principal.push('A');



    }
}
