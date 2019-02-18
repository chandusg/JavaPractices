package com.com.javapractice.programs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RoundOffFor5Test {

	int count = 10;
	Integer input = 5, result = 5;

	public RoundOffFor5Test(Integer input, Integer result) {
		int count = 0;
		this.input = input;
		this.result = result;
		this.count = count;
	}

	@Before
	public void init() {
	}

	@Parameterized.Parameters
	public static List<Object[]> primeNumbers() {
		// @formatter:off
		return Arrays.asList(new Object[][] {
			{ 2, 2 },
				 { 18, 20 },
				 { 25, 25 },
				 { 17, 17 },
				 { 0, 0 },
		});
		// @formatter:on

	}

	@Test
	public void test() {

		int result = RoundOffFor5.getResult(this.input);
		assertTrue(result == this.result);
	}

}
