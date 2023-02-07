/*
 * CSCD01 Winter 2023 Tut 3
 */

package GeneralTax;

import java.lang.reflect.InvocationTargetException;

public interface TaxInterface {
    public Tax getTax() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException;
}
