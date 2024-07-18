import java.util.ArrayList;
import java.util.List;


public class CombinationOFSum {
    public static void main(String[] args) {
        int student [] = {5, 4, 3,};
        int target = 9;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(student, target, 0, 0, temp, result);
        System.out.println(result);
    }
    public static void helper(int[] student, int target, int sum, int inx, List<Integer>  temp, List<List<Integer>> result ) {
        if(target < sum){
            return;
        }
        if(inx == student.length){
            if(sum == target){
                result.add(new ArrayList<>(temp));
                
            }
            return;
        }
            sum += student[inx];
            temp.add(student[inx]);
            helper(student, target, sum, inx, temp, result);
            sum -= student[inx];
            temp.remove(temp.size() - 1);
            helper(student, target, sum, inx + 1, temp, result);
                       
    }

}