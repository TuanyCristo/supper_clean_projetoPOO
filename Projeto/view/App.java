package view;

import usuario.*;

public class App {
    public static void main(String[] args) {
        Empresa a = new Empresa("tuany@tuany", "tuany", "123", "0000");

        String v, b;
        v = "tuany@tuany";
        b = "tuany";
        System.out.println(a.validaLogin(v, b));

    }
}