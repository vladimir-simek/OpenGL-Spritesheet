package utils;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    private final BufferedImage image;

    public SpriteSheet(BufferedImage image) {
        this.image = image;
    }

    public BufferedImage grabImage(int column, int row, int width, int height) {
        return this.image.getSubimage((column*6) - 6, (row)-1, width, height);
    }


}
