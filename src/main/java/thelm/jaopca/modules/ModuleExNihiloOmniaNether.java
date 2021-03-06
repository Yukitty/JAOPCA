package thelm.jaopca.modules;

import thelm.jaopca.api.ModuleBase;

public class ModuleExNihiloOmniaNether extends ModuleBase {

	/*public static final ItemEntry ORE_NETHER_BROKEN_ENTRY = new ItemEntry(EnumEntryType.ITEM, "oreNetherBroken", new ModelResourceLocation("jaopca:ore_nether_broken#inventory"));
	public static final ItemEntry ORE_NETHER_GRAVEL_ENTRY = new ItemEntry(EnumEntryType.BLOCK, "oreNetherGravel", new ModelResourceLocation("jaopca:ore_nether_gravel#normal")).setBlockProperties(ModuleExNihiloOmnia.GRAVEL_PROPERTIES);*/

	@Override
	public String getName() {
		return "exnihiloomnianether";
	}

	/*@Override
	public List<String> getDependencies() {
		return Lists.<String>newArrayList("exnihiloomnia");
	}

	@Override
	public List<ItemEntry> getItemRequests() {
		List<ItemEntry> ret = Lists.<ItemEntry>newArrayList(ORE_NETHER_BROKEN_ENTRY, ORE_NETHER_GRAVEL_ENTRY);
		for(ItemEntry entry : ret) {
			entry.blacklist.addAll(ModuleExNihiloOmnia.EXISTING_ORES);
		}
		return ret;
	}

	@Override
	public void init() {
		for(IOreEntry entry : JAOPCAApi.ENTRY_NAME_TO_ORES_MAP.get("oreNetherBroken")) {
			ModuleExNihiloOmnia.addOreSieveRecipe(ENOBlocks.GRAVEL_NETHER, Utils.getOreStack("oreNetherBroken", entry, 1), Utils.rarityReciprocalI(entry, 15D)+2);

			if(ENOCompatibility.add_smeltery_melting && Loader.isModLoaded("tconstruct") && FluidRegistry.isFluidRegistered(Utils.to_under_score(entry.getOreName()))) {
				ModuleTinkersConstruct.addMeltingRecipe("oreNetherBroken"+entry.getOreName(), FluidRegistry.getFluid(Utils.to_under_score(entry.getOreName())), 36);
			}
		}

		for(IOreEntry entry : JAOPCAApi.ENTRY_NAME_TO_ORES_MAP.get("oreNetherGravel")) {
			Utils.addShapelessOreRecipe(Utils.getOreStack("oreNetherGravel", entry, 1), new Object[] {
					"oreNetherBroken"+entry.getOreName(),
					"oreNetherBroken"+entry.getOreName(),
					"oreNetherBroken"+entry.getOreName(),
					"oreNetherBroken"+entry.getOreName(),
			});

			Utils.addSmelting(Utils.getOreStack("oreNetherGravel", entry, 1), Utils.getOreStack("ingot", entry, 1), 0);

			ModuleExNihiloOmnia.addOreHammerRecipe(JAOPCAApi.BLOCKS_TABLE.get("oreNetherGravel", entry.getOreName()), Utils.getOreStack("oreCrushed", entry, 1));

			if(ENOCompatibility.add_smeltery_melting && Loader.isModLoaded("tconstruct") && FluidRegistry.isFluidRegistered(Utils.to_under_score(entry.getOreName()))) {
				ModuleTinkersConstruct.addMeltingRecipe("oreNetherGravel"+entry.getOreName(), FluidRegistry.getFluid(Utils.to_under_score(entry.getOreName())), 144);
			}

			if(ENOCompatibility.aa_crusher && Loader.isModLoaded("actuallyadditions")) {
				ModuleExNihiloOmnia.addActuallyAdditionsCrusherRecipe(Utils.getOreStack("oreNetherGravel", entry, 1), Utils.getOreStack("oreCrushed", entry, 5), Utils.getOreStack("oreCrushed", entry, 2), 30);
			}

			if(ENOCompatibility.mekanism_crusher && Loader.isModLoaded("Mekanism")) {
				ModuleMekanism.addCrusherRecipe(Utils.getOreStack("oreNetherGravel", entry, 1), Utils.getOreStack("oreCrushed", entry, 6));
			}

			if(ENOCompatibility.sag_mill && Loader.isModLoaded("EnderIO")) {
				ModuleExNihiloOmnia.addOreSAGMillRecipe("oreNetherGravel"+entry.getOreName(), "oreCrushed"+entry.getOreName());
			}
		}
	}*/
}
