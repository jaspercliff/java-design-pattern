package strategy;

import static strategy.LambdaStrategy.Strategy.MeleeStrategy;
import static strategy.LambdaStrategy.Strategy.ProjectileStrategy;

public class App {
    public static void main(String[] args) {
                System.out.println("GREEN_DRAGON_SPOTTED");
        DragonSlayer dragonSlayer = new DragonSlayer(MeleeStrategy);
        dragonSlayer.goToBattle();
                System.out.println("RED_DRAGON_EMERGES");
        dragonSlayer.changeStrategy(ProjectileStrategy);
        dragonSlayer.goToBattle();
    }
}
