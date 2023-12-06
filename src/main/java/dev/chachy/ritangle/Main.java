package dev.chachy.ritangle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.chachy.ritangle.jamboree.Board;
import dev.chachy.ritangle.jamboree.Player;
import dev.chachy.ritangle.jamboree.Round;
import dev.chachy.ritangle.jamboree.Team;

import java.util.Arrays;

public class Main {
    private static final char[] teamIds = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int BOARDS = 4;
    private static final int BOARD_PLAYERS = 6;
    private static final int ROUNDS = 3;

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Team[] teams = generateTeams();
        generatePlayers(teams);

        System.out.println(gson.toJson(generateRounds(teams)));
    }

    private static Team[] generateTeams() {
        Team[] teams = new Team[teamIds.length];

        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team(teamIds[i]);
        }

        return teams;
    }

    private static Round[] generateRounds(Team[] teams) {
        Round[] rounds = new Round[ROUNDS];
        for (int round = 0; round < ROUNDS; round++) {
            Board[] boards = new Board[BOARDS];
            for (int i = 0; i < BOARDS; i++) {
                Player[] players = new Player[BOARD_PLAYERS];
                int index = 0;
                for (Team team : teams) {
                    players[index] = team.getPlayer(i);
                    index++;
                }
                boards[i] = Board.generate(players);
            }
            rounds[round] = new Round(boards[0], boards[1], boards[2], boards[3]);
        }

        return rounds;
    }

    private static void generatePlayers(Team[] teams) {
        for (Team team : teams) {
            for (int i = 0; i < BOARDS; i++) {
                team.join(new Player(team.getId(), i));
            }
        }
    }
}