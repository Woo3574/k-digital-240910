package Ct.ArrayList응용예제;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Order {
    private ArrayList<Product> products = null;
    private BigDecimal total;

    public Order() {
        products = new ArrayList<>();
        total = BigDecimal.ZERO;
    }

    public void addItem(Product product) {
        products.add(product);
        total = total.add(product.getPrice()); // 빅데시멀은 객체 타입
    }

    public Product getItem(String name) {
        for (Product e : products) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public boolean removeItem(String name) {
        for (Product e : products) {
            if(e.getName().equals(name)) {
                products.remove(e); // 해당 요소를 삭제
                total = total.subtract(e.getPrice());
                return true;
            }
        }
        return false;
    }
    // 500만원 *0.04 (세금 4%)
    public BigDecimal calculateFinalPrice(BigDecimal taxRate) {
        // 주문 금액에 세금을 곱해서 세액을 만들어 냄
        BigDecimal taxAmount = total.multiply(taxRate);
        BigDecimal finalPrice =total.add(taxAmount);
        return finalPrice.setScale(2, RoundingMode.HALF_UP);
    }
}
