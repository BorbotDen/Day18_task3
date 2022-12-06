public enum ChessPiece {
    KING_WHITE("♔",100.0),
    KING_BLACK("♚",100.0),
    QUEEN_WHITE("♕",9.0),
    QUEEN_BLACK("♛",9.0),
    ROOK_WHITE("♖",5.0),
    ROOK_BLACK("♜",5.0),
    BISHOP_WHITE("♗",3.5),
    BISHOP_BLACK("♝",3.5),
    KNIGHT_WHITE("♘",3.0),
    KNIGHT_BLACK("♞",3.0),
    PAWN_WHITE("♙",1.0),
    PAWN_BLACK("♙",1.0),
     EMPTY ("⬛",-1.0);

    String icon;
    Double importance;
    private ChessPiece(String icon, Double importance){
        this.icon=icon;
        this.importance=importance;

    }
}
