package ex11;

public class GradeExpr {

    private int[] jumsu;

    public GradeExpr(int[] jumsu) {
        this.jumsu = jumsu;
    }

    public double getAverage() {
        return (double) getTotal() / jumsu.length;
    }
    
    public int getTotal() {
        int sum = 0;
        for(int score : jumsu) {
            sum += score;
        }
        return sum;
    }

    public int getGoodScore() {
        int max = jumsu[0];
        for (int score : jumsu) {
            if (score > max) {
                max = score;
            }
        }
    return max;
    }

    public int getBadScore() {
        int min = jumsu[0];
        for (int score : jumsu) {
            if (score < min) {
                min = score;
            }
        }
    return min;
    }
}
