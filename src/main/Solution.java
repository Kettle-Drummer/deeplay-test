package main;

public class Solution {
      
    public static int getResult(String seed, String race) {
    
    if(seed.length() != 16)
    	throw new IllegalArgumentException("Seed is not valid");
    int[][] field = fieldBuilder.makeField(seed, race);
    
    for(int i=0; i<4;i++)
        {
        for(int j=0; j<4;j++)
            {
                if(i == 0 && j == 0) field[i][j] = 0;
                else if(i == 0) field[i][j] += field[i][j-1];
                else if(j == 0) field[i][j] += field[i-1][j];
                else field[i][j] += Math.min(field[i-1][j], field[i][j-1]);
            }

        }                  

    return field[3][3];
        
    }
}
