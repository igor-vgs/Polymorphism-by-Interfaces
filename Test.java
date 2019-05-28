import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args){
        Random random = new Random();
        Submatrix_2x2[] arrayOfMatrix= new Submatrix_2x2[5];
        for(int i = 0; i < 5; i++){
            arrayOfMatrix[i] = new Submatrix_2x2( 3, 5);

            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 5; k++){
                    arrayOfMatrix[i].setElem(j, k, random.nextInt(5));
                }
            }
        }
        Arrays.sort(arrayOfMatrix);

        for(Submatrix_2x2 matrix : arrayOfMatrix) System.out.println(matrix);
    }
}
