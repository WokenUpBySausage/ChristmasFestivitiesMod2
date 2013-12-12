package eekysam.festivities.events;

import eekysam.festivities.Festivities;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler
{
    @ForgeSubscribe
    public void onSoundsLoaded (SoundLoadEvent event)
    {
        event.manager.soundPoolStreaming.addSound(Festivities.ID + ":WeWishYouAMerryChristmas.ogg");
    }
    
}
