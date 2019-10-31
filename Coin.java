//blueprint for how to make a coin object
public class Coin {
  //These are the declorations for the attributes of a coin
  private int face;
  private final int HEADS = 0;
  private final int TAILS = 1;

  //The coin constructur that defines what happens when a coin object is made
  public Coin(){
    flip();
  }



  //The accesor method for the face variable (a getter)
  public int getFace(){
    return face;
  }

  //the mutater method fo the face variable (a setter)
  public void setFace(int newFace){
    face = newFace;
  }

  //assains a randomly chosen value to the face of the coin
  public void flip(){
    face = (int) (Math.random()*2);
  }
  //tells us if the coins face is a heads or not
  public boolean isHeads() {
     return (face == HEADS);
  }
  //prints information about the current state of a coin
  public String toString(){
    String result = "";
    if (face == HEADS)
      result = "Heads";
    else
      result = "Tails";
    return result;
  }
}
