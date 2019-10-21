/*
 * MiniCoal2
 * Copyright (C) 2019 Erin Reed (FireBall1725)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package cafireball1725.mods.minicoal2;

import cafireball1725.mods.minicoal2.common.Groups;
import cafireball1725.mods.minicoal2.items.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("minicoal2")
public class MiniCoal2 {
  public static Groups groups = new Groups();

  @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
  public static class RegistryEvents {
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
      Items.registerItems(event);
    }
  }
}

