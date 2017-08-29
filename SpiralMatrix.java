
public class SpiralMatrix {
	
	public static void main(String args[]){
		
		int nrows=5;
		int ncols=4;
		int[][] matrix= {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16},
						{17,18,19,20}
						};
		
		printSpiralMatrix(nrows, ncols, matrix);
		
	}
	
	public static void printSpiralMatrix(int nrows, int ncols, int[][] matrix){
		
		int rowIndex=0, colIndex=0;
		
		while(rowIndex<nrows && colIndex<ncols){
			
			for(int i=colIndex; i<ncols;i++){
			
				System.out.print(matrix[rowIndex][i] + " ");
			}
			rowIndex++;
			
			for(int i=rowIndex;i<nrows;i++){
				System.out.print(matrix[i][ncols-1]+ " ");
			}
			ncols--;
			
			if(rowIndex<nrows){
				for(int i=ncols-1;i>= colIndex;i--){
					System.out.print(matrix[nrows-1][i]+ " ");
				}
			nrows--;
			}
			
			if(colIndex<ncols){
				for(int i= nrows-1;i>=rowIndex;i--){
					System.out.print(matrix[i][colIndex]+ " ");
				}
			colIndex++;
			}
		}		
	}
}
