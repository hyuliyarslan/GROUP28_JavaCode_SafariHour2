package be.kdg.integration.team28.game2.model.Board;

public class Board {
    private final int rows = 10;
    private final int colums = 10;
    private String level;
    private final int ELEPHANT_COUNT = 3;
    private final int ZEBRA_COUNT = 3;
    private final int RHINOS_COUNT = 3;
    private final int LIONS_COUNT = 3;
    private final int LIONESSESS_COUNT = 3;
    private final int GREEN_SAFARI_COUNT = 3;
    private final int TERMITE_MOUNTS_COUNT = 3;
    private final int IMPALAS_COUNT = 3;

    // constructor
    public Board (String level)
    {
        setLevel(level);
    }
    public Board()
    {

    }

    //getter

    public String getLevel() {
        return level;
    }

    //setter

    public void setLevel(String level) {
        this.level = level;
    }
}
