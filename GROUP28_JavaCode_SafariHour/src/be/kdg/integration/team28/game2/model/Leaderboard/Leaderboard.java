package be.kdg.integration.team28.game2.model.Leaderboard;

import java.lang.reflect.Constructor;

public class Leaderboard {
    private String Name;
    private int recordMoves;


    public Leaderboard (String name, int record)
    {
        setName(name);
        setRecordMoves(record);
    }
    public Leaderboard (String name)
    {
        setName(name);
    }
    public Leaderboard ()
    {

    }

    //getter

    public int getRecordMoves() {
        return recordMoves;
    }

    public String getName() {
        return Name;
    }
    //setter

    public void setName(String name) {
        Name = name;
    }

    public void setRecordMoves(int recordMoves) {
        this.recordMoves = recordMoves;
    }
}
