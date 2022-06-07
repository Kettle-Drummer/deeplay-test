package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
      
    public static int getResult(String seed, String race) {
    
    int size = (int)Math.sqrt(seed.length());

    int[][] field = fieldBuilder.makeField(seed, race, size);
    /*
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
        */
    

    
    Grid grid = new Grid(size, field);
    Node startNode = grid.nodes[0][0];
    Node targetNode = grid.nodes[3][3];

    List<Node> openSet = new ArrayList<Node>();
    HashSet<Node> closedSet = new HashSet<Node>();
    openSet.add(startNode);

    while (openSet.size() > 0) 
    	{
        	Node currentNode = openSet.get(0);

        	for (int i = 1; i < openSet.size(); i++) 
        		{
        			Node frontier = openSet.get(i);

        			if (frontier.getFCost() < currentNode.getFCost() ||
        				frontier.getFCost() == currentNode.getFCost() &&
            			frontier.hCost < currentNode.hCost)
        				currentNode = frontier;
        		}

        	openSet.remove(currentNode);
        	closedSet.add(currentNode);

        	if (currentNode != targetNode)
        	{
        	List<Node> neighbours = grid.getNeighbours(currentNode);

        	for (Node neighbour : neighbours) 
        		{
        			if (!closedSet.contains(neighbour)) 
        				{
        					double updatedGCost = currentNode.gCost + neighbour.travel_cost;
        					if (updatedGCost < neighbour.gCost || !openSet.contains(neighbour)) 
        						{
        						neighbour.gCost = updatedGCost;
        						neighbour.hCost = Node.getDistance(neighbour, targetNode);

        						if (!openSet.contains(neighbour)) openSet.add(neighbour);
        						}
        				}


        		}
        	}
    }
    return (int)targetNode.gCost;

    }
    
}
