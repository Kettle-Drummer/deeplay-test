package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.fieldBuilder;

class fieldBuilderTest {

	@Test
	void testStranger(){
		
		try {
			fieldBuilder.makeField("STWSWTPPTPTTPWPP", "Stranger");
		      Assert.fail("Expected IllegalArgumentException");
		    } catch (IllegalArgumentException thrown) {
		      Assert.assertEquals("Race is not valid", thrown.getMessage());
		    }
	}
	
	@Test
	void unknownTerrain(){
		
		try {
			fieldBuilder.makeField("ZXCZXCZXCZXCZXCS", "Human");
		      Assert.fail("Expected IllegalArgumentException");
		    } catch (IllegalArgumentException thrown) {
		      Assert.assertEquals("Terrain type is not valid", thrown.getMessage());
		    }
	}
	
	@Test
	void testField(){
		int[][] res = fieldBuilder.makeField("STWSWTPPTPTTPWPP", "Human");
		int[][] field = {{5, 3, 2, 5},{2, 3, 1 ,1},{3, 1, 3, 3},{1, 2, 1, 1}};
		Assert.assertArrayEquals(field, res);
	}


}
