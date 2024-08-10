/*package com.panos.testmod.entity.custom;

import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class PlayingCardEntity extends ThrownItemEntity {
    public PlayingCardEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public PlayingCardEntity(EntityType<? extends ThrownItemEntity> entityType, double d, double e, double f, World world) {
        super(entityType, d, e, f, world);
    }

    public PlayingCardEntity(EntityType<? extends ThrownItemEntity> entityType, LivingEntity livingEntity, World world) {
        super(entityType, livingEntity, world);
    }

    public PlayingCardEntity(World world, LivingEntity owner) {
        super(ModEntities.PLAYING_CARD, owner, world); // null will be changed later
    }

    public PlayingCardEntity(World world, double x, double y, double z) {
        super(ModEntities.PLAYING_CARD, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.PLAYING_CARD;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 3 : 0;
    }
}*/

package com.panos.testmod.entity.custom;

import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PlayingCardEntity extends PersistentProjectileEntity {


    protected PlayingCardEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    protected PlayingCardEntity(EntityType<? extends PersistentProjectileEntity> type, double x, double y, double z, World world, ItemStack stack, @Nullable ItemStack weapon) {
        super(type, x, y, z, world, stack, weapon);
    }

    protected PlayingCardEntity(EntityType<? extends PersistentProjectileEntity> type, LivingEntity owner, World world, ItemStack stack, @Nullable ItemStack shotFrom) {
        super(type, owner, world, stack, shotFrom);
    }

    public PlayingCardEntity(World world, double x, double y, double z, ItemStack stack) {
        super(EntityType.TRIDENT, x, y, z, world, stack, stack);
    }

    public PlayingCardEntity(World world, LivingEntity owner, ItemStack stack) {
        super(EntityType.TRIDENT, owner, world, stack, null);
    }

    @Override
    public ItemStack getDefaultItemStack() {
        return ModItems.PLAYING_CARD.getDefaultStack();
    }

}