import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private static final String[][] food = { {"Mango", "Strawberries"},
                                          {"Potato", "Broccoli"},
                                          {"Rice", "Bagel"},
                                          {"Burger", "Pizza"},
                                          {"Lemonade", "Orange Juice"},
                                          {"Mochi", "Doughnut"} }; 

  private static final String[][] foodImage = { {"mango.JPEG", "strawberry.PNG"},
                                          {"potato.JPEG", "broccoli.png"},
                                          {"rice.png", "bagel.JPEG"},
                                          {"burger.png", "pizza.JPEG"},
                                          {"lemonade.JPEG", "orangeJuice.png"},
                                          {"mochi.png", "doughnut.png"} }; 

  

  
  // Constructor
  public MyStory() {

  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawFirstScene();
    drawSecondScene();
    drawThirdScene();
    drawFourthScene();
    drawFifthScene();
    drawSixthScene();
  }


   public void drawFirstScene() {
    clear("white");
     drawText("Favorite Fruits", 140, 50);
    
    drawText(food[0][0], 50, 100);
    pause(0.5);
    drawText(food[0][1], 250, 100);
    pause(0.5);

    Filter img1 = new Filter(foodImage[0][0]);
    
    drawImage(img1, 50, 200, 100);
    pause(0.5);
    img1.zeroBlue();
    drawImage(img1, 50, 200, 100);
    
    Filter img2 = new Filter(foodImage[0][1]);
    drawImage(img2, 250, 200, 100);
    pause(0.5);
    img2.zeroBlue();
    drawImage(img2, 250, 200, 100);
    

    pause(1.0);
  }

   public void drawSecondScene() {
    clear("white");
     drawText("Favorite Vegatables", 140, 50);

    drawText(food[1][0], 50, 100);
    pause(0.5);
    drawText(food[1][1], 250, 100);
    pause(0.5);

    Filter img3 = new Filter(foodImage[1][0]);
    
    drawImage(img3, 50, 200, 100);
    pause(0.5);
    img3.zeroRed();
    drawImage(img3, 50, 200, 100);
    
    Filter img4 = new Filter(foodImage[1][1]);
    drawImage(img4, 250, 200, 100);
    pause(0.5);
    img4.zeroRed();
    drawImage(img4, 250, 200, 100);
    

    pause(1.0);
  }

   public void drawThirdScene() {
    clear("white");
     drawText("Favorite Grains", 140, 50);

    drawText(food[2][0], 50, 100);
    pause(0.5);
    drawText(food[2][1], 250, 100);
    pause(0.5);

    Filter img5 = new Filter(foodImage[2][0]);
    
    drawImage(img5, 50, 200, 100);
    pause(0.5);
    img5.zeroGreen();
    drawImage(img5, 50, 200, 100);
    
    Filter img6 = new Filter(foodImage[2][1]);
    drawImage(img6, 250, 200, 100);
    pause(0.5);
    img6.zeroGreen();
    drawImage(img6, 250, 200, 100);
    

    pause(1.0);
  }

   public void drawFourthScene() {
    clear("white");
     drawText("Favorite Meals", 140, 50);

    drawText(food[3][0], 50, 100);
    pause(0.5);
    drawText(food[3][1], 250, 100);
    pause(0.5);

    Filter img7 = new Filter(foodImage[3][0]);
    
    drawImage(img7, 50, 200, 100);
    pause(0.5);
    img7.makeNegative();
    drawImage(img7, 50, 200, 100);
    
    Filter img8 = new Filter(foodImage[3][1]);
    drawImage(img8, 250, 200, 100);
    pause(0.5);
    img8.makeNegative();
    drawImage(img8, 250, 200, 100);
    

    pause(1.0);
  }

   public void drawFifthScene() {
    clear("white");
     drawText("Favorite Drinks", 140, 50);

    drawText(food[4][0], 50, 100);
    pause(0.5);
    drawText(food[4][1], 250, 100);
    pause(0.5);

    Filter img9 = new Filter(foodImage[4][0]);
    
    drawImage(img9, 50, 200, 100);
    pause(0.5);
    img9.threshold(155);
    drawImage(img9, 50, 200, 100);
    
    Filter img10 = new Filter(foodImage[4][1]);
    drawImage(img10, 250, 200, 100);
    pause(0.5);
    img10.threshold(155);
    drawImage(img10, 250, 200, 100);
    

    pause(1.0);
  }

   public void drawSixthScene() {
    clear("white");
     drawText("Favorite Sweets", 140, 50);

    drawText(food[5][0], 50, 100);
    pause(0.5);
    drawText(food[5][1], 250, 100);
    pause(0.5);

    Filter img11 = new Filter(foodImage[5][0]);
    
    drawImage(img11, 50, 200, 100);
    pause(0.5);
    img11.opThreshold(155);
    drawImage(img11, 50, 200, 100);
    
    Filter img12 = new Filter(foodImage[5][1]);
    drawImage(img12, 250, 200, 100);
    pause(0.5);
    img12.opThreshold(155);
    drawImage(img12, 250, 200, 100);
    

    pause(1.0);
  }

}