package org.example.menu;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class MenuDefineSetTest {

    @Test
    void execute() {

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        new MenuDefineSet().execute();
        String expected = "\n" +
                " Set of taxes:\r\n" +
                "110.7\r\n" +
                "12714.0\r\n" +
                "384.15\r\n";

        String actual = outputStreamCaptor.toString();
        Assert.assertEquals(expected, actual);

    }
}