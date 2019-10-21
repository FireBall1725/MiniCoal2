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

package cafireball1725.mods.minicoal2.common;

import cafireball1725.mods.minicoal2.items.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Groups {
  public ItemGroup itemGroup = new ItemGroup("minicoal2") {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(Items.MINICOAL.getItem());
    }
  };
}
