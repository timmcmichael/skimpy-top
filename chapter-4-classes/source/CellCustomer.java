/*
 * CellCustomer
 * This class represents a customer of a cell phone service company, focusing on the customer's data plan and usage.
 */

public class CellCustomer {

    // Fields (instance variables)
    private String name;
    private String phoneNumber;
    private double monthlyData;
    private double remainingData;

    // Getters
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getMonthlyData() {
        return this.monthlyData;
    }

    public double getRemainingData() {
        return this.remainingData;
    }

    // Setters
    public void setName(String cName) {
        this.name = cName;
    }

    public void setPhoneNumber(String cPhoneNumber) {
        this.phoneNumber = cPhoneNumber;
    }

    public void setMonthlyData(double cMonthlyData) {
        this.monthlyData = cMonthlyData;
        this.remainingData = cMonthlyData;
    }

    // Mutators
    public void useData(double dataUsed) {
        this.remainingData -= dataUsed;
    }

    public void addData(double amount) {
        this.remainingData += amount;
    }

    public void resetData() {
        this.remainingData = this.monthlyData;
    }
    
}
