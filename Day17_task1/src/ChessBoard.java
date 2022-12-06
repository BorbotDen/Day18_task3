public class ChessBoard {
    private  ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces){
        this.chessPieces=chessPieces;
    }

    public static void print(ChessPiece[][] chessPieces){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessPieces[i][j].icon+" " );
            }
          System.out.println();
        }
    }

}
