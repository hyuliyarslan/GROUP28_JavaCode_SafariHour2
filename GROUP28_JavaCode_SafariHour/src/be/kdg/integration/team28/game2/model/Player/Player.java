package be.kdg.integration.team28.game2.model.Player;

public class Player {
    private int record;
    private int currentMoves;
    private String name;
    private String level;

    private int position;


    public Player(int record, int currentMoves, String name, String level, int position) {
        this.record = record;
        this.currentMoves = currentMoves;
        this.name = name;
        this.level = level;
        this.setPosition(position);
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public int getCurrentMoves() {
        return currentMoves;
    }

    public void setCurrentMoves(int currentMoves) {
        this.currentMoves = currentMoves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position += position;
    }
}