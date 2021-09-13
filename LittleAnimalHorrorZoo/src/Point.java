
public class Point {
    // encapsulated attributes
    private int x;
    private int y;



    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);

        }

    public int getX() {
        return x;
    }

    // returns the y-coordinate of this point
    public int getY() {
        return y;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void boundaryControl(int input){

        if (input + this.y < 10 && input + this.y > 0) {
            setY(input + this.y);
        } if (input + this.x < 10 && input + this.y > 0){
            setX(input + this.x);
        }
    }

    //returns a String representation of this point
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }





}


