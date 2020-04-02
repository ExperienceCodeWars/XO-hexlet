package io.hexlet.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void getName() throws Exception {
        final String inputValue = "Stas";
        final String exceptedValue = inputValue;

        final Player player = new Player(inputValue,null);

        final String actualValue = player.getName();

        assertEquals(exceptedValue,actualValue);
    }

    @Test
    public void getFigure() {
        final Figure inputValue = Figure.X;
        final Figure exceptedValue = inputValue;

        final Player player = new Player(null,inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(exceptedValue,actualValue);
    }
}