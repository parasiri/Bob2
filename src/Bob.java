public class Bob implements Runnable {
    private int positionX, positionY;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(3);
        bob.speed(8);

        double petalCount = 6.0;
        double angleStep = 360.0 / (petalCount * 100.0);
        
        for (double theta = 0; theta < 360; theta += angleStep) {
            double radius = 100.0 * Math.sin(petalCount * Math.toRadians(theta));
            double x = radius * Math.cos(Math.toRadians(theta));
            double y = radius * Math.sin(Math.toRadians(theta));
            
            bob.setPosition(x, y);
        }


    }
}