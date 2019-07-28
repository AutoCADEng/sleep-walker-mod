package boi.eng.bad.sleepwalker.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import boi.eng.bad.sleepwalker.misc.CreativeTabs;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("sleepwalkermod")
public class SleepWalker {
	
	
	public static String modid="sleepwalkermod";
	public static final Logger logger= LogManager.getLogger(modid);
	public static SleepWalker instance;
	public static CreativeTabs cTab= new CreativeTabs();
	public static DimensionType dim;
	public SleepWalker() {
		instance=this;
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistrys);
		MinecraftForge.EVENT_BUS.register(this);
		
		
		}
	//Common Setup Event
	private void setup(final FMLCommonSetupEvent event) {
	}
	
	//Client Setup Event
	private void clientRegistrys(final FMLClientSetupEvent event) {

	}
}
