/*
 * Activity 4.9.3
 */
// Fish.java
public class Fish extends LakeObject {
    private double weight;
    private double cost;

    // Constructor to create a fish with a random weight
    public Fish(double weight) {
        this.weight = weight;
        this.cost = calculateCost(); // Price depends on weight
    }

    private double calculateCost() {
        // Cost increases with weight (for example)
        return weight * 10; // Simplified calculation for cost
    }

    @Override
    public String say() {
        return "You caught a fish!";
    }

    @Override
    public boolean wasCaught(Hook h) {
        return true; // Fish can be caught with a hook
    }

    // Method to get cost of the fish
    public double getCost() {
        return cost;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }
}
