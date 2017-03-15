package by.epam.training.bean;

/**
 *
 */
public class Draughts {
    private String color;
    private String startPosition;
    private String finishPosition;

    public Draughts() {
    }

    /**
     * @param color
     * @param startPosition
     * @param finishPosition
     */
    public Draughts(String color, String startPosition, String finishPosition) {
        this.color = color;
        this.startPosition = startPosition;
        this.finishPosition = finishPosition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getFinishPosition() {
        return finishPosition;
    }

    public void setFinishPosition(String finishPosition) {
        this.finishPosition = finishPosition;
    }

    @Override
    public String toString() {
        return "Draughts{" +
                "color='" + color + '\'' +
                ", startPosition='" + startPosition + '\'' +
                ", finishPosition='" + finishPosition + '\'' +
                '}';
    }
}
