/**
*@author Christos Brentas, A.M: 4442, username: cse84442, email: cbrentas@gmail.com
*/

public class ComplexNumber {
    private double real;
    private double img;

    /**
     * Constructor for ComplexNumber
     *
     * @param real is the real half of the Complex Number.
     * @param img is the imaginary half of the Complex Number.
     */
    public ComplexNumber(double real, double img){
        this.real = real;
        this.img = img;

    }

    /**
     * Accessors and Mutators for Complex Numbers.
     */
    public double getReal(){
        return real;
    }

    public double getImg(){
        return img;
    }

    public void setReal(double temp){
        real = temp;
    }

    public void setImg(double temp){
        img = temp;
    }

    /**
     * Method addComp is used for adding two Complex Numbers together.
     *
     * @param num the object of type ComplexNumber that will be added to the object calling the method and it's parts will be assigned to a new ComplexNumber.
     * @return a new object of type ComplexNumber that is the result of the addition.
     */
    public ComplexNumber addComp(ComplexNumber num){
        double pragmatikos = real + num.real;
        double fantastikos = img + num.img;
        ComplexNumber tempComp = new ComplexNumber(pragmatikos, fantastikos);
        return tempComp;
    }
    /**
     * Method subtractComp is used for subtracting one Complex Number from  another.
     *
     * @param num the object of type ComplexNumber that will be subtracted from the object calling the method and it's parts will be assigned to a new ComplexNumber.
     * @return a new object of type ComplexNumber that is the result of the subtraction.
     */
    public ComplexNumber subtractComp(ComplexNumber num){
        double pragmatikos = real - num.real;
        double fantastikos = img - num.img;
        ComplexNumber tempComp = new ComplexNumber(pragmatikos, fantastikos);
        return tempComp;
    }

    /**
     * Method multiplyComp is used for multiplying two Complex Numbers.
     *
     * @param num the object of type ComplexNumber that will be multiplied with the object calling the method and it's parts will be assigned to a new ComplexNumber.
     * @return a new object of type ComplexNumber that is the result of the multiplication.
     */
    public ComplexNumber multiplyComp(ComplexNumber num){
        double pragmatikos = (real*num.real) - (img*num.img);
        double fantastikos = (real*num.img) + (img*num.real);
        ComplexNumber tempComp = new ComplexNumber(pragmatikos, fantastikos);

        return tempComp;
    }

    /**
     * Method toString brings our ComplexNumber objects to life making them readable.
     *
     * @return the String version of a Complex Number
     */
    public String toString(){
        //If the imaginary part is negative the Symbol between two halfs becomes 'minus' to look prettier.
        if(img<0) {
            double temp = img*(-1);
            return (String.format("%.3f", real) + " - " + String.format("%.3f", temp) + "i");
        }
        else {
            return (String.format("%.3f", real) + " + " + String.format("%.3f", img) + "i");
        }
    }

    /**
     * Method equals compares two Complex Numbers to check if they are the same.
     *
     * @param num the object of type ComplexNumber that will be compared to the object calling the method.
     * @return true if they are the same, otherwise false
     */
    public boolean equals(ComplexNumber num){
       if(this.real == num.real && this.img == num.img){
           return true;
       }
       else {
           return false;
       }


    }









}























