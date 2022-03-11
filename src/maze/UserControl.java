package maze;

import java.io.IOException;

/**
 * This class stores the HedgeMaze and gets commands from the user
 * to find paths.
 */
public class UserControl {

    /** If console input causes an {@link IOException} */
    public static final int USER_INPUT_ERROR = 3;

    /** What the user types to end the program, instead of new coordinates */
    public static final String USER_DONE = "quit";

    /** The definition of whitespace for the String.split(regex) method */
    public static final String WHITESPACE = "\\s+";

    /** The actual maze, with BFS capability */
    private HedgeMaze hMaze;

    /**
     * Read in and store the hedge maze description.
     * Display it both as an
     * adjacency list and in character graphics form.
     * @param fileName the hedge maze description file
     * @throws IOException if there is a problem reading the file
     */
    public UserControl( String fileName ) throws IOException {
        hMaze = new HedgeMaze( fileName );
        hMaze.printAdjacencyList();
        System.out.println();
        hMaze.printLayout();
    }

    /**
     * This method repeatedly prompts for start and finish locations
     * and prints the resulting paths using a breadth-first search.
     */
    public void doUserInput() {
        // TODO Put your code here for the main lab assignment.
    }

    // TODO Add more methods as needed.
}
