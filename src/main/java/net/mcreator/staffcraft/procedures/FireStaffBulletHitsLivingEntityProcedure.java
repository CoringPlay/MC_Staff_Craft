package net.mcreator.staffcraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.staffcraft.StaffCraftModElements;

import java.util.Map;

@StaffCraftModElements.ModElement.Tag
public class FireStaffBulletHitsLivingEntityProcedure extends StaffCraftModElements.ModElement {
	public FireStaffBulletHitsLivingEntityProcedure(StaffCraftModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure FireStaffBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 20);
	}
}
