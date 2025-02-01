import org.code.theater.*;
import org.code.media.*;

public class Filter extends ImagePlus {

  /*
   * Calls the superclass constructor to initialize pixels
   */
  public Filter(String filename) {
    super(filename);
  }

  /*
   * Inverts the colors in the image by setting the red,
   * green, and blue color values of each Pixel object to
   * the result of 255 minus their current values
   */

  public void makeNegative() {
Pixel[][] pixels = getPixelsFromImage();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        int currentRed = currentPixel.getRed();
        int currentGreen = currentPixel.getGreen();
        int currentBlue = currentPixel.getBlue();

        int newRed = 255 - currentRed;
        int newGreen = 255 - currentGreen;
        int newBlue = 255 - currentBlue;

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }

  /*
   * Applies a threshold filter to an image
   */
  
  public void threshold(int value) {
   Pixel[][] pixels = getPixelsFromImage();
    int average = 0;

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

       average = (int) (currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue())/3;

        if (average < value){
          currentPixel.setColor(Color.BLACK);
        } else {
          currentPixel.setColor(Color.WHITE);
        }
      
      }
    }
    System.out.println(average);
  }
  
  /*
   * Applies an Opposite threshold filter to an image
   */
  
  public void opThreshold(int value) {
   Pixel[][] pixels = getPixelsFromImage();
    int average = 0;

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

       average = (int) (currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue())/3;

        if (average > value){
          currentPixel.setColor(Color.BLACK);
        } else {
          currentPixel.setColor(Color.WHITE);
        }
      
      }
    }
    System.out.println(average);
  }


  /*
   * Sets all red to 0
   */
  
  public void zeroRed() {
  Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];
      
        currentPixel.setRed(0);
      }
    }
  }

  /*
   * Sets all blue to 0
   */
  
public void zeroBlue() {
  Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];
      
        currentPixel.setBlue(0);
      }
    }
  }


  /*
   * Sets all green to 0
   */
  
  public void zeroGreen() {
  Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];
      
        currentPixel.setGreen(0);
      }
    }
  }
  
}