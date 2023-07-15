public class Pilha {
  private No topo; // substitui o atributo "inicio" por "topo"

  public Pilha() {
    topo = null;
  }

  public void desempilhar() {
    if (topo == null) {
      System.out.println("Erro! Pilha Vazia");
    } else {
      topo = topo.prox;
    }
  }

  public void empilhar(int e) {
    No novo = new No(e);
    if (topo == null) {
      topo = novo;
    } else {
      novo.prox = topo; // novo nó aponta para o antigo topo
      topo = novo; // topo passa a ser o novo nó adicionado
    }
  }

  // Método removeFim() removido

  public String toString() {
    No aux = topo;
    String resp = "";
    while (aux != null) {
      resp += aux.dado + " ";
      aux = aux.prox;
    }
    return resp.trim();
  }
}
