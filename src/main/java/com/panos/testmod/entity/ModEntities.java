package com.panos.testmod.entity;

import com.panos.testmod.PanosTestMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import  com.panos.testmod.entity.custom.SmallExpBottleEntity;
import  com.panos.testmod.entity.custom.NautilusEntity;

public class ModEntities {
    public static final EntityType<SmallExpBottleEntity> SMALL_EXP_BOTTLE = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("small_exp_bottle"),
            EntityType.Builder.<SmallExpBottleEntity>create(SmallExpBottleEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());

    public static final EntityType<NautilusEntity> NAUTILUS = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("nautilus"),
            EntityType.Builder.create(NautilusEntity::new, SpawnGroup.WATER_CREATURE)
                    .dimensions(0.75f, 0.5f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());

    public static void load() {}
}
