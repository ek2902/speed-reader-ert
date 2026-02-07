package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class ThirdGreatestTests {
	
	@Test
	public void exampleUnitTest() {
		int[] arr = { 3, 8, 4, 7, 2 };
		assertEquals(4, Functions.thirdGreatest(arr));
	}

	@Test
	public void allSortedUnitTest() {
		int[] arr = { 2, 3, 4, 7, 8 };
		assertEquals(4, Functions.thirdGreatest(arr));
	}

	@Test
	public void oneEltUnitTest() {
		int arr[] = { 1 };
		assertEquals(1, Functions.thirdGreatest(arr));
	}

	@Test
	public void twoEltsUnitTest() {
		int arr[] = { 1, 2 };
		assertEquals(1, Functions.thirdGreatest(arr));
	}

	@Test
	public void threeEltsUnitTest() {
		int[] arr = { 4, 7, 2 };
		assertEquals(2, Functions.thirdGreatest(arr));
	}
	
	@Property
	public boolean examplePropertyTest(@ForAll @IntRange(min = 1, max = 1000) int sz,
									   @ForAll int k) {
		int[] arr = new int[sz];
		for (int i = 0; i < sz; i++) {
			arr[i] = k;
		}
		return Functions.thirdGreatest(arr) == k;
	}

	@Property
	public boolean decreasingKPropertyTest(@ForAll @IntRange(min = 3, max = 1000) int sz,
									   @ForAll @IntRange(min = 3) int k) {
		int[] arr = new int[sz];
		for (int i = 0; i < sz; i++) {
			if (k == 0) {
				arr[i] = 0;
			} else {
			arr[i] = k;
			}
			k--;
		}
		return Functions.thirdGreatest(arr) == k - 2;
	}

	@Property
	public boolean twoEltsPropertyTest(@ForAll @IntRange(min = 3, max = 1000) int sz,
									   @ForAll int a, @ForAll int b) {
		int[] arr = { a, b };
		return Functions.thirdGreatest(arr) == Math.max(a, b);
	}

	@Property
	public boolean myNewOtherPropertyTest(@ForAll @IntRange(min = 3, max = 1000) int sz,
									   @ForAll int a, @ForAll int b, @ForAll int c) {
		int[] arr = { a, b, c };
		return Functions.thirdGreatest(arr) == Math.min(a, Math.min(b, c));
	}
}
