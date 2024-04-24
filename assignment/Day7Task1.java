public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    // Constructor to initialize the dimensions of the matrix
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    // Method to fill the matrix with values
    public void fillMatrix(int[][] values) {
        if (values.length != rows || values[0].length != columns) {
            System.out.println("Invalid input dimensions for matrix.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = values[i][j];
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the Matrix class
    public static void main(String[] args) {
        // Create a 3x3 matrix
        Matrix matrix = new Matrix(3, 3);

        // Fill the matrix with values
        int[][] values = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        matrix.fillMatrix(values);

        // Print the matrix
        System.out.println("Matrix:");
        matrix.printMatrix();
    }
}
