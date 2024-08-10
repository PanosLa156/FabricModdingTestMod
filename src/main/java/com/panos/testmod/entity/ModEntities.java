package com.panos.testmod.entity;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.client.PlayingCardRenderer;
import com.panos.testmod.entity.custom.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModEntities {
    public static final EntityType<SmallExpBottleEntity> SMALL_EXP_BOTTLE = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("small_exp_bottle"),
            EntityType.Builder.<SmallExpBottleEntity>create(SmallExpBottleEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());
    public static final EntityType<MediumExpBottleEntity> MEDIUM_EXP_BOTTLE = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("medium_exp_bottle"),
            EntityType.Builder.<MediumExpBottleEntity>create(MediumExpBottleEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());
    public static final EntityType<LargeExpBottleEntity> LARGE_EXP_BOTTLE = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("large_exp_bottle"),
            EntityType.Builder.<LargeExpBottleEntity>create(LargeExpBottleEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());
    public static final EntityType<GrandExpBottleEntity> GRAND_EXP_BOTTLE = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("grand_exp_bottle"),
            EntityType.Builder.<GrandExpBottleEntity>create(GrandExpBottleEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());

    public static final EntityType<PlayingCardEntity> PLAYING_CARD = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("playing_card"),
            EntityType.Builder.<PlayingCardEntity>create(PlayingCardEntity::new, SpawnGroup.MISC)
                    .dimensions(0.1f, 0.1f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());

    public static final EntityType<NautilusEntity> NAUTILUS = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("nautilus"),
            EntityType.Builder.create(NautilusEntity::new, SpawnGroup.WATER_CREATURE)
                    .dimensions(0.75f, 0.5f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());

    public static final EntityType<GnomeEntity> GNOME = Registry.register(
            Registries.ENTITY_TYPE,
            PanosTestMod.id("gnome"),
            EntityType.Builder.<GnomeEntity>create(GnomeEntity::new, SpawnGroup.AMBIENT)
                    .dimensions(1f, 1f)
                    .maxTrackingRange(4).trackingTickInterval(10)
                    .build());

    public static void load() {}
}
