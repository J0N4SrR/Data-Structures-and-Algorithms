package dsa;

public class Fila<T> {
    private No<T> noEntrada;

    public Fila(No<T> noEntrada) {
        this.noEntrada = null;
    }

    public boolean isEmpty() {
        return noEntrada == null;
    }

    public void enqueue(No<T> novoNo) {
        novoNo.setProximoNo(noEntrada);
        noEntrada = novoNo;
    }

    public No<T> first() {
        if (!isEmpty()) {
            No<T> primeiroNo = noEntrada;
            while(true){
                if(primeiroNo.getProximoNo() != null) {
                primeiroNo = primeiroNo.getProximoNo();
            }else{
                break;}
            }
            return primeiroNo;
        }
        return null;
    }
    public No<T> dequeue() {
        if (!isEmpty()) {
            No<T> primeiroNo = noEntrada;
            No<T> noAuxiliar = noEntrada;
            while(true){
                if(primeiroNo.getProximoNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProximoNo();
            }else{
                noAuxiliar.setDados(null);
                break;
                }
            }
            return primeiroNo;
        }
        return null;
    }


}
