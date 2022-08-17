class Solution 
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            if(curr=='(' || curr== '[' || curr=='{')
            {
                stack.push(curr);
            }
            
            else
            {
                if(stack.isEmpty())return false;
                char last=stack.pop();
                if(curr==')' && last!='(' || curr=='}' && last!='{' || curr==']' && last!='[') return false;
            }
        }
        return stack.isEmpty();
        
    }
}