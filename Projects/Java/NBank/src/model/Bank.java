package model;
import java.util.LinkedHashMap;

public class Bank {
    private final String agencia = "036-9";
    private LinkedHashMap<String,Cliente> listClientes = new LinkedHashMap<>();

    public Bank() {
    }
    public LinkedHashMap<String, Cliente> getListClientes() {
        return listClientes;
    }
    public void setListClientes(LinkedHashMap<String, Cliente> listClientes) {
        this.listClientes = listClientes;
    }
    public void setCliente(Cliente cliente){
            this.listClientes.put(cliente.getIdCliente(), cliente);
    }
    public Cliente getCliente(String idCliente){
        return this.listClientes.get(idCliente);
    }

    public String getAgencia() {
        return agencia;
    }
}
