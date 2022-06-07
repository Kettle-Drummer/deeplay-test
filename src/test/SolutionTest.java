package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Solution;

class SolutionTest {
	
	@Test
	void testHuman10(){
		int res = Solution.getResult("STWSWTPPTPTTPWPP", "Human");

		Assert.assertEquals(10, res);
	}
	@Test
	void testSwamper30(){
		int res = Solution.getResult("TTTTTTTTTTTTTTTT", "Swamper");

		Assert.assertEquals(30, res);
	}
	@Test
	void testWoodman13(){
		int res = Solution.getResult("SPSPSPSPSPSPSPSP", "Woodman");

		Assert.assertEquals(13, res);
	}
}
