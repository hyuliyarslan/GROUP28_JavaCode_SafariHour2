package be.kdg.integration.team28.game2.model.Board;

public class Token {
    private char code;
    private int length;
    private String place;
    private String direction;
    private int spaces;
    //Constructor
    public  Token (char code, int length, String place, String direction,int spaces)
    {
        setCode(code);
        setLength(length);
        setDirection(direction);
        setPlace(place);
        setSpaces(spaces);
    }
    public  Token(char code, int length, String place, String direction)
    {
        setCode(code);
        setLength(length);
        setDirection(direction);
        setPlace(place);

    }
    public  Token(char code, int length, String place)
    {
        setCode(code);
        setLength(length);

        setPlace(place);

    }
    public  Token(char code, int length)
    {
        setCode(code);
        setLength(length);

    }
    public  Token(char code)
    {
        setCode(code);

    }
    public  Token()
    {

    }


    //get
    public char getCode() {
        return code;
    }

    public int getLength() {
        return length;
    }

    public int getSpaces() {
        return spaces;
    }

    public String getDirection() {
        return direction;
    }

    public String getPlace() {
        return place;
    }


    //set
    public void setCode(char code) {
        this.code = code;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
