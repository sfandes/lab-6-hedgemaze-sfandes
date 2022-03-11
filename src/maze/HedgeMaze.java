package maze;

import java.io.IOException;
import java.util.Collection;

/**
 * A coordinate-based graph of nodes to represent a maze laid on a 2-D
 * grid of cells
 * @author YOUR NAME HERE
 *
 * February 2022
 */
public class HedgeMaze extends GridGraph {

    /** Input file symbol for a barrier between adjacent horizontal cells */
    public final static String VWALL = "|";

    /** Input file symbol for a barrier between adjacent vertical cells */
    public final static String HWALL = "-";

    /** Input file symbol for no barrier between adjacent horizontal cells */
    public final static String NO_WALL = ".";

    /** Input file symbol a cell */
    public final static String CELL = "O";

    // TODO Add code for your data structure(s).

    /**
     * Create a graph by reading a file. Details can be found in the lab
     * writeup.
     * @param fileName location of maze specification
     * @throws IOException if the file can't be read for any reason
     * @rit.pre The format of the file is without errors.
     * @rit.post Graph and Nodes are fully formed with all connections as
     *           specified in the file.
     */
    public HedgeMaze( String fileName ) throws IOException {
        // TODO Additional code here for in-lab.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int numRows() {
        return -1; // TODO Correct code here for in-lab.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int numCols() {
        return -1; // TODO Correct code here for in-lab.
    }

    /**
     * {@inheritDoc}
     * @rit.pre this.contains( r1, c1 ) and this.contains( r2, c2 )
     */
    @Override
    public boolean connected( int r1, int c1, int r2, int c2 ) {
        return false; // TODO Correct code here for in-lab.
    }


    /**
     * Print out detail about this graph.
     * This is done with a heading of<br>
     * &quot;Graph Details:&quot;
     * followed by a blank line, and then
     * printing the details of each of the graph's Nodes, in the Nodes'
     * natural order.
     */
    public void printAdjacencyList() {
        System.out.println( "Graph Details:" + System.lineSeparator() );
        // TODO Additional code here for main lab assignment.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains( int r, int c ) {
        return false; // TODO additional code here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection< Coordinates > findPath(
            Coordinates start, Coordinates end ) {
        return null; // TODO additional code here
    }

    // TODO Add additional methods if needed.
}
