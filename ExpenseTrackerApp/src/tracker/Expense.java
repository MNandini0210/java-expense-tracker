package tracker;

public class Expense {
    String category;
    double amount;
    String date;

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String toString() {
        return date + " - " + category + ": ₹" + amount;
    }
}
