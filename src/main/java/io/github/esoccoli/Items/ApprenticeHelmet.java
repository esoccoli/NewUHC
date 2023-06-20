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

    /**
     * Creates a helmet with protection 1 on all types of damage
     * <p>
     * Crafted with 5 iron ingots and a redstone torch
     * <p>
     * This helmet is intended to be easy to craft and slightly better than
     * a normal iron helmet
     */
    private static void createApprenticeHelmet() {
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
        ShapedRecipe app_helm_top = new ShapedRecipe(NamespacedKey.minecraft("apprentice_helmet_top"), item);
        app_helm_top.shape("III", "ITI", "   ");
        app_helm_top.setIngredient('I', Material.IRON_INGOT);
        app_helm_top.setIngredient('T', Material.REDSTONE_TORCH);


        // Alternate recipe (so it works in the bottom part of the crafting table)
        ShapedRecipe app_helm_bottom = new ShapedRecipe(NamespacedKey.minecraft("apprentice_helmet_bottom"), item);
        app_helm_bottom.shape("   ", "III", "ITI");
        app_helm_bottom.setIngredient('I', Material.IRON_INGOT);
        app_helm_bottom.setIngredient('T', Material.REDSTONE_TORCH);


        app_helm_top.setGroup("apprentice_helmet");
        app_helm_bottom.setGroup("apprentice_helmet");

        Bukkit.getServer().addRecipe(app_helm_top);
        Bukkit.getServer().addRecipe(app_helm_bottom);

    }
}
