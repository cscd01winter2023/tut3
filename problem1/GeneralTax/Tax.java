/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

public abstract class Tax {
    protected double getTaxRate() {
        return 0.0;
    }

    public double calculateTotalTax(double total) {
        return getTaxRate() * total;
    }

}
