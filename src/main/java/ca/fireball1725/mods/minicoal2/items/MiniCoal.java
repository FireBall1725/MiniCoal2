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

package ca.fireball1725.mods.minicoal2.items;

import ca.fireball1725.mods.minicoal2.MiniCoal2;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MiniCoal extends Item {
  public MiniCoal() {
    super (new Item.Properties()
      .group(MiniCoal2.groups.itemGroup)
    );
    setRegistryName("minicoal");
  }

  @Override
  public int getBurnTime(ItemStack itemStack) {
    return 200;
  }
}