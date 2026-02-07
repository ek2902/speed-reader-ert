package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class SumTests {

    @Test
	public void nPositive() {
		int n = 4;
		assertEquals(10, Functions.sum(n));
	}

    @Test
	public void nZero() {
		int n = 0;
		assertEquals(0, Functions.sum(n));
	}

    @Test
	public void nOne() {
		int n = 1;
		assertEquals(1, Functions.sum(n));
	}

    @Test
	public void nNegative() {
		int n = -4;
		assertEquals(0, Functions.sum(n));
	}

    @Test
	public void nThirty() {
		int n = 30;
		assertEquals(465, Functions.sum(n));
	}

    @Property
	public boolean formulaTest(@ForAll @IntRange(max = 46340) int k) {
        int formulaSum = ((k * (k + 1)) / 2);
		return (Functions.sum(k) == formulaSum);
	}
}
