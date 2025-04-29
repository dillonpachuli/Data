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

    public Data(int[][] arr){
        grid = arr;
    }

    public int countIncreasingCols(){
        int num = 0;
        for (int i = 0; i < grid[0].length; i++){
            for (int j = 0; j < grid.length; j++){
                if (j == grid.length-1) num++;
                else if (j+1 < grid.length && grid[j+1][i] >= grid[j][i]) j = j;
                else break;
            }
        }
        return num;
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