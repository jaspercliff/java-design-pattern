package strategy;

public class LambdaStrategy {

    public enum Strategy implements DragonSlayingStrategy{
        MeleeStrategy(()->{
            System.out.println("With your Excalibur you serve the dragon's head!");
        }),
        ProjectileStrategy(()->{
            System.out.println("You shoot the dragon!!!");
        });
        private final DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy strategy){
            this.dragonSlayingStrategy = strategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }
}
