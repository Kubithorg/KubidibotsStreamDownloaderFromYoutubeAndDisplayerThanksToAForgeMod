package fr.kubithon.kubidibotsstreamdownloaderfromyoutubeanddisplayerthankstoaforgemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * File <b>Streamer</b> located on fr.kubithon.kubidibotsstreamdownloaderfromyoutubeanddisplayerthankstoaforgemod
 * Streamer is a part of kubidibotsstreamdownloaderfromyoutubeanddisplayerthankstoaforgemod.
 * <p>
 * kubidibotsstreamdownloaderfromyoutubeanddisplayerthankstoaforgemod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details (COPYING).
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 * AssetsBuilder is a free software: See the GNU Lesser General
 * Public License for more details (LICENSE file)
 *
 * @author xharos, {@literal <valentin.burgaud@yahoo.fr>}
 * Created the 30/10/17 at 14:20
 * @since 0.0.1
 */
@Mod(modid = "streamer", name = "Kubithon - KubidibotsStreamDownloaderFromYoutubeAndDisplayerThanksToAForgeMod", version = "0.0.1", clientSideOnly = true)
public class Streamer {

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Start mod :)");
    }

}
