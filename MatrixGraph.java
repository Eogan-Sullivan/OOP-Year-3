package lab5;

import java.util.LinkedList;

/*****************************************************
*    Title: MatrixGraph.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    @Override
    public boolean isEdge(int source, int dest) {
        //complete this method
        return matrix[source][dest] == 1;
    
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge
        
        int row = edge.getSource();
        int column = edge.getDestination();
        if(isDirected())
        {
             matrix[row][column] = 1;
        }
        
        else{
        
           matrix[row][column] = 1;
           matrix[column][row] = 1;
     
        }        
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
         int row = edge.getSource();
        int column = edge.getDestination();
        if(isDirected())
        {
             matrix[row][column] = 0;
        }
        
        else{
        
           matrix[row][column] = 0;
           matrix[column][row] = 0;
        }
    }
    
    public void breadthFirstTraversal(int start){
	//Output the vertices in breadth first order
        
        
        boolean[] visited = new boolean[matrix.length];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[start] = true;
        queue.add(start);
        while(queue.size() != 0)
        {
          start = queue.poll();
          visited[start] = true;
          
        }
        
        
       
       
        }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
        
    }    
}
