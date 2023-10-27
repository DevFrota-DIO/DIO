package comunications;

import model.Bank;
import model.Cliente;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private String tipo;
    private String[] dados;
    private Integer opt;

    public Menu() {

    }

    public void setMenu(String tipo) {
        String[] menuPrincipal = {
                "1 - Menu Acessar Conta.",
                "2 - Criar Conta."};
        String[] menuAcessar = {
                "Digite o número da Agência!",
                "Digite o número do CPF!"};
        String[] menuCriar = {
                "Digite o seu nome!",
                "Digite o número do seu CPF!"};
        switch (tipo){
            case "principal":
                menuPrincipal(menuPrincipal);
                break;
            case "acessar":
                imprimirMenu(menuAcessar);
                System.out.println("Dados da sua conta:");
                break;
            case "criar":
                imprimirMenu(menuCriar);
                System.out.println("Sua conta foi criada com sucesso");
                break;
            default:
                throw new IllegalStateException("Tipo inválido " + tipo);
        }
    }

    private void imprimirMenu(String[] args) {
        String [] dadosIn = new String[2];
        for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                dadosIn[i] = scan.nextLine();
        }
        this.setDados(dadosIn);
    }
    private void menuPrincipal(String[] args) {
        for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
        }
        this.setOpt(Integer.valueOf(scan.nextLine()));
    }

    public Integer getOpt() {
        return opt;
    }

    public void setOpt(Integer opt) {
        this.opt = opt;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getDados() {
        return dados;
    }

    public void setDados(String[] dados) {
        this.dados = dados;
    }

    public void menuBemvindo(Bank bank) {
        System.out.println("|----Bemvindo ao NBank----|");
        System.out.println("Agência - "+ bank.getAgencia());
    }

    public void printCliente(Cliente cliente, int cod){
        if (cod == 0){
            System.out.println("ID Cliente " + cliente.getIdCliente());
            System.out.println("Cliente - " + cliente.getNome());
            System.out.println("CPF - " + cliente.getCpf());
            System.out.println("Conta " + cliente.getConta().getNumConta());
            System.out.println("-----------O B R I G A D O !--------------");
        }else{
            System.out.printf("Olá %s, " +
                    "\nobrigado por criar uma conta em nosso banco, " +
                    "\nsua agência é 036-9, conta %s " +
                    "\ne seu saldo %s " +
                    "\njá está disponível para saque\n",
                    cliente.getNome(),
                    cliente.getConta().getNumConta(),
                    cliente.getConta().getSaldo());
            System.out.println("-----------O B R I G A D O !--------------");
        }


    }
}
