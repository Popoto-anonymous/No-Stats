package nostats;

import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.EquipmentTypes;
import legend.game.inventory.GatherEquipmentTypesEvent;
import legend.game.inventory.screens.ShopScreen;
import legend.game.modding.events.inventory.ShopContentsEvent;
import org.legendofdragoon.modloader.Mod;
import org.legendofdragoon.modloader.events.EventListener;
import org.legendofdragoon.modloader.registries.RegistryId;

import static legend.core.GameEngine.EVENTS;

@Mod(id = nostats.MOD_ID, version = "^3.0.0")
public class nostats {
  public static final String MOD_ID = "nostats";

  public nostats() {
    EVENTS.register(this);
  }

  public static RegistryId id(final String entryId) {
    return new RegistryId(MOD_ID, entryId);
  }

  @EventListener
  public void registerEquipments(final EquipmentRegistryEvent event) {Equipments.register(event);}

  @EventListener
  public void shopEquipmentEvent(final ShopContentsEvent event) {
    if(event.shop.shopType_00 == 1) return;

    switch(event.shop.getRegistryId().entryId()) {
      case "bale_equipment_shop", "lohan_equipment_shop", "kazas_equipment_shop", "fletz_equipment_shop", "donau_equipment_shop", "queen_fury_equipment_shop", "fueno_equipment_shop" -> {
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROKEN_SWORD.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SPEAR_SHAFT.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STRINGLESS_BOW.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CHIPPED_RAPIER.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BARE_KNUCKLES.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HEADLESS_HAMMER.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CLUB.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TATTERED_BANDANA.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DENTED_HELM.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FILTHY_SCRUNCHIE.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WORN_HAIRBAND.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.RAGGED_HEADBAND.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WORN_HAIRBAND.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FADED_FACE_PAINT.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.PUNCTURED_ARMOR.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.RUSTY_ARMOR.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DIRTY_CLOTHES.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.OLD_CLOTHES.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WELL_WORN_GI.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SWEAT_STAINED_TOP.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROKEN_PAULDRON.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DESTROYED_SHOES.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.MISSING_GREAVE.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STINKY_SOCKS.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WORNOUT_BOOTS.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HOLEY_SHOES.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TORN_SHOES.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ROTTING_FUR_BOOTS.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TAINTED_ARMBAND.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROKEN_SIGNET.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TARNISHED_RING.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ANCIENT_CHOKER.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LUCKY_CHARM.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.AGING_BELL.get(), 1));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROTHERS_MEMENTO.get(), 1));
      }
      case "furni_equipment_shop", "deningrad_equipment_shop", "wingly_forest_equipment_shop", "kashua_equipment_shop", "vellweb_equipment_shop", "rouge_equipment_shop", "zenebatos_equipment_shop", "moon_equipment_shop" -> {
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROKEN_SWORD_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SPEAR_SHAFT_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STRINGLESS_BOW_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CHIPPED_RAPIER_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BARE_KNUCKLES_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HEADLESS_HAMMER_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.CLUB_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TATTERED_BANDANA_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DENTED_HELM_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FILTHY_SCRUNCHIE_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WORN_HAIRBAND_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.RAGGED_HEADBAND_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WORN_HAIRBAND_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.FADED_FACE_PAINT_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.PUNCTURED_ARMOR_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.RUSTY_ARMOR_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DIRTY_CLOTHES_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.OLD_CLOTHES_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WELL_WORN_GI_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SWEAT_STAINED_TOP_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROKEN_PAULDRON_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DESTROYED_SHOES_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.MISSING_GREAVE_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.STINKY_SOCKS_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.WORNOUT_BOOTS_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.HOLEY_SHOES_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TORN_SHOES_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ROTTING_FUR_BOOTS_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TAINTED_ARMBAND_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROKEN_SIGNET_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TARNISHED_RING_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.ANCIENT_CHOKER_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.LUCKY_CHARM_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.AGING_BELL_PLUS.get(), 10));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.BROTHERS_MEMENTO_PLUS.get(), 10));
      }
    }
  }

  @EventListener
  public void gatherEquipmentTypes(final GatherEquipmentTypesEvent event) {
    event.add(Equipments.BROKEN_SWORD.get(), EquipmentTypes.DART);
    event.add(Equipments.BROKEN_SWORD_PLUS.get(), EquipmentTypes.DART);
    event.add(Equipments.TATTERED_BANDANA.get(), EquipmentTypes.DART);
    event.add(Equipments.TATTERED_BANDANA_PLUS.get(), EquipmentTypes.DART);
    event.add(Equipments.PUNCTURED_ARMOR.get(), EquipmentTypes.DART);
    event.add(Equipments.PUNCTURED_ARMOR_PLUS.get(), EquipmentTypes.DART);
    event.add(Equipments.DESTROYED_SHOES.get(), EquipmentTypes.DART);
    event.add(Equipments.DESTROYED_SHOES_PLUS.get(), EquipmentTypes.DART);
    event.add(Equipments.TAINTED_ARMBAND.get(), EquipmentTypes.DART);
    event.add(Equipments.TAINTED_ARMBAND_PLUS.get(), EquipmentTypes.DART);
    event.add(Equipments.SPEAR_SHAFT.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.SPEAR_SHAFT_PLUS.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.DENTED_HELM.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.DENTED_HELM_PLUS.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.RUSTY_ARMOR.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.RUSTY_ARMOR_PLUS.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.MISSING_GREAVE.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.MISSING_GREAVE_PLUS.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.BROKEN_SIGNET.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.BROKEN_SIGNET_PLUS.get(), EquipmentTypes.LAVITZ, EquipmentTypes.ALBERT);
    event.add(Equipments.STRINGLESS_BOW.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.STRINGLESS_BOW_PLUS.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.FILTHY_SCRUNCHIE.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.FILTHY_SCRUNCHIE_PLUS.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.DIRTY_CLOTHES.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.DIRTY_CLOTHES_PLUS.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.STINKY_SOCKS.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.STINKY_SOCKS_PLUS.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.TARNISHED_RING.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.TARNISHED_RING_PLUS.get(), EquipmentTypes.SHANA, EquipmentTypes.MIRANDA);
    event.add(Equipments.CHIPPED_RAPIER.get(), EquipmentTypes.ROSE);
    event.add(Equipments.CHIPPED_RAPIER_PLUS.get(), EquipmentTypes.ROSE);
    event.add(Equipments.WORN_HAIRBAND.get(), EquipmentTypes.ROSE);
    event.add(Equipments.WORN_HAIRBAND_PLUS.get(), EquipmentTypes.ROSE);
    event.add(Equipments.OLD_CLOTHES.get(), EquipmentTypes.ROSE);
    event.add(Equipments.OLD_CLOTHES_PLUS.get(), EquipmentTypes.ROSE);
    event.add(Equipments.WORNOUT_BOOTS.get(), EquipmentTypes.ROSE);
    event.add(Equipments.WORNOUT_BOOTS_PLUS.get(), EquipmentTypes.ROSE);
    event.add(Equipments.ANCIENT_CHOKER.get(), EquipmentTypes.ROSE);
    event.add(Equipments.ANCIENT_CHOKER_PLUS.get(), EquipmentTypes.ROSE);
    event.add(Equipments.BARE_KNUCKLES.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.BARE_KNUCKLES_PLUS.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.RAGGED_HEADBAND.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.RAGGED_HEADBAND_PLUS.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.WELL_WORN_GI.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.WELL_WORN_GI_PLUS.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.HOLEY_SHOES.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.HOLEY_SHOES_PLUS.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.LUCKY_CHARM.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.LUCKY_CHARM_PLUS.get(), EquipmentTypes.HASCHEL);
    event.add(Equipments.HEADLESS_HAMMER.get(), EquipmentTypes.MERU);
    event.add(Equipments.HEADLESS_HAMMER_PLUS.get(), EquipmentTypes.MERU);
    event.add(Equipments.FRAYED_HAIRBOW.get(), EquipmentTypes.MERU);
    event.add(Equipments.FRAYED_HAIRBOW_PLUS.get(), EquipmentTypes.MERU);
    event.add(Equipments.SWEAT_STAINED_TOP.get(), EquipmentTypes.MERU);
    event.add(Equipments.SWEAT_STAINED_TOP_PLUS.get(), EquipmentTypes.MERU);
    event.add(Equipments.TORN_SHOES.get(), EquipmentTypes.MERU);
    event.add(Equipments.TORN_SHOES_PLUS.get(), EquipmentTypes.MERU);
    event.add(Equipments.AGING_BELL.get(), EquipmentTypes.MERU);
    event.add(Equipments.AGING_BELL_PLUS.get(), EquipmentTypes.MERU);
    event.add(Equipments.CLUB.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.CLUB_PLUS.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.FADED_FACE_PAINT.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.FADED_FACE_PAINT_PLUS.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.BROKEN_PAULDRON.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.BROKEN_PAULDRON_PLUS.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.ROTTING_FUR_BOOTS.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.ROTTING_FUR_BOOTS_PLUS.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.BROTHERS_MEMENTO.get(), EquipmentTypes.KONGOL);
    event.add(Equipments.BROTHERS_MEMENTO_PLUS.get(), EquipmentTypes.KONGOL);
  }
}