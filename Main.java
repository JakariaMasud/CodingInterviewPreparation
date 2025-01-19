public class Main {
    public static void main(String[] args) {
        ProblemSolver solver = new ProblemSolver();
        for(int i=0;i<=5;i++){
            System.out.println(solver.fibonacciRecursive(i));
        }
        for(int i=0;i<=5;i++){
            System.out.println(solver.fibonacciIterative(i));
        }
    }
}