//LeetCode Goal Parser Interpretation
public class LeetCodeSolution1678 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println("interpret(command) = " + interpretUsingStringBuilder(command));
    }

    public static String interpret(String command) {
        command = command.replaceAll("\\(\\)", "o");
        return command.replaceAll("\\(al\\)", "al");
    }

    public static String interpretUsingStringBuilder(String command) {
        int index = 0;
        StringBuilder result = new StringBuilder();
        //"(al)G(al)()()G"
        while (index < command.length()){
            char currentChar = command.charAt(index);
            if (currentChar == 'G'){
                result.append(currentChar);
                index ++;
            }
            else{
                char nextChar = command.charAt(index+1);
                if (currentChar == '(' && nextChar == ')'){
                    result.append('o');
                    index += 2;
                }
                else if (currentChar == '(' && nextChar == 'a'){
                    result.append("al");
                    index += 4;
                }
            }
        }
        return result.toString();
    }

}
