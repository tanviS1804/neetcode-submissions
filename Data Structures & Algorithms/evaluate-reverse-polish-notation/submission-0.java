class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

    HashMap<String, Integer> map = new HashMap<>();

    map.put("+", 1);
    map.put("-", 2);
    map.put("*", 3);
    map.put("/", 4);

    for (int i = 0; i < tokens.length; i++) {

        if (map.containsKey(tokens[i])) {

            int a = stack.pop();
            int b = stack.pop();

            int ans = 0;

            if (tokens[i].equals("+")) {
                ans = b + a;
            } 
            else if (tokens[i].equals("-")) {
                ans = b - a;
            } 
            else if (tokens[i].equals("*")) {
                ans = b * a;
            } 
            else {
                ans = b / a;
            }

            stack.push(ans);

        } else {
            stack.push(Integer.parseInt(tokens[i]));
        }
    }

    return stack.pop();
    }
}
