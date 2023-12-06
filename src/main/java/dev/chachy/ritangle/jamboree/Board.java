package dev.chachy.ritangle.jamboree;

public class Board {
    private final Game[] games;

    public Board(Game[] games) {
        if (games.length != 6) {
            throw new IllegalArgumentException("You must have 6 games");
        }

        this.games = games;
    }

    public static Board generate(Player[] players) {
//        List<Player> pairs = new ArrayList<>();
//
//        // Iterate through the array to generate pairs
//        for (int i = 0; i < players.length; i++) {
//            for (int j = i + 1; j < players.length; j++) {
//                String[] pair = {players[i].toString(), players[j].toString()};
//                pairs.add(pair);
//            }
//        }
//
//        return pairs;
        return new Board(new Game[6]);
    }
}
