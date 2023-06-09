package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;

public class ApprenticeHelmet
{
    public static ItemStack apprenticeHelmet;

    public static void init() {
        createApprenticeHelmet();
    }

    // Creates the Apprentice Helmet item
    private static void createApprenticeHelmet(){
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Apprentice Helmet");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, false);
        
        item.setItemMeta(meta);
        apprenticeHelmet = item;

        // Creates the crafting recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("apprentice_helmet"), item);
        sr.shape("III", "ITI", "   ");
        sr.setIngredient('I', Material.IRON_INGOT);
        sr.setIngredient('T', Material.REDSTONE_TORCH);
        Bukkit.getServer().addRecipe(sr);

        // Alternate recipe (so it works in the bottom part of the crafting table)
        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("apprentice_helmet_alt"), item);
        sr2.shape("   ", "III", "ITI");
        sr2.setIngredient('I', Material.IRON_INGOT);
        sr2.setIngredient('T', Material.REDSTONE_TORCH);
        Bukkit.getServer().addRecipe(sr2);

        sr.setGroup("apprentice_helmet");
        sr2.setGroup("apprentice_helmet");


    }
}
