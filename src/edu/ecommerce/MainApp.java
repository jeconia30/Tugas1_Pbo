package edu.ecommerce;

public class MainApp {
    public static void main(String[] args) {
        Order orderUtama = new Order("ORD-9921", "Gemini User");

        Order.OrderItem item1 = orderUtama.new OrderItem("Laptop Gaming", 15000000, 1);
        Order.OrderItem item2 = orderUtama.new OrderItem("Mouse Wireless", 350000, 2);
        Order.OrderItem item3 = orderUtama.new OrderItem("Mousepad RGB", 150000, 1);

        Order.OrderItem[] keranjang = { item1, item2, item3 };

        orderUtama.hitungTotal(keranjang);

        orderUtama.tampilkanRincian(keranjang);
    }
}
