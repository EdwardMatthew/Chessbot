package com.chess.engine.board;

public class MoveTransition {
    private final Board transitionBoard;
    private final Move move;
    // checking if king is in danger when moving
    private final MoveStatus moveStatus;

    public MoveTransition(final Board transitionBoard, final Move move, final MoveStatus moveStatus) {
        this.transitionBoard = transitionBoard;
        this.move = move;
        this.moveStatus = moveStatus;
    }
}
