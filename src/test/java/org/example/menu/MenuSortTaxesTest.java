package org.example.menu;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MenuSortTaxesTest {

    MenuSortTaxes sortTaxesAsc = new MenuSortTaxes("Asc");
    MenuSortTaxes sortTaxesDesc = new MenuSortTaxes("Desc");

    @Test
    void executeSortAsc() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        sortTaxesAsc.execute();
        String expected = "\n Sorted taxes by ascending:\r\n" +
                "1.  [ nameOfIncome: 'funds as a gift', sizeOfIncome = 2460.0, sizeOfTax = 110.7, percentageOfTax = 4.5 ] \n" +
                "2.  [ nameOfIncome: 'award', sizeOfIncome = 1970.0, sizeOfTax = 384.15, percentageOfTax = 19.5 ] \n" +
                "3.  [ nameOfIncome: 'main income', sizeOfIncome = 65200.0, sizeOfTax = 12714.0, percentageOfTax = 19.5 ] \n";

        String actual = outputStreamCaptor.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    void executeSortDesc() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        sortTaxesDesc.execute();
        String expected = "\n Sorted taxes by descending:\r\n" +
                "1.  [ nameOfIncome: 'main income', sizeOfIncome = 65200.0, sizeOfTax = 12714.0, percentageOfTax = 19.5 ] \n" +
                "2.  [ nameOfIncome: 'award', sizeOfIncome = 1970.0, sizeOfTax = 384.15, percentageOfTax = 19.5 ] \n" +
                "3.  [ nameOfIncome: 'funds as a gift', sizeOfIncome = 2460.0, sizeOfTax = 110.7, percentageOfTax = 4.5 ] \n";

        String actual = outputStreamCaptor.toString();
        Assert.assertEquals(expected, actual);
    }
}