package net.setrion.koratio.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.setrion.koratio.Koratio;
import net.setrion.koratio.scroll.Scroll;
import net.setrion.koratio.scroll.ScrollUtils;

import java.util.Collection;
import java.util.stream.Collectors;

public class KoratioCreativeTabs {
	
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Koratio.MOD_ID);
	
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = TABS.register("main", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 1)
			.withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> new ItemStack(KoratioItems.RAINBOW_GEM.get()))
			.title(Component.translatable("itemGroup.koratio.main"))
			.displayItems((parameters, output) -> {
				output.accept(KoratioItems.DECRYPTING_TABLE.get());
				output.accept(KoratioItems.WOODCUTTER.get());
				output.accept(KoratioItems.CANDY_SHAPER.get());
				output.accept(KoratioItems.DECRYPTING_BOOK.get());
				output.accept(KoratioItems.BETTER_DECRYPTING_BOOK.get());
				output.accept(KoratioItems.FANTASTIC_DECRYPTING_BOOK.get());
				output.accept(KoratioItems.FLIPPED_FARMLAND.get());
				output.accept(KoratioItems.RUBY.get());
				output.accept(KoratioItems.RUBY_BLOCK.get());
				output.accept(KoratioItems.RUBY_ORE.get());
				output.accept(KoratioItems.DEEPSLATE_RUBY_ORE.get());
				output.accept(KoratioItems.SAPPHIRE.get());
				output.accept(KoratioItems.SAPPHIRE_BLOCK.get());
				output.accept(KoratioItems.SAPPHIRE_ORE.get());
				output.accept(KoratioItems.DEEPSLATE_SAPPHIRE_ORE.get());
				output.accept(KoratioItems.TOPAZ.get());
				output.accept(KoratioItems.TOPAZ_BLOCK.get());
				output.accept(KoratioItems.TOPAZ_ORE.get());
				output.accept(KoratioItems.DEEPSLATE_TOPAZ_ORE.get());
				output.accept(KoratioItems.ONYX.get());
				output.accept(KoratioItems.ONYX_BLOCK.get());
				output.accept(KoratioItems.ONYX_ORE.get());
				output.accept(KoratioItems.DEEPSLATE_ONYX_ORE.get());

				output.accept(KoratioItems.OAK_LEAF_PANE.get());
				output.accept(KoratioItems.SPRUCE_LEAF_PANE.get());
				output.accept(KoratioItems.BIRCH_LEAF_PANE.get());
				output.accept(KoratioItems.JUNGLE_LEAF_PANE.get());
				output.accept(KoratioItems.ACACIA_LEAF_PANE.get());
				output.accept(KoratioItems.DARK_OAK_LEAF_PANE.get());
				output.accept(KoratioItems.MANGROVE_LEAF_PANE.get());
				output.accept(KoratioItems.AZALEA_LEAF_PANE.get());
				output.accept(KoratioItems.FLOWERING_AZALEA_LEAF_PANE.get());
				output.accept(KoratioItems.CHERRY_LEAF_PANE.get());

				output.accept(KoratioItems.TALL_OAK_DOOR.get());
				output.accept(KoratioItems.TALL_SPRUCE_DOOR.get());
				output.accept(KoratioItems.TALL_BIRCH_DOOR.get());
				output.accept(KoratioItems.TALL_JUNGLE_DOOR.get());
				output.accept(KoratioItems.TALL_ACACIA_DOOR.get());
				output.accept(KoratioItems.TALL_DARK_OAK_DOOR.get());
				output.accept(KoratioItems.TALL_MANGROVE_DOOR.get());
				output.accept(KoratioItems.TALL_CHERRY_DOOR.get());
				output.accept(KoratioItems.TALL_BAMBOO_DOOR.get());
				output.accept(KoratioItems.TALL_CRIMSON_DOOR.get());
				output.accept(KoratioItems.TALL_WARPED_DOOR.get());
				output.accept(KoratioItems.TALL_IRON_DOOR.get());
				output.accept(KoratioItems.TALL_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_EXPOSED_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_WEATHERED_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_OXIDIZED_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_WAXED_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_WAXED_EXPOSED_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_WAXED_WEATHERED_COPPER_DOOR.get());
				output.accept(KoratioItems.TALL_WAXED_OXIDIZED_COPPER_DOOR.get());

				createScrolls(output);
				createSpawnEggsAlphabetical(output);
			}).build());
	
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FANTASIA = TABS.register("fantasia", () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 1)
			.withTabsBefore(MAIN.getKey()).icon(() -> new ItemStack(KoratioItems.MINIATURE_FANTASIA_PORTAL.get()))
			.title(Component.translatable("itemGroup.koratio.fantasia"))
			.displayItems((parameters, output) -> {

				output.accept(KoratioItems.RAINBOW_GEM.get());
				output.accept(KoratioItems.RAINBOW_GEM_BLOCK.get());
				output.accept(KoratioItems.RAINBOW_TORCH.get());
				output.accept(KoratioItems.RAINBOW_LANTERN.get());
				output.accept(KoratioItems.RAINBOW_CAMPFIRE.get());
				output.accept(KoratioItems.RAINBOW_CANDLE.get());
				output.accept(KoratioItems.RAINBOW_CRYSTAL_SHARD.get());
				output.accept(KoratioItems.SMALL_RAINBOW_CRYSTAL_BUD.get());
				output.accept(KoratioItems.MEDIUM_RAINBOW_CRYSTAL_BUD.get());
				output.accept(KoratioItems.LARGE_RAINBOW_CRYSTAL_BUD.get());
				output.accept(KoratioItems.RAINBOW_CRYSTAL_CLUSTER.get());
				output.accept(KoratioItems.RAINBOW_CRYSTAL_BLOCK.get());
				output.accept(KoratioItems.BUDDING_RAINBOW_CRYSTAL.get());
				output.accept(KoratioItems.RAINBOW_CRYSTAL_GLASS.get());
				output.accept(KoratioItems.RAINBOW_CRYSTAL_GLASS_PANE.get());

				//Environment
				output.accept(KoratioBlocks.ANCIENT_STONE.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_STAIRS.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_SLAB.get());
				output.accept(KoratioBlocks.ANCIENT_COBBLESTONE.get());
				output.accept(KoratioBlocks.ANCIENT_COBBLESTONE_STAIRS.get());
				output.accept(KoratioBlocks.ANCIENT_COBBLESTONE_SLAB.get());
				output.accept(KoratioBlocks.ANCIENT_COBBLESTONE_WALL.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_BRICKS.get());
				output.accept(KoratioBlocks.CRACKED_ANCIENT_STONE_BRICKS.get());
				output.accept(KoratioBlocks.CHISELED_ANCIENT_STONE_BRICKS.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_BRICK_STAIRS.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_BRICK_SLAB.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_BRICK_WALL.get());
				output.accept(KoratioBlocks.POLISHED_ANCIENT_STONE.get());
				output.accept(KoratioBlocks.POLISHED_ANCIENT_STONE_STAIRS.get());
				output.accept(KoratioBlocks.POLISHED_ANCIENT_STONE_SLAB.get());
				output.accept(KoratioBlocks.POLISHED_ANCIENT_STONE_WALL.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_TILES.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_TILE_STAIRS.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_TILE_SLAB.get());
				output.accept(KoratioBlocks.ANCIENT_STONE_TILE_WALL.get());

				output.accept(KoratioBlocks.ANCIENT_FURNACE.get());
				output.accept(KoratioBlocks.ANCIENT_TELEPORTER.get());

				//Minerals
				
				output.accept(KoratioItems.RED_SUGAR.get());
				output.accept(KoratioItems.BLUE_SUGAR.get());
				output.accept(KoratioItems.YELLOW_SUGAR.get());
				output.accept(KoratioItems.GREEN_SUGAR.get());

				output.accept(KoratioItems.STICKY_SUGAR_BUCKET.get());
				output.accept(KoratioItems.STICKY_BLUE_SUGAR_BUCKET.get());
				output.accept(KoratioItems.STICKY_GREEN_SUGAR_BUCKET.get());
				output.accept(KoratioItems.STICKY_YELLOW_SUGAR_BUCKET.get());
				output.accept(KoratioItems.STICKY_RED_SUGAR_BUCKET.get());

				output.accept(KoratioItems.MOLTEN_SUGAR_BUCKET.get());
				output.accept(KoratioItems.MOLTEN_BLUE_SUGAR_BUCKET.get());
				output.accept(KoratioItems.MOLTEN_GREEN_SUGAR_BUCKET.get());
				output.accept(KoratioItems.MOLTEN_YELLOW_SUGAR_BUCKET.get());
				output.accept(KoratioItems.MOLTEN_RED_SUGAR_BUCKET.get());

				output.accept(KoratioItems.WHITE_BLUE_CANDY_CANE.get());
				output.accept(KoratioItems.WHITE_GREEN_CANDY_CANE.get());
				output.accept(KoratioItems.WHITE_YELLOW_CANDY_CANE.get());
				output.accept(KoratioItems.WHITE_RED_CANDY_CANE.get());

				output.accept(KoratioItems.BLUE_CANDY_CANE.get());
				output.accept(KoratioItems.BLUE_WHITE_CANDY_CANE.get());
				output.accept(KoratioItems.BLUE_GREEN_CANDY_CANE.get());
				output.accept(KoratioItems.BLUE_YELLOW_CANDY_CANE.get());
				output.accept(KoratioItems.BLUE_RED_CANDY_CANE.get());
				output.accept(KoratioItems.BLUE_RAINBOW_CANDY_CANE.get());

				output.accept(KoratioItems.GREEN_CANDY_CANE.get());
				output.accept(KoratioItems.GREEN_WHITE_CANDY_CANE.get());
				output.accept(KoratioItems.GREEN_BLUE_CANDY_CANE.get());
				output.accept(KoratioItems.GREEN_YELLOW_CANDY_CANE.get());
				output.accept(KoratioItems.GREEN_RED_CANDY_CANE.get());
				output.accept(KoratioItems.GREEN_RAINBOW_CANDY_CANE.get());

				output.accept(KoratioItems.YELLOW_CANDY_CANE.get());
				output.accept(KoratioItems.YELLOW_WHITE_CANDY_CANE.get());
				output.accept(KoratioItems.YELLOW_BLUE_CANDY_CANE.get());
				output.accept(KoratioItems.YELLOW_GREEN_CANDY_CANE.get());
				output.accept(KoratioItems.YELLOW_RED_CANDY_CANE.get());
				output.accept(KoratioItems.YELLOW_RAINBOW_CANDY_CANE.get());

				output.accept(KoratioItems.RED_CANDY_CANE.get());
				output.accept(KoratioItems.RED_WHITE_CANDY_CANE.get());
				output.accept(KoratioItems.RED_BLUE_CANDY_CANE.get());
				output.accept(KoratioItems.RED_GREEN_CANDY_CANE.get());
				output.accept(KoratioItems.RED_YELLOW_CANDY_CANE.get());
				output.accept(KoratioItems.RED_RAINBOW_CANDY_CANE.get());

				output.accept(KoratioBlocks.RAW_GINGERBREAD_BLOCK.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_STAIRS.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_SLAB.get());
				output.accept(KoratioBlocks.GINGERBREAD_BLOCK.get());
				output.accept(KoratioBlocks.GINGERBREAD_STAIRS.get());
				output.accept(KoratioBlocks.GINGERBREAD_SLAB.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_BRICKS.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_BRICK_STAIRS.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_BRICK_SLAB.get());
				output.accept(KoratioBlocks.GINGERBREAD_BRICKS.get());
				output.accept(KoratioBlocks.GINGERBREAD_BRICK_STAIRS.get());
				output.accept(KoratioBlocks.GINGERBREAD_BRICK_SLAB.get());
				output.accept(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICKS.get());
				output.accept(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICK_STAIRS.get());
				output.accept(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICK_SLAB.get());
				output.accept(KoratioBlocks.LARGE_GINGERBREAD_BRICKS.get());
				output.accept(KoratioBlocks.LARGE_GINGERBREAD_BRICK_STAIRS.get());
				output.accept(KoratioBlocks.LARGE_GINGERBREAD_BRICK_SLAB.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_BLOCK_WALL.get());
				output.accept(KoratioBlocks.GINGERBREAD_BLOCK_WALL.get());
				output.accept(KoratioBlocks.RAW_GINGERBREAD_BRICK_WALL.get());
				output.accept(KoratioBlocks.GINGERBREAD_BRICK_WALL.get());
				output.accept(KoratioBlocks.RAW_LARGE_GINGERBREAD_BRICK_WALL.get());
				output.accept(KoratioBlocks.LARGE_GINGERBREAD_BRICK_WALL.get());
				output.accept(KoratioBlocks.MARSHMALLOW_BLOCK.get());
				output.accept(KoratioBlocks.MARSHMALLOW_STAIRS.get());
				output.accept(KoratioBlocks.MARSHMALLOW_SLAB.get());
				output.accept(KoratioItems.SUGAR_BLOCK.get());
				output.accept(KoratioItems.STICKY_SUGAR_BLOCK.get());
				output.accept(KoratioItems.BLUE_SUGAR_BLOCK.get());
				output.accept(KoratioItems.STICKY_BLUE_SUGAR_BLOCK.get());
				output.accept(KoratioItems.GREEN_SUGAR_BLOCK.get());
				output.accept(KoratioItems.STICKY_GREEN_SUGAR_BLOCK.get());
				output.accept(KoratioItems.YELLOW_SUGAR_BLOCK.get());
				output.accept(KoratioItems.STICKY_YELLOW_SUGAR_BLOCK.get());
				output.accept(KoratioItems.RED_SUGAR_BLOCK.get());
				output.accept(KoratioItems.STICKY_RED_SUGAR_BLOCK.get());
				output.accept(KoratioItems.WHITE_CANDY_BLOCK.get());
				output.accept(KoratioItems.BLUE_CANDY_BLOCK.get());
				output.accept(KoratioItems.GREEN_CANDY_BLOCK.get());
				output.accept(KoratioItems.YELLOW_CANDY_BLOCK.get());
				output.accept(KoratioItems.RED_CANDY_BLOCK.get());

				output.accept(KoratioItems.WHITE_LEVITATING_WOOL.get());
				output.accept(KoratioItems.ORANGE_LEVITATING_WOOL.get());
				output.accept(KoratioItems.MAGENTA_LEVITATING_WOOL.get());
				output.accept(KoratioItems.LIGHT_BLUE_LEVITATING_WOOL.get());
				output.accept(KoratioItems.YELLOW_LEVITATING_WOOL.get());
				output.accept(KoratioItems.LIME_LEVITATING_WOOL.get());
				output.accept(KoratioItems.PINK_LEVITATING_WOOL.get());
				output.accept(KoratioItems.GRAY_LEVITATING_WOOL.get());
				output.accept(KoratioItems.LIGHT_GRAY_LEVITATING_WOOL.get());
				output.accept(KoratioItems.CYAN_LEVITATING_WOOL.get());
				output.accept(KoratioItems.PURPLE_LEVITATING_WOOL.get());
				output.accept(KoratioItems.BLUE_LEVITATING_WOOL.get());
				output.accept(KoratioItems.BROWN_LEVITATING_WOOL.get());
				output.accept(KoratioItems.GREEN_LEVITATING_WOOL.get());
				output.accept(KoratioItems.RED_LEVITATING_WOOL.get());
				output.accept(KoratioItems.BLACK_LEVITATING_WOOL.get());

				//Food
				output.accept(KoratioItems.RAW_PANGO.get());
				output.accept(KoratioItems.CRACKED_PANGO.get());
				output.accept(KoratioItems.FLUFFER.get());
				output.accept(KoratioItems.COOKED_FLUFFER.get());
				output.accept(KoratioItems.SPIKED_PORKCHOP.get());
				output.accept(KoratioItems.COOKED_SPIKED_PORKCHOP.get());
				output.accept(KoratioItems.CHOCOLATE_MILK_BUCKET.get());
				
				//Wood
				output.accept(KoratioItems.PANGO_LOG.get());
				output.accept(KoratioItems.PANGO_WOOD.get());
				output.accept(KoratioItems.STRIPPED_PANGO_LOG.get());
				output.accept(KoratioItems.STRIPPED_PANGO_WOOD.get());
				output.accept(KoratioItems.PANGO_PLANKS.get());
				output.accept(KoratioItems.PANGO_STAIRS.get());
				output.accept(KoratioItems.PANGO_SLAB.get());
				output.accept(KoratioItems.PANGO_FENCE.get());
				output.accept(KoratioItems.PANGO_FENCE_GATE.get());
				output.accept(KoratioItems.PANGO_DOOR.get());
				output.accept(KoratioItems.TALL_PANGO_DOOR.get());
				output.accept(KoratioItems.PANGO_TRAPDOOR.get());
				output.accept(KoratioItems.PANGO_PRESSURE_PLATE.get());
				output.accept(KoratioItems.PANGO_BUTTON.get());
				output.accept(KoratioItems.PANGO_SIGN.get());
				output.accept(KoratioItems.PANGO_HANGING_SIGN.get());
				output.accept(KoratioItems.PANGO_BOAT.get());
				output.accept(KoratioItems.PANGO_CHEST_BOAT.get());
				output.accept(KoratioItems.PANGO_BOOKSHELF.get());
				output.accept(KoratioItems.PANGO_CHEST.get());
				output.accept(KoratioItems.TRAPPED_PANGO_CHEST.get());
				
				output.accept(KoratioItems.RUGONA_LOG.get());
				output.accept(KoratioItems.RUGONA_WOOD.get());
				output.accept(KoratioItems.STRIPPED_RUGONA_LOG.get());
				output.accept(KoratioItems.STRIPPED_RUGONA_WOOD.get());
				output.accept(KoratioItems.RUGONA_PLANKS.get());
				output.accept(KoratioItems.RUGONA_STAIRS.get());
				output.accept(KoratioItems.RUGONA_SLAB.get());
				output.accept(KoratioItems.RUGONA_FENCE.get());
				output.accept(KoratioItems.RUGONA_FENCE_GATE.get());
				output.accept(KoratioItems.RUGONA_DOOR.get());
				output.accept(KoratioItems.TALL_RUGONA_DOOR.get());
				output.accept(KoratioItems.RUGONA_TRAPDOOR.get());
				output.accept(KoratioItems.RUGONA_PRESSURE_PLATE.get());
				output.accept(KoratioItems.RUGONA_BUTTON.get());
				output.accept(KoratioItems.RUGONA_SIGN.get());
				output.accept(KoratioItems.RUGONA_HANGING_SIGN.get());
				output.accept(KoratioItems.RUGONA_BOAT.get());
				output.accept(KoratioItems.RUGONA_CHEST_BOAT.get());
				output.accept(KoratioItems.RUGONA_BOOKSHELF.get());
				output.accept(KoratioItems.RUGONA_CHEST.get());
				output.accept(KoratioItems.TRAPPED_RUGONA_CHEST.get());

				output.accept(KoratioItems.CANDY_LOG.get());
				output.accept(KoratioItems.CANDY_WOOD.get());
				output.accept(KoratioItems.STRIPPED_CANDY_LOG.get());
				output.accept(KoratioItems.STRIPPED_CANDY_WOOD.get());
				output.accept(KoratioItems.CANDY_PLANKS.get());
				output.accept(KoratioItems.CANDY_STAIRS.get());
				output.accept(KoratioItems.CANDY_SLAB.get());
				output.accept(KoratioItems.CANDY_FENCE.get());
				output.accept(KoratioItems.CANDY_FENCE_GATE.get());
				output.accept(KoratioItems.CANDY_DOOR.get());
				//output.accept(KoratioItems.TALL_CANDY_DOOR.get());
				output.accept(KoratioItems.CANDY_TRAPDOOR.get());
				output.accept(KoratioItems.CANDY_PRESSURE_PLATE.get());
				output.accept(KoratioItems.CANDY_BUTTON.get());
				output.accept(KoratioItems.CANDY_SIGN.get());
				output.accept(KoratioItems.CANDY_HANGING_SIGN.get());
				output.accept(KoratioItems.CANDY_BOAT.get());
				output.accept(KoratioItems.CANDY_CHEST_BOAT.get());
				output.accept(KoratioItems.CANDY_BOOKSHELF.get());
				output.accept(KoratioItems.CANDY_CHEST.get());
				output.accept(KoratioItems.TRAPPED_CANDY_CHEST.get());

				output.accept(KoratioItems.ELVEN_LOG.get());
				output.accept(KoratioItems.ELVEN_WOOD.get());
				output.accept(KoratioItems.STRIPPED_ELVEN_LOG.get());
				output.accept(KoratioItems.STRIPPED_BLUE_ELVEN_LOG.get());
				output.accept(KoratioItems.STRIPPED_CYAN_ELVEN_LOG.get());
				output.accept(KoratioItems.STRIPPED_GREEN_ELVEN_LOG.get());
				output.accept(KoratioItems.STRIPPED_ELVEN_WOOD.get());
				output.accept(KoratioItems.STRIPPED_BLUE_ELVEN_WOOD.get());
				output.accept(KoratioItems.STRIPPED_CYAN_ELVEN_WOOD.get());
				output.accept(KoratioItems.STRIPPED_GREEN_ELVEN_WOOD.get());
				output.accept(KoratioItems.ELVEN_PLANKS.get());
				output.accept(KoratioItems.BLUE_ELVEN_PLANKS.get());
				output.accept(KoratioItems.CYAN_ELVEN_PLANKS.get());
				output.accept(KoratioItems.GREEN_ELVEN_PLANKS.get());
				output.accept(KoratioItems.ELVEN_STAIRS.get());
				output.accept(KoratioItems.BLUE_ELVEN_STAIRS.get());
				output.accept(KoratioItems.CYAN_ELVEN_STAIRS.get());
				output.accept(KoratioItems.GREEN_ELVEN_STAIRS.get());
				output.accept(KoratioItems.ELVEN_SLAB.get());
				output.accept(KoratioItems.BLUE_ELVEN_SLAB.get());
				output.accept(KoratioItems.CYAN_ELVEN_SLAB.get());
				output.accept(KoratioItems.GREEN_ELVEN_SLAB.get());
				output.accept(KoratioItems.ELVEN_FENCE.get());
				output.accept(KoratioItems.BLUE_ELVEN_FENCE.get());
				output.accept(KoratioItems.CYAN_ELVEN_FENCE.get());
				output.accept(KoratioItems.GREEN_ELVEN_FENCE.get());
				output.accept(KoratioItems.ELVEN_FENCE_GATE.get());
				output.accept(KoratioItems.BLUE_ELVEN_FENCE_GATE.get());
				output.accept(KoratioItems.CYAN_ELVEN_FENCE_GATE.get());
				output.accept(KoratioItems.GREEN_ELVEN_FENCE_GATE.get());
				output.accept(KoratioItems.ELVEN_DOOR.get());
				output.accept(KoratioItems.TALL_ELVEN_DOOR.get());
				output.accept(KoratioItems.BLUE_ELVEN_DOOR.get());
				output.accept(KoratioItems.TALL_BLUE_ELVEN_DOOR.get());
				output.accept(KoratioItems.CYAN_ELVEN_DOOR.get());
				output.accept(KoratioItems.TALL_CYAN_ELVEN_DOOR.get());
				output.accept(KoratioItems.GREEN_ELVEN_DOOR.get());
				output.accept(KoratioItems.TALL_GREEN_ELVEN_DOOR.get());
				output.accept(KoratioItems.ELVEN_TRAPDOOR.get());
				output.accept(KoratioItems.BLUE_ELVEN_TRAPDOOR.get());
				output.accept(KoratioItems.CYAN_ELVEN_TRAPDOOR.get());
				output.accept(KoratioItems.GREEN_ELVEN_TRAPDOOR.get());
				output.accept(KoratioItems.ELVEN_PRESSURE_PLATE.get());
				output.accept(KoratioItems.BLUE_ELVEN_PRESSURE_PLATE.get());
				output.accept(KoratioItems.CYAN_ELVEN_PRESSURE_PLATE.get());
				output.accept(KoratioItems.GREEN_ELVEN_PRESSURE_PLATE.get());
				output.accept(KoratioItems.ELVEN_BUTTON.get());
				output.accept(KoratioItems.BLUE_ELVEN_BUTTON.get());
				output.accept(KoratioItems.CYAN_ELVEN_BUTTON.get());
				output.accept(KoratioItems.GREEN_ELVEN_BUTTON.get());
				output.accept(KoratioItems.ELVEN_SIGN.get());
				output.accept(KoratioItems.BLUE_ELVEN_SIGN.get());
				output.accept(KoratioItems.CYAN_ELVEN_SIGN.get());
				output.accept(KoratioItems.GREEN_ELVEN_SIGN.get());
				output.accept(KoratioItems.ELVEN_HANGING_SIGN.get());
				output.accept(KoratioItems.BLUE_ELVEN_HANGING_SIGN.get());
				output.accept(KoratioItems.CYAN_ELVEN_HANGING_SIGN.get());
				output.accept(KoratioItems.GREEN_ELVEN_HANGING_SIGN.get());
				output.accept(KoratioItems.ELVEN_BOAT.get());
				output.accept(KoratioItems.BLUE_ELVEN_BOAT.get());
				output.accept(KoratioItems.CYAN_ELVEN_BOAT.get());
				output.accept(KoratioItems.GREEN_ELVEN_BOAT.get());
				output.accept(KoratioItems.ELVEN_CHEST_BOAT.get());
				output.accept(KoratioItems.BLUE_ELVEN_CHEST_BOAT.get());
				output.accept(KoratioItems.CYAN_ELVEN_CHEST_BOAT.get());
				output.accept(KoratioItems.GREEN_ELVEN_CHEST_BOAT.get());
				output.accept(KoratioItems.ELVEN_BOOKSHELF.get());
				output.accept(KoratioItems.BLUE_ELVEN_BOOKSHELF.get());
				output.accept(KoratioItems.CYAN_ELVEN_BOOKSHELF.get());
				output.accept(KoratioItems.GREEN_ELVEN_BOOKSHELF.get());
				output.accept(KoratioItems.ELVEN_CHEST.get());
				output.accept(KoratioItems.TRAPPED_ELVEN_CHEST.get());
				output.accept(KoratioItems.BLUE_ELVEN_CHEST.get());
				output.accept(KoratioItems.TRAPPED_BLUE_ELVEN_CHEST.get());
				output.accept(KoratioItems.CYAN_ELVEN_CHEST.get());
				output.accept(KoratioItems.TRAPPED_CYAN_ELVEN_CHEST.get());
				output.accept(KoratioItems.GREEN_ELVEN_CHEST.get());
				output.accept(KoratioItems.TRAPPED_GREEN_ELVEN_CHEST.get());
				
				output.accept(KoratioItems.VARESO_LOG.get());
				output.accept(KoratioItems.VARESO_WOOD.get());
				output.accept(KoratioItems.STRIPPED_VARESO_LOG.get());
				output.accept(KoratioItems.STRIPPED_VARESO_WOOD.get());
				output.accept(KoratioItems.VARESO_PLANKS.get());
				output.accept(KoratioItems.VARESO_STAIRS.get());
				output.accept(KoratioItems.VARESO_SLAB.get());
				output.accept(KoratioItems.VARESO_FENCE.get());
				output.accept(KoratioItems.VARESO_FENCE_GATE.get());
				output.accept(KoratioItems.VARESO_DOOR.get());
				output.accept(KoratioItems.TALL_VARESO_DOOR.get());
				output.accept(KoratioItems.VARESO_TRAPDOOR.get());
				output.accept(KoratioItems.VARESO_PRESSURE_PLATE.get());
				output.accept(KoratioItems.VARESO_BUTTON.get());
				output.accept(KoratioItems.VARESO_SIGN.get());
				output.accept(KoratioItems.VARESO_HANGING_SIGN.get());
				output.accept(KoratioItems.VARESO_BOAT.get());
				output.accept(KoratioItems.VARESO_CHEST_BOAT.get());
				output.accept(KoratioItems.VARESO_BOOKSHELF.get());
				output.accept(KoratioItems.VARESO_CHEST.get());
				output.accept(KoratioItems.TRAPPED_VARESO_CHEST.get());
				
				//Plants
				output.accept(KoratioItems.PANGO_LEAVES.get());
				output.accept(KoratioItems.PANGO_LEAF_PANE.get());
				output.accept(KoratioItems.PANGO_SAPLING.get());
				output.accept(KoratioItems.RUGONA_LEAVES.get());
				output.accept(KoratioItems.RUGONA_LEAF_PANE.get());
				output.accept(KoratioItems.RUGONA_SAPLING.get());
				output.accept(KoratioItems.VARESO_LEAVES.get());
				output.accept(KoratioItems.VARESO_LEAF_PANE.get());
				output.accept(KoratioItems.VARESO_SAPLING.get());
				output.accept(KoratioItems.COTTON_CANDY_LEAVES.get());
				output.accept(KoratioItems.COTTON_CANDY_LEAF_PANE.get());
				output.accept(KoratioItems.CANDY_SAPLING.get());
				output.accept(KoratioItems.ELVEN_LEAVES.get());
				output.accept(KoratioItems.ELVEN_LEAF_PANE.get());
				output.accept(KoratioItems.ELVEN_SAPLING.get());
				output.accept(KoratioItems.GILDED_VINES.get());
				output.accept(KoratioItems.RAINBOW_ROSE.get());
				output.accept(KoratioItems.RAINBOW_ALLIUM.get());
				output.accept(KoratioItems.RAINBOW_LILY_OF_THE_VALLEY.get());
				output.accept(KoratioItems.COOKIE_FLOWER.get());
				output.accept(KoratioItems.WHITE_SUGARGLASS_FLOWER.get());
				output.accept(KoratioItems.BLUE_SUGARGLASS_FLOWER.get());
				output.accept(KoratioItems.GREEN_SUGARGLASS_FLOWER.get());
				output.accept(KoratioItems.YELLOW_SUGARGLASS_FLOWER.get());
				output.accept(KoratioItems.RED_SUGARGLASS_FLOWER.get());
				output.accept(KoratioItems.PURPLE_MUSHROOM.get());
				output.accept(KoratioItems.PURPLE_MUSHROOM_BLOCK.get());
				output.accept(KoratioItems.GREEN_MUSHROOM.get());
				output.accept(KoratioItems.GREEN_MUSHROOM_BLOCK.get());
				
				//Weapons, Tools & Armor
				
			}).build());

	private static void createScrolls(CreativeModeTab.Output output) {
		if (KoratioScrolls.SCROLLS.isEmpty()) return;
		for (Scroll scroll : KoratioScrolls.SCROLLS) {
			output.accept(ScrollUtils.createForScroll(scroll, false));
		}
	}
	
	private static void createSpawnEggsAlphabetical(CreativeModeTab.Output output) {
		Collection<Item> eggs = KoratioItems.SPAWN_EGGS.getEntries().stream().map(DeferredHolder::get).collect(Collectors.toList());
		eggs.forEach(output::accept);
	}
}