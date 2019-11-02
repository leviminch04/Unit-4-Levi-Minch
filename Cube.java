public class Cube{
    private int numCubed;
    int num;
    public Cube(int thereNum){
        num = thereNum;
    }
    public int getNum() {
        return num;
    }

    public int getNumCubed() {
        return numCubed;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int numCubed(){
        numCubed = num * num * num;
        return numCubed;
    }
}