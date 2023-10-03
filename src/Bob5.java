public class Bob5 implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Bob5(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;

    }

    @Override
    public void run() {
        Turtle bob5 = new Turtle(this.positionX, this.positionY);
        bob5.penColor(this.penColor);
        bob5.width(3);
        bob5.speed(2);

        bob5.right(90);
        for(int i = 0; i < 17; i++){
            bob5.forward(10);
            bob5.up();
            bob5.forward(10);
            bob5.down();
        }

    }
}