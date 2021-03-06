package com.farcr.swampexpansion.core.other;

import java.util.Arrays;
import java.util.List;

import com.farcr.swampexpansion.core.registry.SwampExBlocks;
import com.farcr.swampexpansion.core.registry.SwampExItems;
import com.teamabnormals.abnormals_core.core.utils.DataUtils;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.fml.RegistryObject;

public class SwampExData {
	public static void registerBlockData() {
		DataUtils.registerCompostable(0.30F,SwampExBlocks.WILLOW_LEAVES.get());
		DataUtils.registerCompostable(0.30F,SwampExBlocks.WILLOW_SAPLING.get());
		DataUtils.registerCompostable(0.30F,SwampExBlocks.WILLOW_LEAF_CARPET.get());
		
		DataUtils.registerCompostable(0.65F,SwampExBlocks.DUCKWEED.get());
		DataUtils.registerCompostable(0.30F,SwampExBlocks.CATTAIL.get());
		DataUtils.registerCompostable(0.65F,SwampExBlocks.TALL_CATTAIL.get());
		
		DataUtils.registerCompostable(0.30F,SwampExItems.RICE.get());
		DataUtils.registerCompostable(0.30F,SwampExItems.CATTAIL_SEEDS.get());
		
		DataUtils.registerCompostable(0.65F,SwampExBlocks.CATTAIL_THATCH.get());
		DataUtils.registerCompostable(0.65F,SwampExBlocks.CATTAIL_THATCH_SLAB.get());
		DataUtils.registerCompostable(0.65F,SwampExBlocks.CATTAIL_THATCH_STAIRS.get());
		DataUtils.registerCompostable(0.65F,SwampExBlocks.CATTAIL_THATCH_VERTICAL_SLAB.get());
		
		DataUtils.registerCompostable(0.85F,SwampExBlocks.DUCKWEED_THATCH.get());
		DataUtils.registerCompostable(0.85F,SwampExBlocks.DUCKWEED_THATCH_SLAB.get());
		DataUtils.registerCompostable(0.85F,SwampExBlocks.DUCKWEED_THATCH_STAIRS.get());
		DataUtils.registerCompostable(0.85F,SwampExBlocks.DUCKWEED_THATCH_VERTICAL_SLAB.get());
		
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_LEAVES.get(), 30, 60);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SwampExBlocks.STRIPPED_WILLOW_LOG.get(), 5, 5);
		DataUtils.registerFlammable(SwampExBlocks.STRIPPED_WILLOW_WOOD.get(), 5, 5);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_STAIRS.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_FENCE.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_FENCE_GATE.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.VERTICAL_WILLOW_PLANKS.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_LEAF_CARPET.get(), 30, 60);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_VERTICAL_SLAB.get(), 5, 20);
		DataUtils.registerFlammable(SwampExBlocks.WILLOW_BOOKSHELF.get(), 5, 20);
		
	}
	
	public static void setRenderLayers()
	{
		RenderTypeLookup.setRenderLayer(SwampExBlocks.WILLOW_DOOR.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.WILLOW_TRAPDOOR.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.WILLOW_LADDER.get(),RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(SwampExBlocks.WILLOW_LEAVES.get(),RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.HANGING_WILLOW_LEAVES.get(),RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.WILLOW_LEAF_CARPET.get(),RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.WILLOW_SAPLING.get(),RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(SwampExBlocks.CATTAIL_SPROUTS.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.CATTAIL.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.TALL_CATTAIL.get(),RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(SwampExBlocks.CATTAIL_THATCH.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.CATTAIL_THATCH_SLAB.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.CATTAIL_THATCH_STAIRS.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.CATTAIL_THATCH_VERTICAL_SLAB.get(),RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(SwampExBlocks.DUCKWEED_THATCH.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.DUCKWEED_THATCH_SLAB.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.DUCKWEED_THATCH_STAIRS.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.DUCKWEED_THATCH_VERTICAL_SLAB.get(),RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(SwampExBlocks.RICE.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.TALL_RICE.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.DUCKWEED.get(),RenderType.getCutout());

		RenderTypeLookup.setRenderLayer(SwampExBlocks.POTTED_CATTAIL.get(),RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(SwampExBlocks.POTTED_WILLOW_SAPLING.get(),RenderType.getCutout());
	}
	
	public static void registerBlockColors() {
        BlockColors blockColors = Minecraft.getInstance().getBlockColors();
        registerBlockColor(blockColors, (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.get(0.5D, 1.0D), Arrays.asList(SwampExBlocks.WILLOW_LEAVES));
        registerBlockColor(blockColors, (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.get(0.5D, 1.0D), Arrays.asList(SwampExBlocks.WILLOW_LEAF_CARPET));
        registerBlockColor(blockColors, (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.get(0.5D, 1.0D), Arrays.asList(SwampExBlocks.HANGING_WILLOW_LEAVES));

        ItemColors itemColors = Minecraft.getInstance().getItemColors();
        registerBlockItemColor(itemColors, (color, items) -> FoliageColors.get(0.5D, 1.0D), Arrays.asList(SwampExBlocks.WILLOW_LEAVES));
		registerBlockItemColor(itemColors, (color, items) -> FoliageColors.get(0.5D, 1.0D), Arrays.asList(SwampExBlocks.WILLOW_LEAF_CARPET));
		registerBlockItemColor(itemColors, (color, items) -> FoliageColors.get(0.5D, 1.0D), Arrays.asList(SwampExBlocks.HANGING_WILLOW_LEAVES));
    }
	
	private static void registerBlockColor(BlockColors blockColors, IBlockColor color, List<RegistryObject<Block>> blocksIn) {
		List<RegistryObject<Block>> registryObjects = blocksIn;
		registryObjects.removeIf(block -> !block.isPresent());
		if(registryObjects.size() > 0) {
			Block[] blocks = new Block[registryObjects.size()];
			for(int i = 0; i < registryObjects.size(); i++) {
				blocks[i] = registryObjects.get(i).get();
			}
			blockColors.register(color, blocks);
		}
	}
	
	private static void registerBlockItemColor(ItemColors blockColors, IItemColor color, List<RegistryObject<Block>> blocksIn) {
		List<RegistryObject<Block>> registryObjects = blocksIn;
		registryObjects.removeIf(block -> !block.isPresent());
		if(registryObjects.size() > 0) {
			Block[] blocks = new Block[registryObjects.size()];
			for(int i = 0; i < registryObjects.size(); i++) {
				blocks[i] = registryObjects.get(i).get();
			}
			blockColors.register(color, blocks);
		}
	}
}
