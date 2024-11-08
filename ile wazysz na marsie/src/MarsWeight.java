//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MarsWeight {
    public static void main(String[] args) {
    float earthWeightZiolog;
    float marsWeightZiolog;
    double marsWeightInDoubleZiolog;
    int marsWeightInIntZiolog;

    earthWeightZiolog = 89;
    marsWeightZiolog = (earthWeightZiolog * 0.38F);
    System.out.println(earthWeightZiolog + "kg on earth is " + marsWeightZiolog + " kg on Mars");

    //assignment (compatible types) from float to double
        marsWeightInDoubleZiolog = marsWeightZiolog;
        System.out.println("Kilograms on Mars after converting to double " + marsWeightInDoubleZiolog);

    //printing a variable limiting the length of printing to 4 deciaml places
    System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDoubleZiolog);

    //a floating point type cast to integer
        marsWeightInIntZiolog = (int)marsWeightInDoubleZiolog;
        System.out.println("Kilograms on Mars when casted to integer "+ marsWeightInIntZiolog);

        //casting an int type to char
        char c = (char)marsWeightInIntZiolog;
        System.out.println("The ASCII table equivalent of marsWeightInInt is " + c);

        //assign the value of performing some mathematical operation on the char character to the new int variable
        int exampleOfMathOnCharZiolog = c * c;
        System.out.println("An example of mathematical operation the char type: " + exampleOfMathOnCharZiolog);

        }
    }
