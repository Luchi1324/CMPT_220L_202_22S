import java.util.*;

public class Project3 {
    public static void main(String[] args) {
        boolean userFinished = false;
        int countN = 0;
        Scanner input = new Scanner(System.in);
        do {
            // Gets input until user enters
            System.out.print("Enter width and length of the house: ");
            int w = input.nextInt();
            int l = input.nextInt();

            if (w != 0 && l != 0) {
                // Increases user input count
                countN++;
                // Creates 2D char array with inputed width and length, then inserts diagram into array
                char[][] diagram = new char[l][w];
                System.out.println("Enter house diagram below, line-by-line: ");

                // Converts multiline input to char array
                for (int i = 0; i < l; i++) {
                    char[] temp = input.next().toCharArray();
                    for (int j = 0; j < w; j++) {
                        diagram[i][j] = temp[j];
                    }
                }

                // Finds point for entrance, so we know where to start searching the 2D array for mirrors
                int[] point = findEntrance(diagram);
                char chAtPoint = '.';
                // Creates a 'ray' to find mirrors in the diagram
                rowSearch horiRay = new rowSearch();
                colSearch vertRay = new colSearch();
                // Changes direction of the 'ray' depending on mirror type and the previous direction of the 'ray'
                // Creates initial ray and direction depending on which wall the entrance is on, also creates count to track orientation of ray
                int count = 0;
                if (point[1] == 0) {
                    chAtPoint = horiRay.right(diagram, point); 
                } else if (point[1] == w-1) {
                    chAtPoint = horiRay.left(diagram, point);
                } else if (point[0] == 0) {
                    count++;
                    chAtPoint = vertRay.up(diagram, point);
                } else if (point[0] == l-1) {
                    count++;
                    chAtPoint = vertRay.down(diagram, point);
                }

                // Main ray reflection algorithm
                // JA: Thos results in an infinite loop.
                while (true) {
                    charFound:
                    if (count % 2 == 0) {
                        // Even counts are when the ray is travelling horizontally
                        if (chAtPoint == '/') {
                            chAtPoint = vertRay.up(diagram, point);
                            count++;
                            break charFound;
                        } else if (chAtPoint == '\\') {
                            chAtPoint = vertRay.down(diagram, point);
                            count++;
                            break charFound;
                        } else if (chAtPoint == '&') {
                            print2DArray(diagram, countN);
                            break;
                        }
                    } else {
                        // Odd counts are when the ray is travelling vertically
                        if (chAtPoint == '/') {
                            chAtPoint = horiRay.left(diagram, point);
                            count++;
                            break charFound;
                        } else if (chAtPoint == '\\') {
                            chAtPoint = horiRay.right(diagram, point);
                            count++;
                            break charFound;
                        } else if (chAtPoint == '&') {
                            print2DArray(diagram, countN);
                            break;
                        }
                    }
                }
        } else {
            input.close();
            userFinished = !userFinished;
        }
        } while (!userFinished);
    }

    // Method to print contents of 2D char array
    public static void print2DArray(char[][] array, int n) {
        System.out.println("\nHOUSE "+ n);
        // Loops through each row, then prints each char in each column
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "");
            }
            System.out.println();
        }
    }

    public static int[] findEntrance(char[][] array) {
        int[] point = new int[2];
        // Marker for when entrance is found
        searching:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == 0 || i == array.length-1) || (j == 0 || j == array[i].length-1)) {
                    if (array[i][j] == '*') {
                        point[0] = i;
                        point[1] = j;
                        break searching;
                    }
                } else { 
                    continue; 
                }
            }
        }
        return point;
    }
}

// Class to facilitate vertical searching within a 2D array
class colSearch {
    colSearch() {}

    char up(char[][] array, int[] pos) {
        int start = pos[1];
        char ch = '.';
        for (int i = start; i > 0; i--) {
            if (array[i][start] == '/') {
                ch = '/';
            } else if (array[i][start] == '\\') {
                ch = '\\';
            } else if (array[i][start] == 'x') {
                array[i][start] = '&';
                ch = '&';
            }
        }
        return ch;
    }

    char down(char[][] array, int[] pos) {
        int start = pos[1];
        char ch = '.';
        for (int i = start; i < array.length; i++) {
            if (array[i][start] == '/') {
                ch = '/';
            } else if (array[i][start] == '\\') {
                ch = '\\';
            } else if (array[i][start] == 'x') {
                array[i][start] = '&';
                ch = '&';
            }
        }
        return ch;
    }
}

// Class to facilitate horizontal searching within a 2D array
class rowSearch {
    rowSearch() {}

    char left(char[][] array, int[] pos) {
        int start = pos[0];
        char ch = '.';
        for (int i = start; i > 0; i--) {
            if (array[start][i] == '/') {
                ch = '/';
            } else if (array[start][i] == '\\') {
                ch = '\\';
            } else if (array[start][i] == 'x') {
                array[start][i] = '&';
                ch = '&';
            }
        }
        return ch;
    }

    char right(char[][] array, int[] pos) {
        int start = pos[0];
        char ch = '.';
        for (int i = start; i < array.length; i++) {
            if (array[start][i] == '/') {
                ch = '/';
            } else if (array[start][i] == '\\') {
                ch = '\\';
            } else if (array[start][i] == 'x') {
                array[start][i] = '&';
                ch = '&';
            }
        }
        return ch;
    }
}