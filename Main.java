import javax.swing.*;

class Main {
  public static void main(String[] args) {
    Pilha p1 = new Pilha();
    Fila f1 = new Fila();
    int op;
    int n;
    String menu = "MENU\n1 - Empilhar\n2 - Desempilhar\n3 - Mostrar todos elementos Pilha\n4 - ADD elementos no inicio da Fila\n5 - Remove elementos fila\n6 - Mostrar todos elementos da Fila\n99 - Sair";
    do {
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch (op) {
        case 1:
          n = Integer.parseInt(JOptionPane.showInputDialog("Valor? "));
          p1.empilhar(n);
          break;
        case 2:
          p1.desempilhar();
          JOptionPane.showMessageDialog(null, "Removido");
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "Pilha: " + p1.toString());
          break;
        case 4:
          n = Integer.parseInt(JOptionPane.showInputDialog("Add fila:  "));
          f1.adicionaFim(n);
          break;
        case 5:
          f1.removeInicio();
          JOptionPane.showMessageDialog(null, "Removido");
          break;
        case 6:
          JOptionPane.showMessageDialog(null, "Fila: " + f1.toString());
          break;
        case 99:
          System.out.println("Saindo");
          break;
        default:
          System.out.println("ERRO! Digite uma opção válida");
      }
    } while (op != 99);
  }
}
