public class Bob3 implements Runnable {
    private int positionX, positionY;
    private String penColor;
    public Bob3(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        
    }

    @Override
    public void run() {
        Turtle bob3 = new Turtle(this.positionX, this.positionY);
        bob3.penColor(this.penColor);
        bob3.width(3);
        bob3.speed(8);

        for(int i=0;i<200;i++)
        {
            bob3.forward(i/50.);
            bob3.left(10);
        }


    }
}