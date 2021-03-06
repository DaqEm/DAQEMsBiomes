package net.daqem.daqemsbiomes.client;

import net.daqem.daqemsbiomes.DAQEMsBiomes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DAQEMsBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //████  █      ███   ████ █  █  █████
        //█   █ █     █   █ █     █ █   █
        //████  █     █   █ █     ██ █  █████
        //█   █ █     █   █ █     █  █      █
        //████  █████  ███   ████ █   █ █████

        // LEAVES
        cubeAll("cherry_blossom_leaves", modLoc("block/cherry_blossom_leaves"));

        // LOGS
        cubeBottomTop("cherry_blossom_logs", modLoc("block/cherry_blossom_logs"), modLoc("block/cherry_blossom_logs_top"), modLoc("block/cherry_blossom_logs_top"));

        // PLANKS
        cubeAll("cherry_blossom_planks", modLoc("block/cherry_blossom_planks"));

        // STAIRS
        stairs("cherry_blossom_stairs", modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"));
        stairsInner("cherry_blossom_stairs_inner", modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"));
        stairsOuter("cherry_blossom_stairs_outer", modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"));

        // SLABS
        slab("cherry_blossom_slab", modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"));
        slabTop("cherry_blossom_slab_top", modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"), modLoc("block/cherry_blossom_planks"));


        //█████ █████ █████ █   █ █████
        //  █     █   █     ██ ██ █
        //  █     █   ████  █ █ █ █████
        //  █     █   █     █   █     █
        //█████   █   █████ █   █ █████

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        // SAPLINGS
        itemBlockBuilder(itemGenerated, "cherry_blossom_sapling");

        //LOGO
        itemBuilder(itemGenerated, "logo");
    }

    private ItemModelBuilder itemBuilder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    private ItemModelBuilder itemBlockBuilder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "block/" + name);
    }
}
