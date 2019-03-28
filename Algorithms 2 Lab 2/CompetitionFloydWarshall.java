import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * A Contest to Meet (ACM) is a reality TV contest that sets three contestants at three random
 * city intersections. In order to win, the three contestants need all to meet at any intersection
 * of the city as fast as possible.
 * It should be clear that the contestants may arrive at the intersections at different times, in
 * which case, the first to arrive can wait until the others arrive.
 * From an estimated walking speed for each one of the three contestants, ACM wants to determine the
 * minimum time that a live TV broadcast should last to cover their journey regardless of the contestants’
 * initial positions and the intersection they finally meet. You are hired to help ACM answer this question.
 * You may assume the following:
 *     Each contestant walks at a given estimated speed.
 *     The city is a collection of intersections in which some pairs are connected by one-way
 * streets that the contestants can use to traverse the city.
 *
 * This class implements the competition using Floyd-Warshall algorithm
 */


public class CompetitionFloydWarshall {

    /**
     * @param filename: A filename containing the details of the city road network
     * @param sA, sB, sC: speeds for 3 contestants
     */
	//Total number of intersections in the city
	private int N;
	//Total number of streets in the city
	private int S;
	//city road network
	private double[] roadNetwork;
    CompetitionFloydWarshall (String filename, int sA, int sB, int sC){
    	/*
    	 * Code for Reading in from file and constructing the tree
    	 */
    	int walkingSpeedA = sA;
    	int walkingSpeedB = sB;
    	int walkingSpeedC = sC;
    	try {
    		String line = "init";
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scanner = new Scanner(line);
			int lineCount = 1;
			while((line = bufferedReader.readLine()) != null) {
				if(lineCount == 1) {
					//reading first line
					//number of intersections (N)
					N = Integer.valueOf(line);
					System.out.println("N = " + N);
				}
				else if(lineCount == 2) {
					//reading second line
					//total number of streets (S)
					S = Integer.valueOf(line);
					System.out.println("S = " + S);
				}
				else if(lineCount > 2) {
					//need to parse line into separate things
					scanner = new Scanner(line);
					int from = scanner.nextInt();
					int to = scanner.nextInt();
					double weight = scanner.nextDouble();
				}
				lineCount++;
			}
			bufferedReader.close();
			fileReader.close();
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	/*
    	 * End of file reading and tree building code
    	 */
    }


    /**
     * @return int: minimum minutes that will pass before the three contestants can meet
     */
    public int timeRequiredforCompetition(){

        //TO DO
        return -1;
    }

}