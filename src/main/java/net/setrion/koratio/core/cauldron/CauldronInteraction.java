package net.setrion.koratio.core.cauldron;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.fluids.FluidUtil;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.IFluidHandlerItem;
import net.setrion.koratio.registry.KoratioBlocks;
import net.setrion.koratio.registry.KoratioFluids;

import javax.annotation.Nullable;

public abstract class CauldronInteraction implements net.minecraft.core.cauldron.CauldronInteraction {

    public static net.minecraft.core.cauldron.CauldronInteraction.InteractionMap MOLTEN_SUGAR = net.minecraft.core.cauldron.CauldronInteraction.newInteractionMap("molten_sugar");
    public static net.minecraft.core.cauldron.CauldronInteraction.InteractionMap MOLTEN_BLUE_SUGAR = net.minecraft.core.cauldron.CauldronInteraction.newInteractionMap("molten_blue_sugar");
    public static net.minecraft.core.cauldron.CauldronInteraction.InteractionMap MOLTEN_GREEN_SUGAR = net.minecraft.core.cauldron.CauldronInteraction.newInteractionMap("molten_green_sugar");
    public static net.minecraft.core.cauldron.CauldronInteraction.InteractionMap MOLTEN_YELLOW_SUGAR = net.minecraft.core.cauldron.CauldronInteraction.newInteractionMap("molten_yellow_sugar");
    public static net.minecraft.core.cauldron.CauldronInteraction.InteractionMap MOLTEN_RED_SUGAR = net.minecraft.core.cauldron.CauldronInteraction.newInteractionMap("molten_red_sugar");

    public static final CauldronInteraction EMPTY = new CauldronInteraction() {
        //Fills the cauldron empties the bucket.
        @Override
        public ItemInteractionResult interact(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack stack) {
            IFluidHandlerItem fluidHandlerItem = stack.getCapability(Capabilities.FluidHandler.ITEM);
            if (fluidHandlerItem != null) {
                FluidStack fluidStack = fluidHandlerItem.getFluidInTank(0);
                BlockState newState = getState(fluidStack);
                if(newState != null) {
                    if(fluidHandlerItem.getFluidInTank(0).getAmount() >= FluidType.BUCKET_VOLUME) {
                        if(!level.isClientSide()) {
                            if(!player.getAbilities().instabuild) transferFluid(level, player, hand, pos);
                            fillTheCauldron(player, level, stack, fluidStack, pos, newState);
                        }
                        return ItemInteractionResult.sidedSuccess(level.isClientSide);
                    }
                }
            }
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }
    };

    @Nullable
    private static BlockState getState(FluidStack stack) {
        if(stack.is(Fluids.WATER)) {
            return Blocks.WATER_CAULDRON.defaultBlockState().setValue(LayeredCauldronBlock.LEVEL, LayeredCauldronBlock.MAX_FILL_LEVEL);
        } else if(stack.is(Fluids.LAVA)) {
            return Blocks.LAVA_CAULDRON.defaultBlockState();
        } else if(stack.is(KoratioFluids.MOLTEN_SUGAR.get())) {
            return KoratioBlocks.MOLTEN_SUGAR_CAULDRON.get().defaultBlockState();
        } else if(stack.is(KoratioFluids.MOLTEN_BLUE_SUGAR.get())) {
            return KoratioBlocks.MOLTEN_BLUE_SUGAR_CAULDRON.get().defaultBlockState();
        } else if(stack.is(KoratioFluids.MOLTEN_GREEN_SUGAR.get())) {
            return KoratioBlocks.MOLTEN_GREEN_SUGAR_CAULDRON.get().defaultBlockState();
        } else if(stack.is(KoratioFluids.MOLTEN_YELLOW_SUGAR.get())) {
            return KoratioBlocks.MOLTEN_YELLOW_SUGAR_CAULDRON.get().defaultBlockState();
        } else if(stack.is(KoratioFluids.MOLTEN_RED_SUGAR.get())) {
            return KoratioBlocks.MOLTEN_RED_SUGAR_CAULDRON.get().defaultBlockState();
        }
        return null;
    }

    protected void fillTheCauldron(Player player, Level level, ItemStack stack, FluidStack fluidStack, BlockPos pos, BlockState newState) {
        player.awardStat(Stats.FILL_CAULDRON);
        player.awardStat(Stats.ITEM_USED.get(stack.getItem()));
        level.setBlockAndUpdate(pos, newState);
        SoundEvent emptySound = fluidStack.getFluidType().getSound(player, level, pos, SoundActions.BUCKET_EMPTY);
        if (emptySound != null) level.playSound(null, pos, emptySound, SoundSource.BLOCKS, 1.0F, 1.0F);
        level.gameEvent(null, GameEvent.FLUID_PLACE, pos);

    }

    protected void transferFluid(Level level, Player player, InteractionHand hand, BlockPos pos) {
        IFluidHandler cauldron = level.getCapability(Capabilities.FluidHandler.BLOCK, pos, null);
        if(cauldron != null) FluidUtil.interactWithFluidHandler(player, hand, cauldron);
    }
}