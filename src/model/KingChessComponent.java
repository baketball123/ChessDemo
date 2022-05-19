package model;
import view.ChessboardPoint;
import controller.ClickController;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class KingChessComponent extends ChessComponent {
    private static Image ROOK_WHITE;
    private static Image ROOK_BLACK;
    private Image kingImage;



    @Override
    public boolean canMoveTo(ChessComponent[][] chessboard, ChessboardPoint destination) {
        return false;
    }
    private void initiateKingImage(ChessColor color) {
        try {
            loadResource();
            if (color == ChessColor.WHITE) {
                kingImage = ROOK_WHITE;
            } else if (color == ChessColor.BLACK) {
                kingImage = ROOK_BLACK;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public KingChessComponent(ChessboardPoint chessboardPoint, Point location, ChessColor color, ClickController listener, int size) {
        super(chessboardPoint, location, color, listener, size);
        initiateKingImage(color);
    }

    @Override
    public void loadResource() throws IOException {
        if (ROOK_WHITE == null) {
        ROOK_WHITE = ImageIO.read(new File("./images/king-white.png"));
    }

        if (ROOK_BLACK == null) {
            ROOK_BLACK = ImageIO.read(new File("./images/king-black.png"));
        }

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(rookImage, 0, 0, getWidth() - 13, getHeight() - 20, this);
        g.drawImage(kingImage, 4, 0, getWidth() , getHeight(), this);
        g.setColor(Color.BLACK);
        if (isSelected()) { // Highlights the model if selected.
            g.setColor(Color.RED);
            g.drawOval(4, 0, getWidth() , getHeight());
        }
    }
}
