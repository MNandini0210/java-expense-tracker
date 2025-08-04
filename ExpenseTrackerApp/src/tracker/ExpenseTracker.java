package tracker;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Expense Tracker ====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    expenses.add(new Expense(category, amount, date));
                    System.out.println("Expense added!");
                    break;

                case 2:
                    System.out.println("\nYour Expenses:");
                    for (Expense e : expenses) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amount;
                    }
                    System.out.println("Total Expense: ₹" + total);
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
