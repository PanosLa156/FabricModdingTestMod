package com.panos.testmod;

import com.panos.testmod.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PanosTestModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PanosTestModBlockTagProvider::new);
		pack.addProvider(PanosTestModItemTagProvider::new);
		pack.addProvider(PanosTestModLootTableProvider::new);
		pack.addProvider(PanosTestModRecipeProvider::new);
		pack.addProvider(PanosTestModModelProvider::new);
	}
}
