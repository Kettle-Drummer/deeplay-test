package main;

public class Node {


    public int col;
    public int row;
    public float travel_cost;

    
    public double gCost;
    public double hCost;

    public Node(int col, int row, int travel_cost) 
    	{
        	this.travel_cost = travel_cost;
        	this.col = col;
        	this.row = row;
    	}

    public double getFCost() 
    	{
        return gCost + hCost;
    	}
    
    public static double getDistance(Node nodeA, Node nodeB) 
    	{
        	int dx = Math.abs(nodeA.col - nodeB.col);
        	int dy = Math.abs(nodeA.row - nodeB.row);

        	return Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
    	}
}
