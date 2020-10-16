package io.github.mirajih.wafflemod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(WaffleMod.MODID)
public class WaffleMod {

    public static final String MODID = "wafflemod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public WaffleMod() {
        LOGGER.debug("WAFFLES");
    }
}
