package services;

import comunications.Menu;
import model.Bank;
import model.Cliente;

public class Controler {
    Bank bank = new Bank();
    Menu novoMenu = new Menu();
    Cliente cliente;

    public Controler() {
    }
    public void start(){
        bemvindo();
        createMenu();
    }

    private void bemvindo() {
        novoMenu.menuBemvindo(bank);
    }

    private void createMenu() {
        String[] opt = {"acessar","criar"};
        novoMenu.setMenu("principal");
        int code = novoMenu.getOpt();
        while (code != 0){
            novoMenu.setMenu(opt[code - 1]);
            setDados(novoMenu.getDados(), opt[code - 1]);
            novoMenu.setMenu("principal");
            code = novoMenu.getOpt();
        }

    }

    private void setDados(String[] dados, String str) {

        if (str.equalsIgnoreCase("acessar")){
            for (String key : bank.getListClientes().keySet()) {
                if (bank.getListClientes().get(key).getCpf().equalsIgnoreCase(dados[1])){
                    novoMenu.printCliente(bank.getListClientes().get(key), 0);
                }
            }

        }else{
            cliente = new Cliente(dados[0],dados[1]);
            bank.setCliente(cliente);
            novoMenu.printCliente(cliente, 1);
        }
    }
}
