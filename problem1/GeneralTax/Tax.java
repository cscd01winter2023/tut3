/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

import java.lang.reflect.InvocationTargetException;

public abstract class Tax {
    protected double getTaxRate() {
        return 0.0;
    }

    public double calculateTotalTax(double total) {
        return getTaxRate() * total;
    }

}
class OntarioTax extends Tax implements TaxInterface{
    @Override
    protected double getTaxRate() {
        return 0.13;
    }

    public Tax getTax() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return this;
    }

}

class PIETax extends Tax implements TaxInterface{
    @Override
    protected double getTaxRate() {
        return 0.15;
    }

    public Tax getTax() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return this;
    }

}