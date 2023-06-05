package caja.storage;

import caja.objects.meat;
import caja.objects.potato;
import caja.objects.product;
import caja.objects.raice;

import java.util.ArrayList;
import java.util.List;

public class database {
    private product[] products;
    private List<product> purchases;
    private List<product> sales;

    public database() {
        products = new product[3];
        product potato = new potato("Sabritas");
        product rice = new raice("Morelos");
        product meat = new meat("Purísima");

        products[0] = potato;
        products[1] = rice;
        products[2] = meat;

        purchases = new ArrayList<>();
        sales = new ArrayList<>();
    }

    public product getByIndex(int i) {
        if (i < 0 || i > 2) {
            System.out.println("Índice no válido");
            return null;
        }

        product result = null;
        try {
            result = products[i].clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return result;
    }

    public product[] getAll() {
        product[] result = new product[3];

        try {
            result[0] = products[0].clone();
            result[1] = products[1].clone();
            result[2] = products[2].clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        return result;
    }

    public void buy(product product) {
        product temp;
        switch (product.getClass().getSimpleName()) {
            case "potato":
                temp = products[0];
                break;
            case "raice":
                temp = products[1];
                break;
            case "meat":
                temp = products[2];
                break;
            default:
                System.out.println("No válido");
                return;
        }
        temp.setAmount(temp.getAmount() + product.getAmount());
        temp.setPrice(product.getPrice());
        purchases.add(product);
    }

    public void sale(product product) {
        product temp;
        switch (product.getClass().getSimpleName()) {
            case "potato":
                temp = products[0];
                break;
            case "raice":
                temp = products[1];
                break;
            case "meat":
                temp = products[2];
                break;
            default:
                System.out.println("No válido");
                return;
        }
        temp.setAmount(temp.getAmount() - product.getAmount());
        product.setPrice(temp.getPrice() * 1.25);
        sales.add(product);
    }

    public List<product> getPurchases() {
        return purchases;
    }

    public List<product> getSales() {
        return sales;
    }
}
