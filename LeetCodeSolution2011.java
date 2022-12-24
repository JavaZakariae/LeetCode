//2011. Final Value of Variable After Performing Operations
public class LeetCodeSolution2011 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println("finalValueAfterOperations(operations) = " + finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            switch (operation){
                case "--X", "X--" -> result--;
                case "++X", "X++" -> result++;
            }
        }
        return result;
    }
}
