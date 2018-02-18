package sample.engine.images;

public class Rect {
    int top;
    int left;
    int width;
    int height;

    public Rect(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPos(int x, int y) {
        left = x;
        top = y;
    }

    public void setSize(int w, int h) {
        width = w;
        height = h;
    }
}
