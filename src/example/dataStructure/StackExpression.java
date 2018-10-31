package example.dataStructure;

import java.io.IOException;

/**     利用堆栈将中缀表达式转换成后缀表达式
 * 使用堆栈进行表达式的堆栈将中缀（Infix）表达式转换成后缀（postfix）表达式
 */
public class StackExpression {
    private Stack theStack;
    private String input;
    private String output = "";

    public StackExpression(String in){
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    public String doTrans(){
        for(int j=0;j<input.length();j++){
            char  ch=input.charAt(j);
            switch (ch){
                case '+':
                case '-':
                    gotOper(ch,1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while(!theStack.isEmpty()){
            output=output+theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    private void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            }else {
                output = output + chx;
            }
        }
    }

    private void gotOper(char ch, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            }
            else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                }
                else
                    output = output + opTop;
            }
        }
        theStack.push(ch);
    }

    public static void main(String[] args) throws IOException{
        String input = "1+2*4/5-7+3/6";
        String output;
        StackExpression theTrans = new StackExpression(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
    }
}
