/*package net.setrion.koratio.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion;
import net.neoforged.neoforge.registries.DeferredItem;
import net.setrion.koratio.Koratio;
import net.setrion.koratio.registry.KoratioBlocks;
import net.setrion.koratio.registry.KoratioItems;
import net.setrion.koratio.world.item.CandyItem;
import net.setrion.koratio.world.item.ColoredCandyItem;

public class ItemModelGenerator extends ItemModelProvider {

	public ItemModelGenerator(PackOutput output, ExistingFileHelper fileHelper) {
		super(output, Koratio.MOD_ID, fileHelper);
	}
	
	@Override
	protected void registerModels() {
		withExistingParent(BuiltInRegistries.BLOCK.getKey(KoratioBlocks.MINIATURE_FANTASIA_PORTAL.get()).getPath(), Koratio.prefix("block/miniature/fantasia_portal"));
		
		basicItem(KoratioItems.RAW_PANGO.get());
		basicItem(KoratioItems.CRACKED_PANGO.get());
		basicItem(KoratioItems.FLUFFER.get());
		basicItem(KoratioItems.COOKED_FLUFFER.get());
		basicItem(KoratioItems.SPIKED_PORKCHOP.get());
		basicItem(KoratioItems.COOKED_SPIKED_PORKCHOP.get());
		basicItem(KoratioItems.CEINANA.get());
		basicItem(KoratioItems.UPNIP.get());

		for (ColoredCandyItem candy : ColoredCandyItem.candy()) {
			if (candy.getType() == CandyItem.CandyType.CANDY_CANE) {
				coloredCandyCaneItem(candy);
			} else if (candy.getType() == CandyItem.CandyType.LOLLIPOP) {
				coloredLollipopItem(candy);
			} else if (candy.getType() == CandyItem.CandyType.BONBON) {
				coloredBonbonItem(candy);
			}
		}

		basicItem(KoratioItems.VARYNIUM_INGOT.get());

		blockModel(KoratioBlocks.DECRYPTING_TABLE.get());
		blockModel(KoratioBlocks.CANDY_SHAPER.get());
		basic2LayerItem(KoratioItems.SCROLL.getId(), "", "_overlay");
		basicItem(KoratioItems.DECRYPTING_BOOK.get());
		basicItem(KoratioItems.BETTER_DECRYPTING_BOOK.get());
		basicItem(KoratioItems.FANTASTIC_DECRYPTING_BOOK.get());

		basicItem(KoratioItems.CANDY_CANE_CASTING_TEMPLATE.get());
		basicItem(KoratioItems.LOLLIPOP_CASTING_TEMPLATE.get());
		basicItem(KoratioItems.BONBON_CASTING_TEMPLATE.get());

		basicItem(KoratioItems.STICKY_WHITE_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_LIGHT_GRAY_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_GRAY_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_BLACK_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_BROWN_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_RED_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_ORANGE_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_YELLOW_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_LIME_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_GREEN_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_CYAN_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_LIGHT_BLUE_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_BLUE_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_PURPLE_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_MAGENTA_SUGAR_BUCKET.get());
		basicItem(KoratioItems.STICKY_PINK_SUGAR_BUCKET.get());

		bucketDripItem(KoratioItems.MOLTEN_WHITE_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_LIGHT_GRAY_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_GRAY_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_BLACK_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_BROWN_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_RED_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_ORANGE_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_YELLOW_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_LIME_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_GREEN_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_CYAN_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_LIGHT_BLUE_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_BLUE_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_PURPLE_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_MAGENTA_SUGAR_BUCKET);
		bucketDripItem(KoratioItems.MOLTEN_PINK_SUGAR_BUCKET);

		bucketItem(KoratioItems.CHOCOLATE_MILK_BUCKET);
		bucketItem(KoratioItems.BLOOD_BUCKET);

		basicItem(KoratioItems.RAINBOW_GEM.get());
		blockModel(KoratioBlocks.RAINBOW_GEM_BLOCK.get());
		basicItem(KoratioItems.RUBY.get());
		blockModel(KoratioBlocks.RUBY_BLOCK.get());
		blockModel(KoratioBlocks.RUBY_ORE.get());
		blockModel(KoratioBlocks.DEEPSLATE_RUBY_ORE.get());
		basicItem(KoratioItems.SAPPHIRE.get());
		blockModel(KoratioBlocks.SAPPHIRE_BLOCK.get());
		blockModel(KoratioBlocks.SAPPHIRE_ORE.get());
		blockModel(KoratioBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
		basicItem(KoratioItems.TOPAZ.get());
		blockModel(KoratioBlocks.TOPAZ_BLOCK.get());
		blockModel(KoratioBlocks.TOPAZ_ORE.get());
		blockModel(KoratioBlocks.DEEPSLATE_TOPAZ_ORE.get());
		basicItem(KoratioItems.ONYX.get());
		blockModel(KoratioBlocks.ONYX_BLOCK.get());
		blockModel(KoratioBlocks.ONYX_ORE.get());
		blockModel(KoratioBlocks.DEEPSLATE_ONYX_ORE.get());
		blockModel(KoratioBlocks.COOKIE_ORE.get());
		blockModel(KoratioBlocks.DEEPSLATE_COOKIE_ORE.get());
		basicItem(KoratioItems.WITHER_BONE.get());

		blockModel(KoratioBlocks.SKELETON_REMAINS.get());
		blockModel(KoratioBlocks.WITHER_SKELETON_REMAINS.get());
		blockModel(KoratioBlocks.STRAY_REMAINS.get());
		blockModel(KoratioBlocks.BOGGED_REMAINS.get());
		blockModel(KoratioBlocks.DEMONIC_SKELETON_REMAINS.get());
		blockModel(KoratioBlocks.ZOMBIE_REMAINS.get());
		blockModel(KoratioBlocks.HUSK_REMAINS.get());
		blockModel(KoratioBlocks.DROWNED_REMAINS.get());
		blockModel(KoratioBlocks.DEMONIC_ZOMBIE_REMAINS.get());
		blockModel(KoratioBlocks.ZOMBIE_VILLAGER_REMAINS.get());
		blockModel(KoratioBlocks.PHANTOM_REMAINS.get());
		blockModel(KoratioBlocks.ZOMBIFIED_PIGLIN_REMAINS.get());

		basicItem(KoratioItems.LIGHT_GRAY_SUGAR.get());
		basicItem(KoratioItems.GRAY_SUGAR.get());
		basicItem(KoratioItems.BLACK_SUGAR.get());
		basicItem(KoratioItems.BROWN_SUGAR.get());
		basicItem(KoratioItems.RED_SUGAR.get());
		basicItem(KoratioItems.ORANGE_SUGAR.get());
		basicItem(KoratioItems.YELLOW_SUGAR.get());
		basicItem(KoratioItems.LIME_SUGAR.get());
		basicItem(KoratioItems.GREEN_SUGAR.get());
		basicItem(KoratioItems.CYAN_SUGAR.get());
		basicItem(KoratioItems.LIGHT_BLUE_SUGAR.get());
		basicItem(KoratioItems.BLUE_SUGAR.get());
		basicItem(KoratioItems.PURPLE_SUGAR.get());
		basicItem(KoratioItems.MAGENTA_SUGAR.get());
		basicItem(KoratioItems.PINK_SUGAR.get());

		blockModel(KoratioBlocks.WHITE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.LIGHT_GRAY_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.GRAY_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.BLACK_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.BROWN_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.RED_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.ORANGE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.YELLOW_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.LIME_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.GREEN_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.CYAN_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.LIGHT_BLUE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.BLUE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.PURPLE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.MAGENTA_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.PINK_SUGAR_BLOCK.get());

		blockModel(KoratioBlocks.STICKY_WHITE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_LIGHT_GRAY_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_GRAY_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_BLACK_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_BROWN_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_RED_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_ORANGE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_YELLOW_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_LIME_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_GREEN_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_CYAN_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_LIGHT_BLUE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_BLUE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_PURPLE_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_MAGENTA_SUGAR_BLOCK.get());
		blockModel(KoratioBlocks.STICKY_PINK_SUGAR_BLOCK.get());

		blockModel(KoratioBlocks.WHITE_ICING_BLOCK.get());
		blockModel(KoratioBlocks.LIGHT_GRAY_ICING_BLOCK.get());
		blockModel(KoratioBlocks.GRAY_ICING_BLOCK.get());
		blockModel(KoratioBlocks.BLACK_ICING_BLOCK.get());
		blockModel(KoratioBlocks.BROWN_ICING_BLOCK.get());
		blockModel(KoratioBlocks.RED_ICING_BLOCK.get());
		blockModel(KoratioBlocks.ORANGE_ICING_BLOCK.get());
		blockModel(KoratioBlocks.YELLOW_ICING_BLOCK.get());
		blockModel(KoratioBlocks.LIME_ICING_BLOCK.get());
		blockModel(KoratioBlocks.GREEN_ICING_BLOCK.get());
		blockModel(KoratioBlocks.CYAN_ICING_BLOCK.get());
		blockModel(KoratioBlocks.LIGHT_BLUE_ICING_BLOCK.get());
		blockModel(KoratioBlocks.BLUE_ICING_BLOCK.get());
		blockModel(KoratioBlocks.PURPLE_ICING_BLOCK.get());
		blockModel(KoratioBlocks.MAGENTA_ICING_BLOCK.get());
		blockModel(KoratioBlocks.PINK_ICING_BLOCK.get());

		blockModel(KoratioBlocks.WHITE_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.LIGHT_GRAY_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.GRAY_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.BLACK_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.BROWN_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.RED_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.ORANGE_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.YELLOW_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.LIME_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.GREEN_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.CYAN_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.LIGHT_BLUE_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.BLUE_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.PURPLE_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.MAGENTA_CANDY_BLOCK.get());
		blockModel(KoratioBlocks.PINK_CANDY_BLOCK.get());

		blockModel(KoratioBlocks.WHITE_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.ORANGE_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.MAGENTA_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.LIGHT_BLUE_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.YELLOW_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.LIME_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.PINK_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.GRAY_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.LIGHT_GRAY_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.CYAN_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.PURPLE_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.BLUE_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.BROWN_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.GREEN_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.RED_LEVITATING_WOOL.get());
		blockModel(KoratioBlocks.BLACK_LEVITATING_WOOL.get());

		blockModel(KoratioBlocks.RAW_GINGERBREAD_BLOCK.get());
		blockModel(KoratioBlocks.RAW_GINGERBREAD_STAIRS.get());
		blockModel(KoratioBlocks.RAW_GINGERBREAD_SLAB.get());
		blockModel(KoratioBlocks.GINGERBREAD_BLOCK.get());
		blockModel(KoratioBlocks.GINGERBREAD_STAIRS.get());
		blockModel(KoratioBlocks.GINGERBREAD_SLAB.get());
		blockModel(KoratioBlocks.RAW_GINGERBREAD_BRICKS.get());
		blockModel(KoratioBlocks.RAW_GINGERBREAD_BRICK_STAIRS.get());
		blockModel(KoratioBlocks.RAW_GINGERBREAD_BRICK_SLAB.get());
		blockModel(KoratioBlocks.GINGERBREAD_BRICKS.get());
		blockModel(KoratioBlocks.GINGERBREAD_BRICK_STAIRS.get());
		blockModel(KoratioBlocks.GINGERBREAD_BRICK_SLAB.get());
		blockModel(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICKS.get());
		blockModel(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICK_STAIRS.get());
		blockModel(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICK_SLAB.get());
		blockModel(KoratioBlocks.LARGE_GINGERBREAD_BRICKS.get());
		blockModel(KoratioBlocks.LARGE_GINGERBREAD_BRICK_STAIRS.get());
		blockModel(KoratioBlocks.LARGE_GINGERBREAD_BRICK_SLAB.get());
		blockModel(KoratioBlocks.COOKIE_BLOCK.get());
		blockModel(KoratioBlocks.COOKIE_BLOCK_STAIRS.get());
		blockModel(KoratioBlocks.COOKIE_BLOCK_SLAB.get());
		withExistingParent(KoratioBlocks.COOKIE_BLOCK_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/cookie_block"));
		blockModel(KoratioBlocks.COOKIE_BLOCK_PRESSURE_PLATE.get());
		blockModel(KoratioBlocks.MARSHMALLOW_BLOCK.get());

		blockModel(KoratioBlocks.ANCIENT_COBBLESTONE.get());
		blockModel(KoratioBlocks.ANCIENT_COBBLESTONE_STAIRS.get());
		blockModel(KoratioBlocks.ANCIENT_COBBLESTONE_SLAB.get());
		blockModel(KoratioBlocks.ANCIENT_STONE.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_STAIRS.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_SLAB.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_BRICKS.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_BRICK_SLAB.get());
		blockModel(KoratioBlocks.CRACKED_ANCIENT_STONE_BRICKS.get());
		blockModel(KoratioBlocks.CHISELED_ANCIENT_STONE_BRICKS.get());
		blockModel(KoratioBlocks.POLISHED_ANCIENT_STONE.get());
		blockModel(KoratioBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
		blockModel(KoratioBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_TILES.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_TILE_STAIRS.get());
		blockModel(KoratioBlocks.ANCIENT_STONE_TILE_SLAB.get());

		basicTool(KoratioItems.WOODEN_ICING_SPATULA);
		basicTool(KoratioItems.STONE_ICING_SPATULA);
		basicTool(KoratioItems.GOLDEN_ICING_SPATULA);
		basicTool(KoratioItems.IRON_ICING_SPATULA);
		basicTool(KoratioItems.DIAMOND_ICING_SPATULA);
		basicTool(KoratioItems.NETHERITE_ICING_SPATULA);

		basicTool(KoratioItems.WITHER_BONE_SWORD);
		basicTool(KoratioItems.WITHER_BONE_AXE);
		basicTool(KoratioItems.WITHER_BONE_SHOVEL);
		basicTool(KoratioItems.WITHER_BONE_PICKAXE);
		basicTool(KoratioItems.WITHER_BONE_HOE);
		basicTool(KoratioItems.WITHER_BONE_ICING_SPATULA);
		basicTool(KoratioItems.BONE_SWORD);
		basicTool(KoratioItems.BONE_AXE);
		basicTool(KoratioItems.BONE_SHOVEL);
		basicTool(KoratioItems.BONE_PICKAXE);
		basicTool(KoratioItems.BONE_HOE);
		basicTool(KoratioItems.BONE_ICING_SPATULA);

		basicItem(KoratioItems.WITHER_BONE_HELMET.get());
		basicItem(KoratioItems.WITHER_BONE_CHESTPLATE.get());
		basicItem(KoratioItems.WITHER_BONE_LEGGINGS.get());
		basicItem(KoratioItems.WITHER_BONE_BOOTS.get());
		basicItem(KoratioItems.BONE_HELMET.get());
		basicItem(KoratioItems.BONE_CHESTPLATE.get());
		basicItem(KoratioItems.BONE_LEGGINGS.get());
		basicItem(KoratioItems.BONE_BOOTS.get());

		basicItem(KoratioBlocks.RAINBOW_ROSE.asItem());
		basicItem(KoratioBlocks.RAINBOW_ALLIUM.asItem());
		basicItem(KoratioBlocks.RAINBOW_LILY_OF_THE_VALLEY.asItem());
		plantItem(KoratioBlocks.COOKIE_FLOWER.asItem());
		plantItem(KoratioBlocks.GOLDEN_TULIP.asItem());
		plantItem(KoratioBlocks.GOLD_ROSE_BUSH.asItem(), "_top");
		sugarglassFlowerItem(KoratioBlocks.WHITE_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.LIGHT_GRAY_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.GRAY_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.BLACK_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.BROWN_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.RED_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.ORANGE_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.YELLOW_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.LIME_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.GREEN_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.CYAN_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.LIGHT_BLUE_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.BLUE_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.PURPLE_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.MAGENTA_SUGARGLASS_FLOWER.getId());
		sugarglassFlowerItem(KoratioBlocks.PINK_SUGARGLASS_FLOWER.getId());

		plantItem(KoratioBlocks.OAK_LEAF_PANE.asItem(), Blocks.OAK_LEAVES.asItem());
		plantItem(KoratioBlocks.SPRUCE_LEAF_PANE.asItem(), Blocks.SPRUCE_LEAVES.asItem());
		plantItem(KoratioBlocks.BIRCH_LEAF_PANE.asItem(), Blocks.BIRCH_LEAVES.asItem());
		plantItem(KoratioBlocks.JUNGLE_LEAF_PANE.asItem(), Blocks.JUNGLE_LEAVES.asItem());
		plantItem(KoratioBlocks.ACACIA_LEAF_PANE.asItem(), Blocks.ACACIA_LEAVES.asItem());
		plantItem(KoratioBlocks.DARK_OAK_LEAF_PANE.asItem(), Blocks.DARK_OAK_LEAVES.asItem());
		plantItem(KoratioBlocks.MANGROVE_LEAF_PANE.asItem(), Blocks.MANGROVE_LEAVES.asItem());
		plantItem(KoratioBlocks.AZALEA_LEAF_PANE.asItem(), Blocks.AZALEA_LEAVES.asItem());
		plantItem(KoratioBlocks.FLOWERING_AZALEA_LEAF_PANE.asItem(), Blocks.FLOWERING_AZALEA_LEAVES.asItem());
		plantItem(KoratioBlocks.CHERRY_LEAF_PANE.asItem(), Blocks.CHERRY_LEAVES.asItem());
		plantItem(KoratioBlocks.PALE_OAK_LEAF_PANE.asItem(), Blocks.PALE_OAK_LEAVES.asItem());

		tallDoorItem(KoratioBlocks.TALL_OAK_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.OAK_DOOR));
		tallDoorItem(KoratioBlocks.TALL_SPRUCE_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.SPRUCE_DOOR));
		tallDoorItem(KoratioBlocks.TALL_BIRCH_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.BIRCH_DOOR));
		tallDoorItem(KoratioBlocks.TALL_JUNGLE_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.JUNGLE_DOOR));
		tallDoorItem(KoratioBlocks.TALL_ACACIA_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.ACACIA_DOOR));
		tallDoorItem(KoratioBlocks.TALL_DARK_OAK_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.DARK_OAK_DOOR));
		tallDoorItem(KoratioBlocks.TALL_MANGROVE_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.MANGROVE_DOOR));
		tallDoorItem(KoratioBlocks.TALL_CHERRY_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.CHERRY_DOOR));
		tallDoorItem(KoratioBlocks.TALL_PALE_OAK_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.PALE_OAK_DOOR));
		tallDoorItem(KoratioBlocks.TALL_BAMBOO_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.BAMBOO_DOOR));
		tallDoorItem(KoratioBlocks.TALL_CRIMSON_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.CRIMSON_DOOR));
		tallDoorItem(KoratioBlocks.TALL_WARPED_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.WARPED_DOOR));
		tallDoorItem(KoratioBlocks.TALL_IRON_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.IRON_DOOR));
		tallDoorItem(KoratioBlocks.TALL_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_EXPOSED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.EXPOSED_COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_OXIDIZED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.OXIDIZED_COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_WEATHERED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.WEATHERED_COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_WAXED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_WAXED_EXPOSED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.EXPOSED_COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_WAXED_OXIDIZED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.OXIDIZED_COPPER_DOOR));
		tallDoorItem(KoratioBlocks.TALL_WAXED_WEATHERED_COPPER_DOOR.getId(), BuiltInRegistries.ITEM.getKey(Items.WEATHERED_COPPER_DOOR));

		blockModel(KoratioBlocks.FLIPPED_FARMLAND.get());

		blockModel(KoratioBlocks.PANGO_PLANKS.get());
		blockModel(KoratioBlocks.PANGO_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_PANGO_LOG.get());
		blockModel(KoratioBlocks.PANGO_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_PANGO_WOOD.get());
		blockModel(KoratioBlocks.PANGO_LEAVES.get());
		plantItem(KoratioBlocks.PANGO_LEAF_PANE.asItem(), KoratioBlocks.PANGO_LEAVES.asItem());
		blockModel(KoratioBlocks.PANGO_SLAB.get());
		blockModel(KoratioBlocks.PANGO_STAIRS.get());
		plantItem(KoratioBlocks.PANGO_SAPLING.asItem());
		withExistingParent(KoratioBlocks.PANGO_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/pango_planks"));
		signItem(KoratioItems.PANGO_SIGN.get());
		signItem(KoratioItems.PANGO_HANGING_SIGN.get());
		withExistingParent(KoratioBlocks.PANGO_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/pango_planks"));
		blockModel(KoratioBlocks.PANGO_PRESSURE_PLATE.get());
		doorItem(KoratioBlocks.PANGO_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_PANGO_DOOR.getId(), KoratioBlocks.PANGO_DOOR.getId());
		blockModel(KoratioBlocks.PANGO_TRAPDOOR.get(), "pango_trapdoor_bottom");
		blockModel(KoratioBlocks.PANGO_FENCE_GATE.get());
		blockModel(KoratioBlocks.PANGO_BOOKSHELF.get());
		withExistingParent(KoratioBlocks.PANGO_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_PANGO_CHEST.getId().toString(), "item/chest");
		
		basicItem(KoratioItems.PANGO_BOAT.get());
		basicItem(KoratioItems.PANGO_CHEST_BOAT.get());
		
		blockModel(KoratioBlocks.RUGONA_PLANKS.get());
		blockModel(KoratioBlocks.RUGONA_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_RUGONA_LOG.get());
		blockModel(KoratioBlocks.RUGONA_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_RUGONA_WOOD.get());
		blockModel(KoratioBlocks.RUGONA_LEAVES.get());
		plantItem(KoratioBlocks.RUGONA_LEAF_PANE.asItem(), KoratioBlocks.RUGONA_LEAVES.asItem());
		blockModel(KoratioBlocks.RUGONA_SLAB.get());
		blockModel(KoratioBlocks.RUGONA_STAIRS.get());
		plantItem(KoratioBlocks.RUGONA_SAPLING.asItem());
		withExistingParent(KoratioBlocks.RUGONA_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/rugona_planks"));
		signItem(KoratioItems.RUGONA_SIGN.get());
		signItem(KoratioItems.RUGONA_HANGING_SIGN.get());
		withExistingParent(KoratioBlocks.RUGONA_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/rugona_planks"));
		blockModel(KoratioBlocks.RUGONA_PRESSURE_PLATE.get());
		doorItem(KoratioBlocks.RUGONA_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_RUGONA_DOOR.getId(), KoratioBlocks.RUGONA_DOOR.getId());
		blockModel(KoratioBlocks.RUGONA_TRAPDOOR.get(), "rugona_trapdoor_bottom");
		blockModel(KoratioBlocks.RUGONA_FENCE_GATE.get());
		blockModel(KoratioBlocks.RUGONA_BOOKSHELF.get());
		withExistingParent(KoratioBlocks.RUGONA_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_RUGONA_CHEST.getId().toString(), "item/chest");
		
		basicItem(KoratioItems.RUGONA_BOAT.get());
		basicItem(KoratioItems.RUGONA_CHEST_BOAT.get());
		
		blockModel(KoratioBlocks.VARESO_PLANKS.get());
		blockModel(KoratioBlocks.VARESO_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_VARESO_LOG.get());
		blockModel(KoratioBlocks.VARESO_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_VARESO_WOOD.get());
		blockModel(KoratioBlocks.VARESO_LEAVES.get());
		plantItem(KoratioBlocks.VARESO_LEAF_PANE.asItem(), KoratioBlocks.VARESO_LEAVES.asItem());
		blockModel(KoratioBlocks.VARESO_SLAB.get());
		blockModel(KoratioBlocks.VARESO_STAIRS.get());
		plantItem(KoratioBlocks.VARESO_SAPLING.asItem());
		withExistingParent(KoratioBlocks.VARESO_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/vareso_planks"));
		signItem(KoratioItems.VARESO_SIGN.get());
		signItem(KoratioItems.VARESO_HANGING_SIGN.get());
		withExistingParent(KoratioBlocks.VARESO_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/vareso_planks"));
		blockModel(KoratioBlocks.VARESO_PRESSURE_PLATE.get());
		doorItem(KoratioBlocks.VARESO_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_VARESO_DOOR.getId(), KoratioBlocks.VARESO_DOOR.getId());
		blockModel(KoratioBlocks.VARESO_TRAPDOOR.get(), "vareso_trapdoor_bottom");
		blockModel(KoratioBlocks.VARESO_FENCE_GATE.get());
		blockModel(KoratioBlocks.VARESO_BOOKSHELF.get());
		withExistingParent(KoratioBlocks.VARESO_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_VARESO_CHEST.getId().toString(), "item/chest");
		
		basicItem(KoratioItems.VARESO_BOAT.get());
		basicItem(KoratioItems.VARESO_CHEST_BOAT.get());

		blockModel(KoratioBlocks.CANDY_PLANKS.get());
		blockModel(KoratioBlocks.CANDY_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_CANDY_LOG.get());
		blockModel(KoratioBlocks.CANDY_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_CANDY_WOOD.get());
		blockModel(KoratioBlocks.PINK_COTTON_CANDY_LEAVES.get());
		blockModel(KoratioBlocks.LIGHT_BLUE_COTTON_CANDY_LEAVES.get());
		blockModel(KoratioBlocks.LIME_COTTON_CANDY_LEAVES.get());
		blockModel(KoratioBlocks.YELLOW_COTTON_CANDY_LEAVES.get());
		plantItem(KoratioBlocks.PINK_COTTON_CANDY_LEAF_PANE.asItem(), KoratioBlocks.PINK_COTTON_CANDY_LEAVES.asItem());
		plantItem(KoratioBlocks.LIGHT_BLUE_COTTON_CANDY_LEAF_PANE.asItem(), KoratioBlocks.LIGHT_BLUE_COTTON_CANDY_LEAVES.asItem());
		plantItem(KoratioBlocks.LIME_COTTON_CANDY_LEAF_PANE.asItem(), KoratioBlocks.LIME_COTTON_CANDY_LEAVES.asItem());
		plantItem(KoratioBlocks.YELLOW_COTTON_CANDY_LEAF_PANE.asItem(), KoratioBlocks.YELLOW_COTTON_CANDY_LEAVES.asItem());
		blockModel(KoratioBlocks.CANDY_SLAB.get());
		blockModel(KoratioBlocks.CANDY_STAIRS.get());
		plantItem(KoratioBlocks.CANDY_SAPLING.asItem());
		withExistingParent(KoratioBlocks.CANDY_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/candy_planks"));
		signItem(KoratioItems.CANDY_SIGN.get());
		signItem(KoratioItems.CANDY_HANGING_SIGN.get());
		withExistingParent(KoratioBlocks.CANDY_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/candy_planks"));
		blockModel(KoratioBlocks.CANDY_PRESSURE_PLATE.get());
		doorItem(KoratioBlocks.CANDY_DOOR.asItem());
		//tallDoorItem(KoratioItems.TALL_CANDY_DOOR.getId(), KoratioItems.CANDY_DOOR.getId());
		blockModel(KoratioBlocks.CANDY_TRAPDOOR.get(), "candy_trapdoor_bottom");
		blockModel(KoratioBlocks.CANDY_FENCE_GATE.get());
		blockModel(KoratioBlocks.CANDY_BOOKSHELF.get());
		withExistingParent(KoratioBlocks.CANDY_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_CANDY_CHEST.getId().toString(), "item/chest");

		basicItem(KoratioItems.CANDY_BOAT.get());
		basicItem(KoratioItems.CANDY_CHEST_BOAT.get());

		blockModel(KoratioBlocks.CHOCOLATE_OAK_PLANKS.get());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_CHOCOLATE_OAK_LOG.get());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_CHOCOLATE_OAK_WOOD.get());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_LEAVES.get());
		plantItem(KoratioBlocks.CHOCOLATE_OAK_LEAF_PANE.asItem(), KoratioBlocks.CHOCOLATE_OAK_LEAVES.asItem());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_SLAB.get());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_STAIRS.get());
		plantItem(KoratioBlocks.CHOCOLATE_OAK_SAPLING.asItem());
		withExistingParent(KoratioBlocks.CHOCOLATE_OAK_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/chocolate_oak_planks"));
		signItem(KoratioItems.CHOCOLATE_OAK_SIGN.get());
		signItem(KoratioItems.CHOCOLATE_OAK_HANGING_SIGN.get());
		withExistingParent(KoratioBlocks.CHOCOLATE_OAK_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/chocolate_oak_planks"));
		blockModel(KoratioBlocks.CHOCOLATE_OAK_PRESSURE_PLATE.get());
		doorItem(KoratioBlocks.CHOCOLATE_OAK_DOOR.asItem());
		//tallDoorItem(KoratioItems.TALL_CHOCOLATE_OAK_DOOR.getId(), KoratioItems.CHOCOLATE_OAK_DOOR.getId());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_TRAPDOOR.get(), "chocolate_oak_trapdoor_bottom");
		blockModel(KoratioBlocks.CHOCOLATE_OAK_FENCE_GATE.get());
		blockModel(KoratioBlocks.CHOCOLATE_OAK_BOOKSHELF.get());
		withExistingParent(KoratioBlocks.CHOCOLATE_OAK_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_CHOCOLATE_OAK_CHEST.getId().toString(), "item/chest");

		basicItem(KoratioItems.CHOCOLATE_OAK_BOAT.get());
		basicItem(KoratioItems.CHOCOLATE_OAK_CHEST_BOAT.get());

		blockModel(KoratioBlocks.ELVEN_PLANKS.get());
		blockModel(KoratioBlocks.BLUE_ELVEN_PLANKS.get());
		blockModel(KoratioBlocks.CYAN_ELVEN_PLANKS.get());
		blockModel(KoratioBlocks.GREEN_ELVEN_PLANKS.get());
		blockModel(KoratioBlocks.ELVEN_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_ELVEN_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_BLUE_ELVEN_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_CYAN_ELVEN_LOG.get());
		blockModel(KoratioBlocks.STRIPPED_GREEN_ELVEN_LOG.get());
		blockModel(KoratioBlocks.ELVEN_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_ELVEN_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_BLUE_ELVEN_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_CYAN_ELVEN_WOOD.get());
		blockModel(KoratioBlocks.STRIPPED_GREEN_ELVEN_WOOD.get());
		blockModel(KoratioBlocks.ELVEN_LEAVES.get());
		plantItem(KoratioBlocks.ELVEN_LEAF_PANE.asItem(), KoratioBlocks.ELVEN_LEAVES.asItem());
		blockModel(KoratioBlocks.ELVEN_SLAB.get());
		blockModel(KoratioBlocks.BLUE_ELVEN_SLAB.get());
		blockModel(KoratioBlocks.CYAN_ELVEN_SLAB.get());
		blockModel(KoratioBlocks.GREEN_ELVEN_SLAB.get());
		blockModel(KoratioBlocks.ELVEN_STAIRS.get());
		blockModel(KoratioBlocks.BLUE_ELVEN_STAIRS.get());
		blockModel(KoratioBlocks.CYAN_ELVEN_STAIRS.get());
		blockModel(KoratioBlocks.GREEN_ELVEN_STAIRS.get());
		plantItem(KoratioBlocks.ELVEN_SAPLING.asItem());
		withExistingParent(KoratioBlocks.ELVEN_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/elven_planks"));
		withExistingParent(KoratioBlocks.BLUE_ELVEN_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/blue_elven_planks"));
		withExistingParent(KoratioBlocks.CYAN_ELVEN_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/cyan_elven_planks"));
		withExistingParent(KoratioBlocks.GREEN_ELVEN_FENCE.getId().getPath(), "block/fence_inventory").texture("texture", Koratio.prefix("block/green_elven_planks"));
		signItem(KoratioItems.ELVEN_SIGN.get());
		signItem(KoratioItems.BLUE_ELVEN_SIGN.get());
		signItem(KoratioItems.CYAN_ELVEN_SIGN.get());
		signItem(KoratioItems.GREEN_ELVEN_SIGN.get());
		signItem(KoratioItems.ELVEN_HANGING_SIGN.get());
		signItem(KoratioItems.BLUE_ELVEN_HANGING_SIGN.get());
		signItem(KoratioItems.CYAN_ELVEN_HANGING_SIGN.get());
		signItem(KoratioItems.GREEN_ELVEN_HANGING_SIGN.get());
		withExistingParent(KoratioBlocks.ELVEN_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/elven_planks"));
		withExistingParent(KoratioBlocks.BLUE_ELVEN_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/blue_elven_planks"));
		withExistingParent(KoratioBlocks.CYAN_ELVEN_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/cyan_elven_planks"));
		withExistingParent(KoratioBlocks.GREEN_ELVEN_BUTTON.getId().getPath(), "block/button_inventory").texture("texture", Koratio.prefix("block/green_elven_planks"));
		blockModel(KoratioBlocks.ELVEN_PRESSURE_PLATE.get());
		blockModel(KoratioBlocks.BLUE_ELVEN_PRESSURE_PLATE.get());
		blockModel(KoratioBlocks.CYAN_ELVEN_PRESSURE_PLATE.get());
		blockModel(KoratioBlocks.GREEN_ELVEN_PRESSURE_PLATE.get());
		doorItem(KoratioBlocks.ELVEN_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_ELVEN_DOOR.getId(), KoratioBlocks.ELVEN_DOOR.getId());
		doorItem(KoratioBlocks.BLUE_ELVEN_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_BLUE_ELVEN_DOOR.getId(), KoratioBlocks.BLUE_ELVEN_DOOR.getId());
		doorItem(KoratioBlocks.CYAN_ELVEN_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_CYAN_ELVEN_DOOR.getId(), KoratioBlocks.CYAN_ELVEN_DOOR.getId());
		doorItem(KoratioBlocks.GREEN_ELVEN_DOOR.asItem());
		tallDoorItem(KoratioBlocks.TALL_GREEN_ELVEN_DOOR.getId(), KoratioBlocks.GREEN_ELVEN_DOOR.getId());
		blockModel(KoratioBlocks.ELVEN_TRAPDOOR.get(), "elven_trapdoor_bottom");
		blockModel(KoratioBlocks.BLUE_ELVEN_TRAPDOOR.get(), "blue_elven_trapdoor_bottom");
		blockModel(KoratioBlocks.CYAN_ELVEN_TRAPDOOR.get(), "cyan_elven_trapdoor_bottom");
		blockModel(KoratioBlocks.GREEN_ELVEN_TRAPDOOR.get(), "green_elven_trapdoor_bottom");
		blockModel(KoratioBlocks.ELVEN_FENCE_GATE.get());
		blockModel(KoratioBlocks.BLUE_ELVEN_FENCE_GATE.get());
		blockModel(KoratioBlocks.CYAN_ELVEN_FENCE_GATE.get());
		blockModel(KoratioBlocks.GREEN_ELVEN_FENCE_GATE.get());
		blockModel(KoratioBlocks.ELVEN_BOOKSHELF.get());
		blockModel(KoratioBlocks.BLUE_ELVEN_BOOKSHELF.get());
		blockModel(KoratioBlocks.CYAN_ELVEN_BOOKSHELF.get());
		blockModel(KoratioBlocks.GREEN_ELVEN_BOOKSHELF.get());
		withExistingParent(KoratioBlocks.ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.BLUE_ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_BLUE_ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.CYAN_ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_CYAN_ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.GREEN_ELVEN_CHEST.getId().toString(), "item/chest");
		withExistingParent(KoratioBlocks.TRAPPED_GREEN_ELVEN_CHEST.getId().toString(), "item/chest");

		basicItem(KoratioItems.ELVEN_BOAT.get());
		basicItem(KoratioItems.BLUE_ELVEN_BOAT.get());
		basicItem(KoratioItems.CYAN_ELVEN_BOAT.get());
		basicItem(KoratioItems.GREEN_ELVEN_BOAT.get());
		basicItem(KoratioItems.ELVEN_CHEST_BOAT.get());
		basicItem(KoratioItems.BLUE_ELVEN_CHEST_BOAT.get());
		basicItem(KoratioItems.CYAN_ELVEN_CHEST_BOAT.get());
		basicItem(KoratioItems.GREEN_ELVEN_CHEST_BOAT.get());
		
		plantItem(KoratioBlocks.PURPLE_MUSHROOM.asItem());
		plantItem(KoratioBlocks.GREEN_MUSHROOM.asItem());
		
		plantItem(KoratioBlocks.GILDED_VINES.asItem());
		
		withExistingParent(KoratioBlocks.PURPLE_MUSHROOM_BLOCK.getId().getPath(), "koratio:block/purple_mushroom_block_inventory");
		withExistingParent(KoratioBlocks.GREEN_MUSHROOM_BLOCK.getId().getPath(), "koratio:block/green_mushroom_block_inventory");

		KoratioItems.SPAWN_EGGS.getEntries().forEach((item) -> {
			spawnEggItem(item.get());
		});
	}
	
	private ItemModelBuilder buildItem(String name, String parent, int emissivity, ResourceLocation... layers) {
		ItemModelBuilder builder = withExistingParent(name, parent);
		for (int i = 0; i < layers.length; i++) {
			builder = builder.texture("layer" + i, layers[i]);
		}
		if (emissivity > 0) builder = builder.customLoader(ItemLayerModelBuilder::begin).emissive(emissivity, emissivity, 0).renderType("forge_entity_unsorted_translucent", 0).end();
		return builder;
	}

	private DynamicFluidContainerModelBuilder<?> bucketItem(DeferredItem<BucketItem> bucket) {
		return withExistingParent(bucket.getId().getPath(), ResourceLocation.fromNamespaceAndPath(NeoForgeVersion.MOD_ID, "item/bucket"))
				.customLoader(DynamicFluidContainerModelBuilder::begin)
				.fluid(bucket.get().content);
	}

	private DynamicFluidContainerModelBuilder<?> bucketDripItem(DeferredItem<BucketItem> bucket) {
		return withExistingParent(bucket.getId().getPath(), ResourceLocation.fromNamespaceAndPath(NeoForgeVersion.MOD_ID, "item/bucket_drip"))
				.customLoader(DynamicFluidContainerModelBuilder::begin)
				.fluid(bucket.get().content);
	}
	
	private ItemModelBuilder basicTool(DeferredItem<Item> item) {
		return toolItem(item.getId().getPath(), Koratio.prefix("item/" + item.getId().getPath()));
	}
	
	private ItemModelBuilder toolItem(String name, ResourceLocation... layers) {
		return buildItem(name, "item/handheld", 0, layers);
	}
	
	private void doorItem(Item item) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "item/generated").texture("layer0", getItemPathInFolder(item, "item"));
	}

	private void coloredCandyCaneItem(Item item) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "koratio:item/template_colored_candy_cane");
	}

	private void coloredLollipopItem(Item item) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "koratio:item/template_colored_lollipop");
	}

	private void coloredBonbonItem(Item item) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "koratio:item/template_colored_bonbon");
	}
	
	private void plantItem(Item item) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "item/generated").texture("layer0", getItemPathInFolder(item, "block"));
	}

	private void plantItem(Item item, Item texture) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "item/generated").texture("layer0", getItemPathInFolder(texture, "block"));
	}
	
	private void plantItem(Item item, String name) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "item/generated").texture("layer0", getItemPathInFolder(item, "block", name));
	}
	
	private void signItem(Item item) {
		withExistingParent(BuiltInRegistries.ITEM.getKey(item).getPath(), "item/generated").texture("layer0", getItemPathInFolder(item, "item"));
	}
	
	private void blockModel(Block b) {
		blockModel(b, BuiltInRegistries.BLOCK.getKey(b).getPath());
	}

	private void blockModel(Block b, String model) {
		blockModel(b, Koratio.prefix("block/" + model));
	}

	private void blockModel(Block b, ResourceLocation model) {
		withExistingParent(BuiltInRegistries.BLOCK.getKey(b).getPath(), model);
	}
	
	public void basic2LayerItem(ResourceLocation item, String base, String overlay) {
		getBuilder(item.toString())
				.parent(new ModelFile.UncheckedModelFile("item/generated"))
				.texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath() + base))
				.texture("layer1", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath() + overlay));
	}

	public void sugarglassFlowerItem(ResourceLocation item) {
		getBuilder(item.toString())
				.parent(new ModelFile.UncheckedModelFile("item/generated"))
				.texture("layer0", ResourceLocation.fromNamespaceAndPath(Koratio.MOD_ID, "block/sugarglass_flower_item_base"))
				.texture("layer1", ResourceLocation.fromNamespaceAndPath(Koratio.MOD_ID, "block/sugarglass_flower_item_overlay"))
				.renderType("tripwire");
	}

	public void tallDoorItem(ResourceLocation item) {
		tallDoorItem(item, item);
	}

	public void tallDoorItem(ResourceLocation item, ResourceLocation original) {
		getBuilder(item.toString())
				.parent(new ModelFile.UncheckedModelFile("item/generated"))
				.texture("layer0", ResourceLocation.fromNamespaceAndPath(original.getNamespace(), "item/" + original.getPath()))
				.texture("layer1", Koratio.prefix("item/" + "tall_door_overlay"));
	}
	
	private ResourceLocation getItemPathInFolder(Item item, String folder, String extra) {
		if (BuiltInRegistries.ITEM.getKey(item).getNamespace().equals("minecraft")) {
			return ResourceLocation.withDefaultNamespace(folder+"/"+BuiltInRegistries.ITEM.getKey(item).getPath()+extra);
		} else {
			return Koratio.prefix(folder+"/"+BuiltInRegistries.ITEM.getKey(item).getPath()+extra);
		}
	}
	
	private ResourceLocation getItemPathInFolder(Item item, String folder) {
		return getItemPathInFolder(item, folder, "");
	}
}*/