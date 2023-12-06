package dev.chachy.ritangle.jamboree;

public class Player {
    private char teamId;
    private int id;

    public Player(char teamId, int id) {
        this.teamId = teamId;
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
