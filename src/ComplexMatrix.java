import java.util.*;


/**
 *@author Christos Brentas, A.M: 4442, username: cse84442, email: cbrentas@gmail.com
 */

public class ComplexMatrix {

    //Declaring a 2D array of type ComplexNumber.
    private ComplexNumber[][] trapezi;
    private Random rand = new Random();

    /**
     * Default Constructor for ComplexMatrix.
     */
    public ComplexMatrix() {

    }

    public ComplexMatrix(ComplexMatrix original) {

        trapezi = new ComplexNumber[original.trapezi.length][original.trapezi[0].length];
        for (int i = 0; i<original.trapezi.length; i++){
            for (int j = 0; j < original.trapezi[0].length; j ++){
                trapezi[i][j] = new ComplexNumber(original.trapezi[i][j].getReal(), original.trapezi[i][j].getImg());
            }
        }

    }

    /**
     * Constructor for ComplexMatrix.
     *
     * Creates a new object of type ComplexMatrix filling the elements of 'trapezi' with random generated Complex Numbers.
     *
     * @param rows the rows our matrix will have.
     * @param cols the columns our matrix will have.
     */
    public ComplexMatrix(int rows, int cols){
        trapezi = new ComplexNumber[rows][cols];
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                trapezi[i][j] = new ComplexNumber(computeRandom(), computeRandom());
            }
        }
    }

    /**
     * Method toString brings our ComplexMatrix matrix to life making it readable.
     *
     * @return A String with all the ComplexNumber objects in a matrix form.
     */
    public String toString(){
        String kordoni = "[";
        for(int i =0; i<trapezi.length; i++){
            for (int j = 0; j<trapezi[0].length; j++){
                kordoni += trapezi[i][j].toString();
                if(j < trapezi[0].length -1){
                    kordoni += ", ";
                }
                else if(j == trapezi[0].length -1 && i != trapezi.length -1 ){
                    kordoni += ";\n";
                }
            }
        }
        kordoni += "]\n";
        return kordoni;
    }

    /**
     * Method CompAdd is used for adding objects of type ComplexMatrix.
     *
     * With the for loop we go through each element of the matrices and we add one with the other. First we add the real half and then the imaginary half.
     *
     * @param matrix the object of type ComplexMatrix that will be added to the object calling the method.
     * @return a new matrix that occurs after the addition of the two matrices we selected if their rows and columns are the same, otherwise null.
     */
    public ComplexMatrix CompAdd(ComplexMatrix matrix) {
        if (matrix.trapezi.length == this.trapezi.length && matrix.trapezi[0].length == this.trapezi[0].length) {
            ComplexMatrix tempMatrix = new ComplexMatrix(matrix.trapezi.length, matrix.trapezi[0].length);
            for (int i = 0; i < trapezi.length; i++) {
                for (int j = 0; j < trapezi[0].length; j++) {
                    tempMatrix.trapezi[i][j].setReal(this.trapezi[i][j].getReal() + matrix.trapezi[i][j].getReal());
                    tempMatrix.trapezi[i][j].setImg(this.trapezi[i][j].getImg() + matrix.trapezi[i][j].getImg());
                }
            }
            return tempMatrix;

        }
        return null;
    }

    /**
     * Method CompSubtract is used for subtracting and object of type ComplexMatrix from another.
     *
     * With the for loop we go through each element of the matrices and we subtract one of the other. First we subtract the real half and then the imaginary half.
     *
     * @param matrix the object of type ComplexMatrix that will be subtracted from the object calling the method.
     * @return a new matrix that occurs after the subtraction of the two matrices we selected if their rows and columns are the same, otherwise null.
     */
    public ComplexMatrix CompSubtract(ComplexMatrix matrix){
        if (matrix.trapezi.length == this.trapezi.length && matrix.trapezi[0].length == this.trapezi[0].length){
            ComplexMatrix tempMatrix = new ComplexMatrix(matrix.trapezi.length, matrix.trapezi[0].length);
            for (int i = 0; i < trapezi.length; i++){
                for(int j = 0; j < trapezi[0].length; j++){
                    tempMatrix.trapezi[i][j].setReal(this.trapezi[i][j].getReal() - matrix.trapezi[i][j].getReal());
                    tempMatrix.trapezi[i][j].setImg(this.trapezi[i][j].getImg() - matrix.trapezi[i][j].getImg());
                }
            }
            return tempMatrix;

        }
        return null;


    }


    /**
     * Generates a random object of type double between values 10 and -10.
     * @return the number.
     */
    private double computeRandom() {
        int randomNum = (int) ((rand.nextDouble() - 0.5) * rand.nextInt(20) * 100);
        return randomNum / 100.0;
    }
}