import java.util.Arrays;

/**         for (int i = 0; i < 4; i++) {
        System.out.println("⬛ ⬜ ⬛ ⬜ ⬛ ⬜ ⬛ ⬜");
        System.out.println("⬜ ⬛ ⬜ ⬛ ⬜ ⬛ ⬜ ⬛");
        //System.out.println("\t⃣\t⃣\t⃣⃣\t⃣\t⃣⃣\t⃣\t⃣);
        }
*/


public class Main {
    public static void main(String[] args) {
    String[] figur={ChessPiece.PAWN_WHITE.icon,
            ChessPiece.PAWN_WHITE.icon,
            ChessPiece.PAWN_WHITE.icon,
            ChessPiece.PAWN_WHITE.icon,
            ChessPiece.ROOK_BLACK.icon,
            ChessPiece.ROOK_BLACK.icon,
            ChessPiece.ROOK_BLACK.icon,
            ChessPiece.EMPTY.icon,

    };

    ChessPiece[][] kaspar={{ChessPiece.ROOK_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK,ChessPiece.KING_BLACK,ChessPiece.EMPTY},
            {ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
            {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.KNIGHT_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
            {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_BLACK,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
            {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
            {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.KING_WHITE,ChessPiece.EMPTY}
            };

    System.out.println(Arrays.toString(figur));

    ChessBoard.print(kaspar);    }
}