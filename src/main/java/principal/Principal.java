package principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Principal {

    public static void main(String[] args) {
        while (true) {
            ArrayList<Conta> listaContas = new ArrayList<>();

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Criar conta Poupança\n"
                    + "2- Criar conta Corrente\n"
                    + "9- Cancelar (sair)"));

            switch (opcao) {
                case 1:
                    ContaPoupanca cp = new ContaPoupanca();
                    cp.setNome(JOptionPane.showInputDialog("Digite o nome para a conta poupança"));
                    
                    if (cp.getSaldo() == 0) {
                        int opcaoDeposito = Integer.parseInt(JOptionPane.showInputDialog("O seu saldo está zerado, deseja fazer um deposito?\n"
                                + "Sim(1)\n"
                                + "Não(2)"));
                        if (opcaoDeposito == 1) {
                            int valorDeposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
                            cp.setDeposito(valorDeposito);
                            JOptionPane.showMessageDialog(null, valorDeposito + "R$ depositados na conta" + " de " + cp.getNome());
                        } else {
                            System.out.println("Operaçao cancelada.");
                            break;
                        }
                    }
                    cp.setJuros(10);
                    listaContas.add(cp);
                    break;
                case 2:
                   ContaCorrente cc = new ContaCorrente();
                    cc.setNome(JOptionPane.showInputDialog("Digite o nome para a conta poupança"));
                    
                    if (cc.getSaldo() == 0) {
                        int opcaoDeposito = Integer.parseInt(JOptionPane.showInputDialog("O seu saldo está zerado, deseja fazer um deposito?\n"
                                + "Sim(1)\n"
                                + "Não(2)"));
                        if (opcaoDeposito == 1) {
                            int valorDeposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
                            cc.setDeposito(valorDeposito);
                            JOptionPane.showMessageDialog(null, valorDeposito + "R$ depositados na conta" + " de " + cc.getNome());
                        } else {
                            System.out.println("Operaçao cancelada.");
                            break;
                        }
                    }
                    cc.setTaxaServico(10);
                    listaContas.add(cc);
                    break;
                default:
                    System.out.println("erro");
                    break;
            }
            if (opcao == 9) {
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                break;
            }
        }
    }

}
