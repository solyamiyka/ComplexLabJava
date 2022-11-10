package org.example.taxes;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class ComparatorSortAscTest {

    Taxes person = new Taxes();
    @Test
    void compare() {
        Income income1 = new Income("award", 1970.00);
        Income income2 = new Income("main income", 65200.00);

        income1.getPercentageOfTax();
        income1.getSizeOfTax();
        income2.getPercentageOfTax();
        income2.getSizeOfTax();

        int expected = (int)(income1.sizeOfTax - income2.sizeOfTax);
        Income object1 = person.getTaxes().get(0);
        Income object2 = person.getTaxes().get(1);

        int comparator = new ComparatorSortAsc().compare(object1,object2);

        Assert.assertEquals(expected, comparator);
    }
}