## Deeplay test task

### Description
Java project made for deeplay 2022 summer internship. Exact wording of the task can be found at [the site](https://internship.deeplay.io/java).

### Project includes:
* Class Solution with sole public static metod getResult whitch should be able to return the travel cost of the shortest path from one point of the game field to the other using A* algorithm.
* Class fieldBuilder reads all information nessesary to build game field based on seed and race of the character and returns travel cost for each field tile.
* Class Node describes coordinates and travel cost for each field tile and contains some of the logic needed for proper execution of A* algorithm.
* Class Grid contains the game field itself and allows to calculate neighbouring nodes for each field tile.
* File rules.txt includes all of available races, terrain types and travel cost for each race for different terrain types.
* Couple of unit-tests made using JUnit5 framework.
