package com.gen;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/11/13
 * Time: 1:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class ShortestPathInMaze {
    public static void main(String[] args){

        boolean[][] maze = new boolean[5][5];
        makeRandomMaze(maze);
        printMaze(maze);

        List<Cell> path = findShortestPath(maze);
        if(path == null){
            System.out.println("No Path");
            return;
        }
        for(Cell cell : path){
            System.out.println(cell+",");
        }
    }

    private static List<Cell> findShortestPath(boolean[][] maze) {
        
        int[][] levelMatrix = new int[maze.length][maze[0].length];
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                levelMatrix[i][j] = maze[i][j] == true ? -1 : 0;
                
            }
        }

        LinkedList<Cell> q = new LinkedList();
        Cell start = new Cell(0,0);
        Cell end = new Cell(maze.length-1, maze[0].length-1);
        
        q.add(start);
        levelMatrix[start.row][start.col] = 1;
        
        while(!q.isEmpty()){
            Cell cell = q.poll();
            if(cell == end)
                break;
            
            int level = levelMatrix[cell.row][cell.col];
            Cell[] nextCells = new Cell[4];
            nextCells[0] = new Cell(cell.row+1,cell.col);
            nextCells[1] = new Cell(cell.row,cell.col+1);
            nextCells[2] = new Cell(cell.row-1,cell.col);
            nextCells[3] = new Cell(cell.row,cell.col-1);
            
            for(Cell nextCell : nextCells){
                
                if(nextCell.row<0 || nextCell.col<0)
                    continue;
                if(nextCell.row == maze.length || nextCell.col == maze[0].length)
                    continue;
            
                if(levelMatrix[nextCell.row][nextCell.col] == 0){
                    q.add(nextCell);
                    levelMatrix[nextCell.row][nextCell.col] = level + 1;
                }
            
            
            }
                    
        }
        
        if(levelMatrix[end.row][end.col] == 0)
            return null;
        
        LinkedList<Cell> path = new LinkedList();
        Cell cell = end;
        while(!cell.equals(start)){
            path.push(cell);
            int level = levelMatrix[cell.row][cell.col];
            Cell[] nextCells = new Cell[4];
            nextCells[0] = new Cell(cell.row+1,cell.col);
            nextCells[1] = new Cell(cell.row,cell.col+1);
            nextCells[2] = new Cell(cell.row-1,cell.col);
            nextCells[3] = new Cell(cell.row,cell.col-1);
            
            for(Cell nextCell : nextCells){
              if(nextCell.row < 0 || nextCell.col < 0)
                  continue;
              if(nextCell.row == maze.length || nextCell.col == maze[0].length)
                  continue;
              if(levelMatrix[nextCell.row][nextCell.col] == level-1){
                  cell = nextCell;
                  break;
              }
                  
                
            }

        }
        return path;
    }

    private static class Cell{
        public int row;
        public int col;
        
        public Cell(int row, int col){
            this.row = row;
            this.col = col;
        }
        
        @Override
        public boolean equals(Object o){
            if(this==o)
                return true;
            if(o==null || o.getClass()!=this.getClass())
                return false;
            Cell c = (Cell) o;
            if(row == c.row && col==c.col)
                return true;
            
            return false;
        }
        @Override
        public String toString(){
            return "(" + row + "," + col + ")"; 
        }
    }
    
    private static void printMaze(boolean[][] maze) {

        for (int i = 0; i < maze.length; ++i)
        {
            for (int j = 0; j < maze[i].length; ++j)
            {
                if (maze[i][j])
                    System.out.print("#|");
                else
                    System.out.print("_|");
            }
            System.out.println();
        }
    }

    private static void makeRandomMaze(boolean[][] maze) {
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                maze[i][j] = (int)(Math.random()*3) == 1 ;
            }
        }
        maze[0][0] = false;
        maze[maze.length-1][maze[0].length-1] = false;

    }
}
