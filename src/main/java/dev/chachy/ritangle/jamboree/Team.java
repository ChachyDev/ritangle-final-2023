package dev.chachy.ritangle.jamboree;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final char id;
    private final List<Player> players = new ArrayList<>();

    public Team(char id) {
        this.id = id;
    }

    public void join(Player player) {
        if (this.players.size() == 4) {
            throw new IllegalStateException("You cannot join a team that is full");
        }
        this.players.add(player);
    }

    public Player[] getPlayers() {
        return players.toArray(new Player[0]);
    }

    public Player getPlayer(int id) {
        for (Player player : players) {
            if (player.getId() == id) return player;
        }

        return null;
    }

    public char getId() {
        return id;
    }
}
