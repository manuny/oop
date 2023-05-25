package OOP_HomeWork_07_1;

public class program {
    public static void main(String[] args) {
        order order = new order("", "", 0, 0);
        System.out.printf("Client name -  %s - Product - %s - Quantity - %d - Price - %d \n", order.getClientName(),
                order.getProduct(), order.getQnt(), order.getPrice());

        System.out.println("Сделайте новый заказ:");
        inputFromConsole inputFromConsole = new inputFromConsole();
        order order_1 = new order(inputFromConsole.getClientName(), inputFromConsole.getProduct(),
                inputFromConsole.getQnt(), inputFromConsole.getPrice());

        System.out.println("Новый заказ:");
        System.out.printf("Client name -  %s - Product - %s - Quantity - %d - Price  - %d\nSuper",
                order_1.getClientName(), order_1.getProduct(), order_1.getQnt(), order_1.getPrice());

        System.out.println("Запись заказа  в формате .Json:");
        saveToJson saveToJson = new saveToJson(order_1.getClientName(), order_1.getProduct(), order_1.getQnt(),
                order_1.getPrice(),
                "order.json");
        System.out.println("Вывод на консоль заказа  в формате .Json:");        
        System.out.println("{\n" + "\"clientName\":\"" + order_1.getClientName() + "\",\n" + "\"product\":\""
                + order_1.getProduct() + "\",\n" + "\"qnt\":" + order_1.getQnt() + "\"price\":" + order_1.getPrice()
                + "\n" + "}\n");

        // order.saveToJson();
    }
}
