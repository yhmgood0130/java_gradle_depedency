/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public int add(int a,int b){
        return a + b;
    }
    public boolean isNegative(int num){
        if(num < 0)
            return true;
        else
            return false;
    }
    public boolean login(String password) {
        if(StringUtils.equals(password, "xxxxx")) {
            return true;
        } else {
            return false;
        }
    }
    public float average(List<Float> numbers) {
        float sum = 0.0f;
        for(float number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }


}
