package caja.test;

import caja.controllers.register;
import caja.objects.product;
import caja.storage.database;
import caja.views.view;

/*
    Proyector de caja registradora
 */
public class main {
    public static void main(String[] args) {
        register register = new register();
        register.register();
    }
}