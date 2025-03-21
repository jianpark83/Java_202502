package ex07;

import java.util.*;

class Num1 {

    private int num;

    public Num1(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + "";
    }

    // equals() 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 같은 객체 참조
        if (obj == null || getClass() != obj.getClass()) return false;
        Num1 num1 = (Num1) obj;
        return num == num1.num; // 값 비교
    }

    // hashCode() 오버라이딩
    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}

public class SetExam03 {

    public static void main(String[] args) {

        Set<Num1> set = new HashSet<Num1>();

        set.add(new Num1(1234));
        set.add(new Num1(1357));
        set.add(new Num1(1395));
        set.add(new Num1(1234)); // 중복 데이터
        set.add(new Num1(1357)); // 중복 데이터

        for (Num1 n : set) {
            System.out.println(n);
        }
    }
}
//챗지피티