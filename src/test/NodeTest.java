package test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Node;

class NodeTest {

	@Test
	void testDistace5(){
		Node Node1 = new Node(1, 2, 0);
		Node Node2 = new Node(5, 5, 0);
		double res = Node.getDistance(Node1, Node2);

		Assert.assertEquals(5, res, 0.01);;
	}
	
	@Test
	void testDistace3point6(){
		Node Node1 = new Node(1, 0, 0);
		Node Node2 = new Node(3, 3, 0);
		double res = Node.getDistance(Node1, Node2);

		Assert.assertEquals(3.6f, res, 0.01);;
	}
	
	@Test
	void testDistace2point8(){
		Node Node1 = new Node(10, 10, 0);
		Node Node2 = new Node(8, 8, 0);
		double res = Node.getDistance(Node1, Node2);

		Assert.assertEquals(2.82, res, 0.01);;
	}

}
