package org.example.menu;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainMenuTest {

    MainMenu menu = new MainMenu();

    @Test
    void helpDefineSet() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String expected = "defineSet - This function define set of taxes for person";
        menu.help("defineSet");

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());
    }
    @Test
    void helpDefineSum() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String expected = "defineSum - This function define sum of taxes for person";
        menu.help("defineSum");

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());
    }
    @Test
    void helpSearchByIncome() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String expected = "searchByIncome - This function search taxes for person in range of income";
        menu.help("searchByIncome");

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());
    }
    @Test
    void helpSearchByTax() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String expected = "searchByTax - This function search taxes for person in range of size of tax";
        menu.help("searchByTax");

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());
    }
    @Test
    void helpSortAsc() {

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String expected = "sortAsc - This function sort taxes for person by ascending";
        menu.help("sortAsc");

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());

    }
    @Test
    void helpSortDesc() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        String expected = "sortDesc - This function sort taxes for person by descending";
        menu.help("sortDesc");

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());

    }

    @Test
    void executeDefineSum() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        menu.execute("defineSum");
        String expected = "Sum of taxes: 13208.85";

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());
    }

    @Test
    void printAllCommands() {

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        menu.printAllCommands();

        String expected = "defineSet - This function define set of taxes for person\r\n" +
                " defineSum - This function define sum of taxes for person\r\n" +
                " searchByIncome - This function search taxes for person in range of income\r\n" +
                " searchByTax - This function search taxes for person in range of size of tax\r\n" +
                " sortAsc - This function sort taxes for person by ascending\r\n" +
                " sortDesc - This function sort taxes for person by descending";

        Assert.assertEquals(expected, outputStreamCaptor.toString().trim());

    }
}