package eekysam.festivities.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eekysam.festivities.Festivities;
import net.minecraft.item.ItemRecord;

public class ItemChristmasRecord extends ItemRecord {

		public ItemChristmasRecord(int id, String recordName)
                {
                    super(id, recordName);
                    this.setCreativeTab(Festivities.miscTab);
                    this.maxStackSize = 1;
                }
                
                @SideOnly(Side.CLIENT)
                public String getRecordTitle()
                {
                    return "We Wish You a Merry Christmas";
                }
}
