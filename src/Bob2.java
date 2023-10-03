public class Bob2 implements Runnable {
    private int positionX, positionY;
    private String penColor;
    public Bob2(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        
    }

    @Override
    public void run() {
        Turtle bob2 = new Turtle(this.positionX, this.positionY);
        bob2.penColor(this.penColor);
        bob2.width(3);
        bob2.speed(5);

         // Draw the leaf shape
         int leafSize = 50; // Adjust the size of the leaf
         bob2.width(3);
         bob2.setDirection(270);
         bob2.forward(200);
 
         // Draw the left side leaf
         bob2.setPosition(0,-150);
         for (int i = 0; i < 45; i++) {
             bob2.forward(leafSize / 45.0);
             bob2.right(2);
             bob2.setDirection(160);
         }
 
         for (int i = 0; i < 90; i++) {
             bob2.forward(leafSize / 45.0);
             bob2.right(2.5);
             
         }
         bob2.setPosition(0,-150);
         bob2.setDirection(135);
         bob2.forward(50);
 
         // Draw the right side leaf
         bob2.setPosition(0,-150);
         bob2.setPosition(0,-200);
         for (int i = 0; i < 45; i++) {
             bob2.forward(leafSize / 45.0);
             bob2.right(2);
             bob2.setDirection(375);
         }
 
         for (int i = 0; i < 90; i++) {
             bob2.forward(leafSize / 45.0);
             bob2.left(2.5);
         }
         bob2.setPosition(0, -200);
         bob2.setDirection(400);
         bob2.forward(50);
         bob2.setPosition(0, -200);
         bob2.setDirection(90);
         bob2.forward(200);




        
    }
}