package sdfsdf.ssdfsdf.item;


import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sdfsdf.ssdfsdf.util.Reference;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class RegisterItem {

    static Item itemtest;
    //static Item itemtest2;

    public static void init() {
        itemtest = new ItemBasic("itemtest");
        //itemtest2 = new ItemBasic("itemtest2");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemtest);
        //event.getReigstry().registerAll(itemtest2);
    }
}