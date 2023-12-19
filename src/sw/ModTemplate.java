package sw;

import mindustry.mod.*;
import mindustry.type.*;
import sw.gen.*;

public class ModTemplate extends Mod{
  public static UnitType testCopter;

  @Override
  public void loadContent(){
    EntityRegistry.register();
    testCopter = EntityRegistry.content("test-copter", CopterUnit.class, name -> new UnitType(name) {{
      health = 69;
      speed = 5;
    }});
  }
}
