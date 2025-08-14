package dsa;

public class ListaEncadeada<T> {
    No<T> noEntrada;

    public ListaEncadeada(No<T> noEntrada) {
        this.noEntrada = null;
    }

    public boolean isEmpty(){
        return noEntrada == null;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = noEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                };
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(isEmpty()){
            noEntrada = novoNo;
            return;
        }
        No<T> noAux = noEntrada;
        for(int i = 0; i < size()-1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    private void validaIndice(int indice){
        if(indice >= size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice: " + indice + "\n Esta lista só vai até: " + (size() - 1));
        }
    }

    private No<T> getNo(int indice){

        validaIndice(indice);
        No<T> noAux =  noEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i < size(); i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int indice){
        return getNo(indice).getDados();
    }



}
