package Ct.ArrayList응용예제;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderMain {
    private final Scanner sc = new Scanner(System.in);
    private BigDecimal total;
    private List products;

    public OrderMain() {
        products = new ArrayList<>();
        total = BigDecimal.valueOf(0);
    }

    public void setAddItem(String product) {
        product = sc.nextLine();



    }
}
