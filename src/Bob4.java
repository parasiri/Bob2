public class Bob4 implements Runnable {
    private int positionX, positionY;
    private String penColor;

    public Bob4(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;

    }

    @Override
    public void run() {
        Turtle bob4 = new Turtle(this.positionX, this.positionY);
        bob4.penColor(this.penColor);
        bob4.width(3);
        bob4.speed(8);

        bob4.setDirection(0);

        // Draw the wave pattern
        int waveLength = 40; // Adjust the length of each wave segment
        int waveCount = 10; // Adjust the number of waves
        int waveHeight = 15; // Adjust the height of the wave

        for (int i = 0; i < waveCount; i++) {
            bob4.left(90);
            bob4.forward(waveLength);
            bob4.right(90);
            bob4.forward(waveHeight);
            bob4.right(90);
            bob4.forward(waveLength);
            bob4.left(90);
            bob4.forward(waveHeight);
        }

    }
}