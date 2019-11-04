package LeetCodeArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewTest {

  public static List<Integer> subsetA(List<Integer> arr) {
    Map<Integer, Integer> map = new HashMap<>();
    Collections.sort(arr);
    List<Integer> result = new ArrayList<>();
    int currSum = 0;
    int totalSum = 0;
    for(int i = 0 ; i < arr.size() ; i++) {
      totalSum += arr.get(i);
      map.put(arr.get(i), map.getOrDefault(arr.get(i),0) +1);
    }
    int currIndex = arr.size() - 1;
    while(currSum < totalSum && currIndex >= 0) {
      int decrement = 0;
      while(currSum < totalSum && map.get(arr.get(currIndex)) != 0) {
        currSum += arr.get(currIndex);
        decrement = map.get(arr.get(currIndex));
        totalSum -= arr.get(currIndex) * map.get(arr.get(currIndex));
        map.put(arr.get(currIndex), map.get(arr.get(currIndex)) - 1);
        result.add(arr.get(currIndex));
      }
      currIndex-= decrement;
    }
    Collections.sort(result);
    return result;
  }

  public int lotteryCoupons(int n) {
    Map<Integer, Integer> map = new HashMap<>();

    int maxSumSoFar = 0;
    int count = 0;
    for (int i = 1; i <= n; i++) {
      String temp = Integer.toString(i);
      int sum = 0;
      for (int j = 0; j < temp.length(); j++) {
        int currCharInt = Integer.parseInt(Character.toString(temp.charAt(j)));
        sum += currCharInt;
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
      if (map.get(sum) > maxSumSoFar) {
        maxSumSoFar = map.get(sum);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == maxSumSoFar) {
        count++;
      }
    }

    return count;

  }

  public static int minimumSteps(List<String> loggedMoves) {
    int result = 0;
    for(String currString : loggedMoves) {
      if(!currString.equals("./")) {
        if(currString.equals("../")) {
          result--;
        } else {
          result++;
        }
      }
    }

    return result;

  }

  public static long countMoves(List<Integer> numbers) {
    int sum = 0;
    int minElement = numbers.get(0);
    for(int nums : numbers) {
      sum += nums;
    }

    for(int currNum : numbers) {
      if(currNum < minElement) {
        minElement = currNum;
      }
    }
    return sum - (minElement * numbers.size());
  }

  public static long findRange(int num) {
    int maxInt = 0;
    int minInt = 0;
    String numString = Integer.toString(num);
    StringBuilder finalStringMax = new StringBuilder(numString);
    StringBuilder finalStringMin = new StringBuilder(numString);
    if (Integer.parseInt(Character.toString(numString.charAt(0))) == 9) {
      int currIndex = 0;
      while (Integer.parseInt(Character.toString(numString.charAt(currIndex))) == 9) {
        currIndex++;
      }
      Character numToChange = numString.charAt(currIndex);
      while (currIndex < numString.length()) {
        if (numString.charAt(currIndex) == numToChange) {
          finalStringMax.setCharAt(currIndex, '9');
        }
        currIndex++;
      }
      maxInt = Integer.parseInt(finalStringMax.toString());
      for (int i = 0; i < numString.length(); i++) {
        if (numString.charAt(i) == '9') {
          finalStringMin.setCharAt(i, '1');
        }
      }
      minInt = Integer.parseInt(finalStringMin.toString());
      return maxInt - minInt;
    }

    else if (Integer.parseInt(Character.toString(numString.charAt(0))) == 1) {
      int currIndex = 0;
      while (Integer.parseInt(Character.toString(numString.charAt(currIndex))) == 1
          || Integer.parseInt(Character.toString(numString.charAt(currIndex))) == 0) {
        currIndex++;
      }
      Character numToChange = numString.charAt(currIndex);
      while (currIndex < numString.length()) {
        if (numString.charAt(currIndex) == numToChange) {
          finalStringMin.setCharAt(currIndex, '0');
        }
        currIndex++;
      }
      minInt = Integer.parseInt(finalStringMin.toString());

      for (int i = 0; i < numString.length(); i++) {
        if (numString.charAt(i) == '1') {
          finalStringMax.setCharAt(i, '9');
        }
      }
      maxInt = Integer.parseInt(finalStringMax.toString());
      return maxInt - minInt;
    }
    else {
      Character currCharacter = numString.charAt(0);
      for (int i = 0; i < numString.length(); i++) {
        if (numString.charAt(i) == currCharacter) {
          finalStringMax.setCharAt(i, '9');
          finalStringMin.setCharAt(i, '1');
        }
      }
      maxInt = Integer.parseInt(finalStringMax.toString());
      minInt = Integer.parseInt(finalStringMin.toString());
      return maxInt - minInt;
    }
  }

  public void dfs(char[][] grid, int row, int column) {
    if(row >= grid.length || column >= grid[0].length || grid[row][column] == 0
    || row < 0 || column < 0) {
      return;
    }

    grid[row][column] = 0;
    dfs(grid, row+1 , column);
    dfs(grid, row , column+1);
    dfs(grid, row+1 , column+1);
  }

  public int numIslands(char[][] grid) {
    int numRows = grid.length;
    int numColumns = grid[0].length;
    int numIslands = 0;
    for(int i = 0; i < numRows; i++) {
      for(int j = 0 ; i < numColumns ; j++) {
        if(grid[i][j] == '1') {
          numIslands++;
          dfs(grid, i, j);
        }
      }
    }
    return numIslands;
  }

  static int WHITE = 1;
  static int GRAY = 2;
  static int BLACK = 3;

  boolean isPossible;
  Map<Integer, Integer> color;
  Map<Integer, List<Integer>> adjList;
  List<Integer> topologicalOrder;

  private void init(int numCourses) {
    this.isPossible = true;
    this.color = new HashMap<Integer, Integer>();
    this.adjList = new HashMap<Integer, List<Integer>>();
    this.topologicalOrder = new ArrayList<Integer>();

    // By default all vertces are WHITE
    for (int i = 0; i < numCourses; i++) {
      this.color.put(i, WHITE);
    }
  }

  private void dfs(int node) {

    // Don't recurse further if we found a cycle already
    if (!this.isPossible) {
      return;
    }

    // Start the recursion
    this.color.put(node, GRAY);

    // Traverse on neighboring vertices
    for (Integer neighbor : this.adjList.getOrDefault(node, new ArrayList<Integer>())) {
      if (this.color.get(neighbor) == WHITE) {
        this.dfs(neighbor);
      } else if (this.color.get(neighbor) == GRAY) {
        // An edge to a GRAY vertex represents a cycle
        this.isPossible = false;
      }
    }

    // Recursion ends. We mark it as black
    this.color.put(node, BLACK);
    this.topologicalOrder.add(node);
  }

  public int[] findOrder(int numCourses, int[][] prerequisites) {

    this.init(numCourses);

    // Create the adjacency list representation of the graph
    for (int i = 0; i < prerequisites.length; i++) {
      int dest = prerequisites[i][0];
      int src = prerequisites[i][1];
      List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
      lst.add(dest);
      adjList.put(src, lst);
    }

    // If the node is unprocessed, then call dfs on it.
    for (int i = 0; i < numCourses; i++) {
      if (this.color.get(i) == WHITE) {
        this.dfs(i);
      }
    }

    int[] order;
    if (this.isPossible) {
      order = new int[numCourses];
      for (int i = 0; i < numCourses; i++) {
        order[i] = this.topologicalOrder.get(numCourses - i - 1);
      }
    } else {
      order = new int[0];
    }

    return order;
  }

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int rowOrColumn = 0;
    int currJ = 0;
    int counter = 0;
    for(int i = 0 ; i < 5 ; i++) {
      if (rowOrColumn % 2 == 0) {
        if (counter % 2 == 0) {
          currJ++;
        }
        if (rowOrColumn % 4 == 0) {
          for (int j = currJ; j < matrix[i].length; j++) {
            result.add(matrix[i][j]);
          }
        } else {
          for (int j = matrix[i].length - 1; j >= currJ; j--) {
            result.add(matrix[i][j]);
          }
        }
        counter++;
        rowOrColumn++;
      } else {
        rowOrColumn++;
      }
    }
    return result;
  }

}
