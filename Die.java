public class Die{
    private int die;
    public Die(){
        die = 1;
    }
    public void roll(int faceAmount){
        die = (int) ((Math.random()*faceAmount) + 1);
    }

    public int getDie() {
        return die;
    }
    public String toString(){
        String result = "";
        result += "Face side: " + die + "\n";
        return result;
    }
}
