//3. Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary
package function_array;

import java.util.Arrays;

public class EmployeeSalary {
    public static void main(String[] args) {
        int[] salary = {35000, 25000, 28000, 32500, 44000, 32800};
        int n = salary.length;
        Arrays.sort(salary);
        System.out.println(salary[n-3]);
    }
}
