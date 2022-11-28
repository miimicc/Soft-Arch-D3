package lsp;

public class Square extends Geometry {

    private int side;

    Square(int side) {
        // this.side = side;
        this.setSide(side);
    }
    
    public void setSide(int side) {
        assert (side < 0 ) : this.side = 1;
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}