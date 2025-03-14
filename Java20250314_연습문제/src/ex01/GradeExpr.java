package ex01;

public class GradeExpr {

    private int[] jumsu;    
//  private int sum = 0;
    
    public GradeExpr(int[] jumsu) {
        this.jumsu = jumsu;
    }

    public int getTotal() {      
    	int sum = 0;   
        for(int i=0; i<jumsu.length; i++) 
            sum += jumsu[i];
        
        return sum;
    }
    
    public double getAverage() {
        return (double) getTotal() / jumsu.length;
    }
    
    public int getGoodScore() {
        int max = jumsu[0];
        for (int i=0; i<jumsu.length; i++) {
            if (max < jumsu[i])
                max = jumsu[i];
        }
        return max;
    }

    public int getBadScore() {
    	int min = jumsu[0];
        for (int i=0; i<jumsu.length; i++) {
            if (min > jumsu[i])
                min = jumsu[i];
        }
        return min;
    }
}
