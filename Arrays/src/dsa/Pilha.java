package dsa;

public class Pilha<T> {
    private No<T> entradaPilha;

    public Pilha() {
        this.entradaPilha = null;
    }

    public boolean isEmpty(){
        return entradaPilha == null;
    }

    public void push(No<T> novoNo){
        No<T> aux = entradaPilha;
        entradaPilha = novoNo;
        entradaPilha.setProximoNo(aux);
    }

    public No<T> pop() {
        if(isEmpty()){
            No<T> noPoped = entradaPilha;
            entradaPilha = entradaPilha.getProximoNo();
            return noPoped;
        }
        return null;
    }

    public No<T> top(){
        return entradaPilha;
    }

}
