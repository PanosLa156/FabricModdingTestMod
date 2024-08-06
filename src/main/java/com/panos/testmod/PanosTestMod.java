package com.panos.testmod;

import com.panos.testmod.block.ModBlocks;
import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.entity.custom.GnomeEntity;
import com.panos.testmod.entity.custom.NautilusEntity;
import com.panos.testmod.item.ModItems;
import com.panos.testmod.itemGroups.ItemGroups;
import com.panos.testmod.util.ModLootTableModifier;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PanosTestMod implements ModInitializer {
	public static final String MOD_ID = "panos-test-mod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	// I have absolutely no idea what I am doing...
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final SimpleParticleType COPPER_FLAME = FabricParticleTypes.simple();
	public static final SimpleParticleType ENDER_FLAME = FabricParticleTypes.simple();

	/*public static final EntityType<SmallExpBottleEntity> SmallExpBottleEntityType = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(ModID, "packed_snowball"),
			FabricEntityTypeBuilder.<PackedSnowballEntity>create(SpawnGroup.MISC, PackedSnowballEntity::new)
					.dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
					.trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles (as it prevents it from breaking, lol)
					.build() // VERY IMPORTANT DONT DELETE FOR THE LOVE OF GOD PSLSSSSSS
	 */

	@Override
	public void onInitialize() {

		ModItems.load();
		ModBlocks.load();
		ModEntities.load();
		ItemGroups.load();
		ModLootTableModifier.modifyLootTables();

		ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.add(ModItems.VODKA);
		});
		ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.NATURAL).register(entries -> {
			entries.add(ModItems.WITHERED_BONE);
		});
		ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.TOOLS).register(entries -> {
			entries.add(ModItems.DRAGON_ELYTRA);
		});
		ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.add(ModBlocks.WHITE_COBBLESTONE);
		});
		ItemGroupEvents.modifyEntriesEvent(net.minecraft.item.ItemGroups.COLORED_BLOCKS).register(entries -> {
			entries.add(ModBlocks.BLUE_WOOD_PLANKS);
		});
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "copper_flame"), COPPER_FLAME);
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "ender_flame"), ENDER_FLAME);

		FabricDefaultAttributeRegistry.register(ModEntities.NAUTILUS, NautilusEntity.createNautilusAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.GNOME, GnomeEntity.createGnomeAttributes());
		//FabricDefaultAttributeRegistry.register(ModEntities.NAUTILUS, NautilusEntity.createMobAttributes());

	}

	public static Identifier id(String path)
	{
		return Identifier.of(MOD_ID, path);
	}
}