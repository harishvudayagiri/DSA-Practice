import com.learnSpring.LearningSpringBoot.game.GameRunner;
import com.learnSpring.LearningSpringBoot.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame=new MarioGame();
        var gameRunner=new GameRunner(marioGame);

        gameRunner.run();
    }
}
