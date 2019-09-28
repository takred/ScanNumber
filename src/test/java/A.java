import java.util.List;

public class A {
    public boolean scan(List<Integer> allNumbers, int number){
        for (int i = 0; i < allNumbers.size(); i++) {
            if (allNumbers.get(i) == number){
                return true;
            }
        }
        return false;
    }
    public boolean scanBisection(List<Integer> allNumbers, int number){
        int border = allNumbers.size() / 2;
        for (int i = 0; i < allNumbers.size(); i++) {
            if (number < allNumbers.get(border)){
                border = border / 2;
            } else {
                border = border + ((allNumbers.size() - border) / 2);
            }
            if (allNumbers.get(border) == number || allNumbers.get(border + 1) == number){
                return true;
            }
        }
        return false;
    }
}
