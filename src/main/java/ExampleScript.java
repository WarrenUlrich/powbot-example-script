import org.powbot.api.loadout.LoadoutBuilder;
import org.powbot.api.script.*;

import com.warren.bt.BehaviorScript;
import com.warren.bt.BehaviorTree;

@ScriptManifest(name = "Example Script", description = "Example Script", version = "1")
public class ExampleScript extends BehaviorScript {
  @Override
  public void onStart() {
    super.onStart(); // Required
  }

  @Override
  public BehaviorTree.Builder builder() {
    //@formatter:off
    return BehaviorTree.builder()
      .sequence()
      .end();
    //@formatter:on
  }

  public static void main(String[] args) {
    new ExampleScript().startScript();
  }
}
