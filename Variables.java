public class VariableExample {
    int instanceVariable = 40;
    static int staticVariable = 50;
    public void useLocalVariable() {
        int localVar = 80; 

        System.out.println("Local Variable: " + localVar);
    }
    public void useInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVariable);
    }
    public static void useStaticVariable() {
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableExample example = new VariableExample();
        example.useLocalVariable();
        example.useInstanceVariable();
        useStaticVariable();
    }
}
