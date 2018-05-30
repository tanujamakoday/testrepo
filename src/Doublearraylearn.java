
public class Doublearraylearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					String x [][] = new String [2][2];
					
					x[0][0] = "Albama";
					x[0][1] = "Alaska";
					//x[0][2] = "Massachusstes";
					
				
					x[1][0] = "red ";
					x[1][1] = "blue";
					//x[1][2] = "green";
					
					//x[2][0] = "square ";
					//x[2][1] = "circle";
					//x[2][2] = "rectangle";
					
					int row = x.length;
					int col = x[0].length;
					
					for (int i = 0; i< row;i++)
					{
					for (int j = 0; j< col;j++)
					{
						 System.out.print(x[i][j]+ " ");
					}
					System.out.println(" ");
					
					}
			}

	}


