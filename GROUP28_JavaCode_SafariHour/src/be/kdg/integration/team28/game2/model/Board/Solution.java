package be.kdg.integration.team28.game2.model.Board;

public class Solution {
    private String token;
    private String movement;

    public Solution(String token, String movement)
    {
        setMovement(movement);
        setToken(token);
    }
    public Solution(String token)
    {
        setToken(token);
    }
    public Solution ()
    {
        
    }


    //get

    public String getMovement() {
        return movement;
    }

    public String getToken() {
        return token;
    }
    //set

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
