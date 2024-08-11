package com.panos.testmod.entity.custom;

import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.item.ModItems;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.Potions;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

public class LargeExpBottleEntity extends ThrownItemEntity {

    public LargeExpBottleEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);

    }

    public LargeExpBottleEntity(World world, LivingEntity owner) {
        super(ModEntities.LARGE_EXP_BOTTLE, owner, world); // null will be changed later
    }

    public LargeExpBottleEntity(World world, double x, double y, double z) {
        super(ModEntities.LARGE_EXP_BOTTLE, x, y, z, world); // null will be changed later
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.LARGE_EXP_BOTTLE; // We will configure this later, once we have created the ProjectileItem.
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (this.getWorld() instanceof ServerWorld) {
            this.getWorld().syncWorldEvent(WorldEvents.SPLASH_POTION_SPLASHED, this.getBlockPos(), PotionContentsComponent.getColor(Potions.WATER));
            int i = 7 + this.getWorld().random.nextInt(5) + this.getWorld().random.nextInt(7);
            ExperienceOrbEntity.spawn((ServerWorld)this.getWorld(), this.getPos(), i);
            this.discard();
        }
    }
}