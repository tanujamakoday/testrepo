
public class doublearraywithouthardcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
        int[][] matrix = new int [5][5];
 
       for(int row = 0; row < matrix.length; row ++){
           for (int column = 0; column < matrix[row].length; column++){
               System.out.print("I'm at position (" + row + ", " + column + ")");
               matrix[row][column]= (int)(column + 1) * 2;
               System.out.println(" Value is " + matrix[row][column]);
               }
           System.out.println();
           }
           System.out.println("   starting second loop");
           for(int row = 0; row < matrix.length; row ++){
              for (int column = 0; column < matrix[row].length; column++){
                 System.out.print("I'm at position (" + row + ", " + column + ")");
                 matrix[row][column]= (int)(column + 1) * 3;
                 System.out.println("Value is " + matrix[row][column]);
                 }
              System.out.println();
              }
        }
  
	}


