package be.kdg.integration.team28.game2.model.Player;

public class Player {
    private int record;
    private int currentMoves;
    private String name;
    private String level;


    public Player( String name, String level) {
        this.name = name;
        this.level = level;
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

    /*
    comment
     */
}//class