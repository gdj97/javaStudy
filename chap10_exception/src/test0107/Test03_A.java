package test0107;


public class Test03_A {
	public static void main(String[] args) {
        GradeChecker checker = (score) -> {
            if (score >= 90) {
                return 'A';
            } else {
                return 'B';
            }
        };
        System.out.println("85점의 등급: " + checker.getGrade(85));
        System.out.println("95점의 등급: " + checker.getGrade(95));
	}
}

