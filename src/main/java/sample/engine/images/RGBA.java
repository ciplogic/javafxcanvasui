package sample.engine.images;

public class RGBA {
    public static int color(int r, int g, int b, int a) {
        int col = (a << 24) |
                (r << 16) |
                (g << 8) |
                (b);
        return col;
    }
}
