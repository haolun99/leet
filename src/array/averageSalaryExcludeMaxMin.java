package array;

import java.util.Arrays;

public class averageSalaryExcludeMaxMin {
    public static void main(String[] args){
        int[] test = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(new averageSalaryExcludeMaxMin().average(test));
    }
    // 1491
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        int max = salary[salary.length - 1];
        int min = salary[0];

        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
        }

        return (sum - max - min) / (salary.length - 2);
    }

}
