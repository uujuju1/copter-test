package sw.entities.comp;

import ent.anno.*;
import ent.anno.Annotations.*;
import mindustry.gen.*;
import sw.gen.*;

class EntityDefinitions<E> {
	@EntityDef({Unitc.class, Copterc.class}) E myUnit;
}
