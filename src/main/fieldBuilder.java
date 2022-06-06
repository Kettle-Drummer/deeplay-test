package main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class fieldBuilder{
	
	public static int[][] makeField(String seed, String race) {
		try (FileReader reader = new FileReader("src\\main\\resourses\\rules.txt")){
        Scanner scan = new Scanner(reader);
        
        String[] race_name = scan.nextLine().split(" ");
        
        String terrain_type = scan.nextLine();
        

        int race_index = Arrays.asList(race_name).indexOf(race);
        if(race_index != -1)
        for(int i = 0; i < race_index; i++)
            scan.nextLine();
        else 
        	{
        	scan.close();
        	throw new IllegalArgumentException("Race is not valid");
        	}
        
        int[] travel_cost = new int[terrain_type.length()];
            
        for(int i = 0; i < terrain_type.length(); i++)
            travel_cost[i]= scan.nextInt();


        int terrain_index = 0;
        int[][] field = new int[4][4];
            for(int i=0; i<4; i++)
                for(int j=0; j<4; j++)
                {
                	terrain_index = terrain_type.indexOf(seed.charAt(4*i+j));
            		if(terrain_index != -1)
                    field[i][j] = travel_cost[terrain_index];
            		else
            		{
            			scan.close();
                    	throw new IllegalArgumentException("Terrain type is not valid");
            		}                	
                }

            scan.close();


            return field;
} catch (IOException thrown){
    throw new RuntimeException("File does not exist");
}
}
}
