package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //int가 5개 있는 배열 생성

        //변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
  

    }
}
