import java.lang.Math;

public class Data{
    public static final int MAX = (int)(Math.random() * Integer.MAX_VALUE);

    private int[][] grid;

    public Data(int rows, int columns){
        grid = new int[rows][columns];
    }

    public void repopulate(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                while (grid[i][j] % 10 != 0 || grid[i][j] % 100 == 0) grid[i][j] = (int)(Math.random() * MAX + 1);
            }
        }
    }

    public int countIncreasingCols(){

    }

    public String toString(){
        String s = "";
        for (int[] row: grid){
            for (int col: row) s += col + " ";
            s += "\n";
        }
        return s;
    }
    
}