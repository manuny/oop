package OOP_HomeWork_07_1;
  
public class order {
    private String clientName;
    private String product;
    private Integer qnt;
    private Integer price;

    public order(String clientName, String product, Integer qnt, Integer price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQnt() {
        return qnt;
    }

    public Integer getPrice() {
        return price;
    }
}
