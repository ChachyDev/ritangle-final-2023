package dev.chachy.ritangle.jamboree;

public class Round {
    private final Board board1;
    private final Board board2;
    private final Board board3;
    private final Board board4;

    public Round(Board board1, Board board2, Board board3, Board board4) {
        this.board1 = board1;
        this.board2 = board2;
        this.board3 = board3;
        this.board4 = board4;
    }
}
