public class task2 {
    public static void main(String[] args) {
        int i = 0;
        int Max_position, Min_position;
        int[] nums = new int[10];
        Max_position = 0;
        Min_position= 100;

        Random r = new Random();

        for (i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100)+1;

            System.out.print(nums[i]+ ", ");
            if(nums[i]<Min_position){
                Min_position=nums[i];}

            if (nums[i]>Max_position){
                Max_position=nums[i];
}
