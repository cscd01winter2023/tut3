/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

public abstract class Tax {
    protected double getPstRate() {
        return 0.0;
    }

    protected double getGstRate() {
        return 0.0;
    }

    protected double getHstRate() {
        return 0.0;
    }

    private double calculatePstTax(double total) {
        return getPstRate() * total;
    }

    private double calculateGstTax(double total) {
        return getGstRate() * total;
    }

    private double calculateHstTax(double total) {
        return getHstRate() * total;
    }

    public double calculateTotalTax(double total) {
        return calculatePstTax(total) +
                calculateGstTax(total) +
                calculateHstTax(total);
    }
}
