public class Fila {
    private No inicio;

    public Fila() {
        inicio = null;
    }

    public int removeInicio() {
        int resp = -1;
        if (inicio == null) {
            System.out.println("Erro! Fila Vazia");
        } else {
            resp = inicio.dado;
            inicio = inicio.prox;
        }
        return resp;
    }

    public void adicionaFim(int e) {
        No novo = new No(e);
        if (inicio == null) {
            inicio = novo;
        } else {
            No aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = novo;
        }
    }

    // Método removeFim() removido

    public String toString() {
        No aux = inicio;
        String resp = "";
        while (aux != null) {
            resp += aux.dado + " ";
            aux = aux.prox;
        }
        return resp.trim();
    }
}
