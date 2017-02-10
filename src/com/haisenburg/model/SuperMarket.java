package com.haisenburg.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperMarket {

    private Map<String, Product> productCatelog;

    public SuperMarket() {
        this.productCatelog = initProductCatelog();
    }

    private Map<String, Product> initProductCatelog() {
        HashMap<String, Product> productCatelog = new HashMap<>();
        productCatelog.put("9787121192036", new Product("Web前端黑客技术揭秘", "59"));
        productCatelog.put("9787121192035", new Product("Web前端黑客技术揭秘", "59"));
        productCatelog.put("9787121192034", new Product("Web前端黑客技术揭秘", "59"));
        productCatelog.put("9787121192033", new Product("Web前端黑客技术揭秘", "59"));
        productCatelog.put("9787121192032", new Product("Web前端黑客技术揭秘", "59"));
        return productCatelog;
    }

    public void run() {
        printWelcome();
        scanBarCode();
    }

    private void scanBarCode() {
        Scanner scanner = new Scanner(System.in);
        String barCode = scanner.nextLine();
        handleBarCode(barCode);
    }

    private void handleBarCode(String barCode) {
        Product product = productCatelog.get(barCode);
        if (product == null) {
            System.out.println("Product not found !");
        } else {
            System.out.println(product.print());
        }
    }

    private void printWelcome() {
        System.out.println("Welcome to WalMat Supermarket");
        System.out.println("-----------------------------");
    }
}
