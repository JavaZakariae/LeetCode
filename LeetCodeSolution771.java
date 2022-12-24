//1108. Defanging an IP Address
public class LeetCodeSolution771 {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println("numJewelsInStones(jewels, stones) = " + numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        char[] chars = stones.toCharArray();
        for (char c : chars) {
            if (jewels.indexOf(c)!=-1)
                result++;
        }
        return result;
    }
}
