/**
 * This interface represents a strategy for performing operations on two integers.
 */ // 策略接口
public interface Strategy {
    public void doOperation(int num1, int num2);
}

// 实现策略接口的具体策略类
class OperationAdd implements Strategy{
    @Override
    public void doOperation(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

class OperationSubstract implements Strategy{
    @Override
    public void doOperation(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}

// 上下文类
class Context {
    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2){
        strategy.doOperation(num1, num2);
    }
}

 class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        context.executeStrategy(10, 5);

        context = new Context(new OperationSubstract());
        context.executeStrategy(10, 5);
    }
}