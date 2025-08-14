package dsa;

public class No<T> {
    private T dados;
    private No<T> proximoNo;

    public No(T dados) {
        this.dados = dados;
        this.proximoNo = null;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No {" +
                "dados = " + dados +
                '}';
    }
}
