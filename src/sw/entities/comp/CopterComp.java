package sw.entities.comp;

import arc.*;
import arc.graphics.g2d.*;
import arc.util.*;
import ent.anno.*;
import ent.anno.Annotations.*;
import mindustry.gen.*;
import mindustry.type.*;

@EntityComponent
abstract class CopterComp implements Unitc {
	@Import UnitType type;
	@Import float x, y, rotation;

	@Override
	public void draw() {
		Draw.rect(Core.atlas.find("ohno"), x, y, Time.time);
	}
}
