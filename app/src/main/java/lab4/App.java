/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab4;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String inputFilePath = "C:\\Users\\STUDENT\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\" + "panda" + ".bmp";
        String outputFilePath = "C:\\Users\\STUDENT\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\" + "test1" + ".bmp";
        String transform = "testV.bmp";
        Bitmap bitmap = null;

        // Try to read in file from CLI argument
        try {
            bitmap = new Bitmap(inputFilePath, outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading file. " + e);
        }

        // Perform transform based on CLI argument
        switch (transform) {
            case "blackgreen": Bitmap.reverseBlackAndGreen(); break;
            case "random": Bitmap.random(); break;
            case "stretchvertically": Bitmap.stretchVertically(); break;
            case "stretchvorizontally": Bitmap.stretchHorizontally(); break;
            default : System.out.println("Invalid Transform. Choices are: 'blackwhite', 'random', 'stretchvertically','stretchvorizontally'.");
        }

        // Try to save in file
        try {
            assert bitmap != null;
            bitmap.save();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving file. " + e);
        }


    }

}
