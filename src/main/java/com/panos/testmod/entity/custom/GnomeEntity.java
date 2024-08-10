package com.panos.testmod.entity.custom;

import com.panos.testmod.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Arm;
import net.minecraft.village.VillagerType;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GnomeEntity extends VillagerEntity {


    public GnomeEntity(EntityType<? extends VillagerEntity> entityType, World world) {
        super(entityType, world);
    }

    public GnomeEntity(EntityType<? extends VillagerEntity> entityType, World world, VillagerType type) {
        super(entityType, world, type);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new TemptGoal(this, 1.25D, Ingredient.ofItems(ModItems.RUBY),false));
        this.goalSelector.add(2, new WanderAroundGoal(this, 1D));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
    }

    public static DefaultAttributeContainer.Builder createGnomeAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20f)
                .add(EntityAttributes.GENERIC_WATER_MOVEMENT_EFFICIENCY , 1f)
                .add(EntityAttributes.GENERIC_ARMOR , 1f)
                .add(EntityAttributes.GENERIC_GRAVITY, 0.5f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1f);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.BLOCK_DECORATED_POT_HIT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_DECORATED_POT_BREAK;
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return null;
    }

    @Override
    public ItemStack getEquippedStack(EquipmentSlot slot) {
        return null;
    }

    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {

    }

    @Override
    public Arm getMainArm() {
        return null;
    }


    /*@Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }*/
}
