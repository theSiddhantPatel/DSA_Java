package array;

//3151. Special Array
//https://chat.deepseek.com/a/chat/s/45e59028-839b-40e1-bcec-87ae7afe8721   for help purpose
public class q3151 {

    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + nums[i + 1]) % 2 == 0)
                /*-The key insight here is that:
                Even + Even = Even
                Odd + Odd = Even
                Even + Odd = Odd */
                return false;
        }
        return true;
    }
}
