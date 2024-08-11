package com.panos.testmod.entity.custom;

import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PlayingCardEntity<T extends FlyingItemEntity> extends PersistentProjectileEntity {


    public PlayingCardEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    protected PlayingCardEntity(EntityType<? extends PersistentProjectileEntity> type, double x, double y, double z, World world, ItemStack stack, @Nullable ItemStack weapon) {
        super(type, x, y, z, world, stack, weapon);
    }

    protected PlayingCardEntity(EntityType<? extends PersistentProjectileEntity> type, LivingEntity owner, World world, ItemStack stack, @Nullable ItemStack shotFrom) {
        super(type, owner, world, stack, shotFrom);
    }

    public PlayingCardEntity(World world, double x, double y, double z, ItemStack stack) {
        super(ModEntities.PLAYING_CARD, x, y, z, world, stack, stack);
    }

    public PlayingCardEntity(World world, LivingEntity owner, ItemStack stack) {
        super(ModEntities.PLAYING_CARD, owner, world, stack, null);
    }


    @Override
    public ItemStack getDefaultItemStack() {
        return ModItems.PLAYING_CARD.getDefaultStack();
    }



}