package OOP_HomeWork_07_2;

public class reportItem {
    private String description;
    private float amount;

    public reportItem(String description, float amount) {
        this.description = description;
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
