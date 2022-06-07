package main;

import java.util.ArrayList;
import java.util.List;

public class Grid {

	public Node[][] nodes;
    int gridWidth, gridHeight;

    public Grid(int size, int[][] tile_costs) 
    	{    	
        	gridWidth = size;
        	gridHeight = size;
        	nodes = new Node[size][size];

        	for (int i = 0; i < size; i++)
        		for (int j = 0; j < size; j++)
        			nodes[i][j] = new Node(i, j, tile_costs[i][j]);
    	}


    public List<Node> getNeighbours(Node node) 
    	{
        	List<Node> neighbours = new ArrayList<Node>();

        	if (node.row + 1 >= 0 && node.row + 1  < gridHeight) neighbours.add(nodes[node.col][node.row + 1]);
        	if (node.row - 1 >= 0 && node.row - 1  < gridHeight) neighbours.add(nodes[node.col][node.row - 1]);
        	if (node.col + 1 >= 0 && node.col + 1  < gridHeight) neighbours.add(nodes[node.col + 1][node.row]);
        	if (node.col - 1 >= 0 && node.col - 1  < gridHeight) neighbours.add(nodes[node.col - 1][node.row]);
        
        	return neighbours;
    	}
    

}
