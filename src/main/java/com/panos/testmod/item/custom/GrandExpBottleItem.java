package com.panos.testmod.item.custom;

import com.panos.testmod.entity.custom.GrandExpBottleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class GrandExpBottleItem extends Item implements ProjectileItem{


    public GrandExpBottleItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(
                null,
                user.getX(),
                user.getY(),
                user.getZ(),
                SoundEvents.ENTITY_EXPERIENCE_BOTTLE_THROW,
                SoundCategory.NEUTRAL,
                0.5F,
                0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
        );
        if (!world.isClient) {
            GrandExpBottleEntity GrandExpBottleEntity = new GrandExpBottleEntity(world, user);
            GrandExpBottleEntity.setItem(itemStack);
            GrandExpBottleEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0F, 0.2F, 1.0F);
            world.spawnEntity(GrandExpBottleEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        GrandExpBottleEntity GrandExpBottleEntity = new GrandExpBottleEntity(world, pos.getX(), pos.getY(), pos.getZ());
        GrandExpBottleEntity.setItem(stack);
        return GrandExpBottleEntity;
    }

    @Override
    public ProjectileItem.Settings getProjectileSettings() {
        return ProjectileItem.Settings.builder()
                .uncertainty(ProjectileItem.Settings.DEFAULT.uncertainty() * 0.5F)
                .power(ProjectileItem.Settings.DEFAULT.power() * 1.25F)
                .build();
    }
}
