import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TwoDimRaggedArrayUtility  {
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static double getTotal(double [][] data) {
		double total=0;
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				total+=data[i][j];
			}
		}
		return total;	
	}
	/**
	 * 
	 * @param data
	 * @return
	 */
		public static double getAverage(double [][] data) {
		double total=0;
		double totallength=0;
		for(int i=0;i<data.length;i++) {
			totallength+=data[i].length;
			for(int j=0;j<data[i].length;j++) {
				total+=data[i][j];
				
			}
		}
		return total/(totallength);
	}
		/**
		 * 
		 * @param data
		 * @param col
		 * @return
		 */
	public static double getColumnTotal(double [][] data, int col) {
		double total=0;
			for(int i=0;i<data.length;i++) {
				if (col >= data[i].length) {
			        total+=0;
			      }
				else total+=data[i][col];
			}
		return total;
	}
	public static double getRowTotal(double [][] data, int row) {
		double total=0;
			for(int i=0;i<data[row].length;i++) {
				total+=data[row][i];
			}
		return total;
	}
/**
 * 
 * @param data
 * @param col
 * @return
 */
	public static double getHighestInColumn(double [][] data, int col) {
		double highest =data[0][col];
		for(int i=1;i<data.length;i++) {
			if (col >= data[i].length) {
		        continue;
		      }
			else if(data[i][col]>highest)
			highest=data[i][col];
		}
		return highest;
	}
	/**
	 * 
	 * @param data
	 * @param col
	 * @return
	 */
	public static double getHighestInColumnIndex(double [][] data, int col) {
		double highest = data[0][col];
		int index = 0;
		for(int i=1;i <data.length;i++) {
			if (col >= data[i].length) {
		        continue;
		      }
			else if(data[i][col]>highest) {
				highest=data[i][col];
				index=i;
			}
		}
		return index;
	}
	/**
	 * 
	 * @param data
	 * @param col
	 * @return
	 */
	public static double getLowestInColumn(double [][] data, int col) {
		double lowest =data[0][col];
		for(int i=1;i<data.length;i++) {
			if (col >= data[i].length) {
		        continue;
		      }
			else if(data[i][col]<lowest)
				{lowest=data[i][col];}
		}
		return lowest;
	}
	/**
	 * 
	 * @param data
	 * @param col
	 * @return
	 */
	public static double getLowestInColumnIndex(double [][] data, int col) {
		double lowest = data[0][col];
		int index = 0;
		for(int i=1;i <data.length;i++) {
			if (col >= data[i].length) {
		        continue;
		      }
			else if(data[i][col]<lowest) {
				lowest=data[i][col];
				index=i;
			}
		}
		return index;
	}
	/**
	 * 
	 * @param data
	 * @param row
	 * @return
	 */
	public static double getHighestInRow(double [][] data, int row) {
		double highest =data[row][0];
		for(int i=1;i<data[row].length;i++) {
			if(data[row][i]>highest)
			highest=data[row][i];
		}
		return highest;
	}
	/**
	 * 
	 * @param data
	 * @param row
	 * @return
	 */
	public static double getHighestInRowIndex(double [][] data, int row) {
		double highest = data[row][0];
		int index = 0;
		for(int i=1;i <data[row].length;i++) {
			if(data[row][i]>highest) {
				highest=data[row][i];
				index=i;
			}
		}
		return index;
	}
	/**
	 * 
	 * @param data
	 * @param row
	 * @return
	 */
	public static double getLowestInRow(double [][] data, int row) {
		double lowest =data[row][0];
		for(int i=1;i<data[row].length;i++) {
			if(data[row][i]<lowest)
			lowest=data[row][i];
		}
		return lowest;
	}
	/**
	 * 
	 * @param data
	 * @param row
	 * @return
	 */
	public static double getLowestInRowIndex(double [][] data, int row) {
		double lowest = data[row][0];
		int index = 0;
		for(int i=1;i <data[row].length;i++) {
			if(data[row][i]>lowest) {
				lowest=data[row][i];
				index=i;
			}
		}
		return index;
	}
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static double getHighestInArray(double [][] data){
		double highest=data[0][0];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				if (data[i][j]>highest)
					highest=data[i][j];
				}
		}
		return highest;
	}
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static double getLowestInArray(double [][] data){
		double lowest=data[0][0];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				if (data[i][j]<lowest)
					{lowest=data[i][j];}
				}
			}
		
			return lowest;
	}
	public static double[][] readFile(java.io.File file)
	        throws java.io.FileNotFoundException{
		Scanner input = new Scanner(file);
		int indexRow=0;
		String [][] temp = new String[10][];
		
		while(input.hasNextLine()) {
			String[] row = input.nextLine().split(" ");
			temp[indexRow] = new String[row.length];
			for (int i = 0; i<row.length;i++) {
				temp[indexRow][i]=row[i];
			}
			indexRow++;
		}
		double[][]data = new double [indexRow][];
		for (int i=0; i<indexRow;i++) {
			data[i]=new double[temp[i].length];
			for (int j=0;j<temp[i].length;j++) {
				System.out.print(temp[i][j]+ " ");
				data[i][j]=Double.parseDouble(temp[i][j]);
			}
			System.out.println();
		}
		
	input.close();
	return data;
	}
	public static void writeToFile(double[][] data,
	        java.io.File outputFile)
	 throws java.io.FileNotFoundException{
		PrintWriter output = new PrintWriter(outputFile);
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				sb.append(data[i][j]+ " ");
			}
			sb.append("\n");
			}
		output.print(sb.toString());
		output.close();
		}
	}
			





	