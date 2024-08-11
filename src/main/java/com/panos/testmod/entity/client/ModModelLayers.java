package com.panos.testmod.entity.client;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.custom.NautilusEntity;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class ModModelLayers {
    public static final EntityModelLayer NAUTILUS =
            new EntityModelLayer(PanosTestMod.id("nautilus"), "main");

    public static final EntityModelLayer GNOME =
            new EntityModelLayer(PanosTestMod.id("gnome"), "main");

    public static final EntityModelLayer PLAYING_CARD =
            new EntityModelLayer(PanosTestMod.id("playing_card"), "main");

    public static final EntityModelLayer GUARD_GOLEM =
            new EntityModelLayer(PanosTestMod.id("guard_golem"), "main");
}
