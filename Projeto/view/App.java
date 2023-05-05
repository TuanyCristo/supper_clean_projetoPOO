package view;

import java.sql.SQLException;

import usuario.controller.ClienteController;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ClienteController c = new ClienteController();

        c.cadastrarCliente("null", "457845854", "jajja@jajaj", "1234");
    }

           

}