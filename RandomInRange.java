public class RandomInRange{
    int min, max, random;
    public RandomInRange(int thereMin, int thereMax){
        min = thereMin;
        max = thereMax;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getRandom() {
        return random;
    }

    public int rand(){
        random = (int) (Math.random()*(max - min) + min);
        return random;
    }

}