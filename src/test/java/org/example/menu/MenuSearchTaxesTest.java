package org.example.menu;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class MenuSearchTaxesTest {

    MenuSearchTaxes searchByIncome = new MenuSearchTaxes("ByIncome", 2000,70000);
    MenuSearchTaxes searchByTax = new MenuSearchTaxes("ByTax", 100, 1000);

    @Test
    void executeSearchByIncome() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        searchByIncome.execute();
        String expected = "\n Taxes searched by income in range [2000.0; 70000.0]:\r\n" +
                "1.  [ nameOfIncome: 'main income', sizeOfIncome = 65200.0, sizeOfTax = 12714.0, percentageOfTax = 19.5 ] \n" +
                "2.  [ nameOfIncome: 'funds as a gift', sizeOfIncome = 2460.0, sizeOfTax = 110.7, percentageOfTax = 4.5 ] \n";

        String actual = outputStreamCaptor.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    void executeSearchByTax() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        searchByTax.execute();
        String expected = "\n Taxes searched by tax in range [100.0; 1000.0]:\r\n" +
                "1.  [ nameOfIncome: 'award', sizeOfIncome = 1970.0, sizeOfTax = 384.15, percentageOfTax = 19.5 ] \n" +
                "2.  [ nameOfIncome: 'funds as a gift', sizeOfIncome = 2460.0, sizeOfTax = 110.7, percentageOfTax = 4.5 ] \n";

        String actual = outputStreamCaptor.toString();
        Assert.assertEquals(expected, actual);
    }
}