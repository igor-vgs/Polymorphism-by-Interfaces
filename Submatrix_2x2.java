
public class Submatrix_2x2 implements Comparable<Submatrix_2x2> {
    private int[][] matrix;
    private int n, m;

    public int getElem(int i, int j){ return matrix[i][j]; }
    public void setElem(int i, int j, int elem){ matrix[i][j] = elem; }

    public Submatrix_2x2(int n, int m) {
        this.matrix = new int[n][m];
        this.n = n;
        this.m = m;

    }

    private int countNullDeterminants2X2() {
        int count = 0;

        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < m - 1; k++) {
                if (matrix[j][k] * matrix[j + 1][k + 1] - matrix[j + 1][k] * matrix[j][k + 1] == 0) count++;
            }
        }


        return count;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                builder.append(matrix[i][j] + " ");
            }
            builder.append("\n");
        }
        builder.append("countNullDeterminants2X2: " + countNullDeterminants2X2() + "\n");

        return builder.toString();
    }

    public int compareTo(Submatrix_2x2 obj) {
        return Integer.compare(countNullDeterminants2X2(), obj.countNullDeterminants2X2());
    }
}
