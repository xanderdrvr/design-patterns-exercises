package be.ucll.sc.designpatternsexercises.gamecontroller;

public class PS5Controller {

    private Command crossButton;
    private Command circleButton;
    private Command squareButton;
    private Command triangleButton;

    public void setCrossButton(Command crossButton) {
        this.crossButton = crossButton;
    }

    public void setCircleButton(Command circleButton) {
        this.circleButton = circleButton;
    }

    public void setSquareButton(Command squareButton) {
        this.squareButton = squareButton;
    }

    public void setTriangleButton(Command triangleButton) {
        this.triangleButton = triangleButton;
    }

    public void pressCross() {
        crossButton.execute();
    }
    public void pressCircle() {
        circleButton.execute();
    }

    public void pressSquare() {
        squareButton.execute();
    }

    public void pressTriangle() {
        triangleButton.execute();
    }
}
