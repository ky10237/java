package chapter01;

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[] studentNames = new String[5];
        int[][] scores = new int[5][3];
        double[] averages = new double[5];
        char[] grades = new char[5];

        // 학생 정보 입력
        for (int i = 0; i < 5; i++) {
            System.out.print("어떤 학생의 점수를 입력하시겠습니까? ");
            studentNames[i] = scanner.nextLine();
            System.out.println("1과목/2과목/3과목 점수를 입력하세요. (/로 구분하여 입력하세요)");
            String[] scoreInput = scanner.nextLine().split("/");
            for (int j = 0; j < 3; j++) {
                scores[i][j] = Integer.parseInt(scoreInput[j].trim());
            }
        }

        System.out.println("모든 학생의 점수가 입력되었습니다.");

        // 평균 계산
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            averages[i] = (double) sum / 3;
        }

        // 전체 평균 및 표준편차 계산
        double totalAverage = calculateTotalAverage(averages);
        double standardDeviation = calculateStandardDeviation(averages, totalAverage);

        // 등급 부여
        for (int i = 0; i < 5; i++) {
            grades[i] = calculateGrade(averages[i], totalAverage, standardDeviation);
        }

        // 결과 출력
        System.out.println("\n학생별 성적 결과:");
        System.out.println("이름\t평균\t등급");
        for (int i = 0; i < 5; i++) {
            System.out.println(studentNames[i] + "\t" + String.format("%.2f", averages[i]) + "\t" + grades[i]);
        }

        scanner.close();
    }

    // 전체 평균 계산
    private static double calculateTotalAverage(double[] averages) {
        double sum = 0;
        for (double average : averages) {
            sum += average;
        }
        return sum / averages.length;
    }

    // 표준편차 계산
    private static double calculateStandardDeviation(double[] averages, double totalAverage) {
        double sum = 0;
        for (double average : averages) {
            sum += Math.pow(average - totalAverage, 2);
        }
        return Math.sqrt(sum / averages.length);
    }

    // 등급 계산 (평균, 전체 평균, 표준편차 사용)
    private static char calculateGrade(double average, double totalAverage, double standardDeviation) {
        double zScore = (average - totalAverage) / standardDeviation;

        if (zScore > 1.5) {
            return 'A';
        } else if (zScore > 0.5) {
            return 'B';
        } else if (zScore > -0.5) {
            return 'C';
        } else if (zScore > -1.5) {
            return 'D';
        } else {
            return 'F';
        }
	}

}
