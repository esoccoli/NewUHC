package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;

public class ApprenticeBow
{
    public static ItemStack apprenticeBow;

    public static void init() {
        createApprenticeBow();
    }

    /**
     * Creates a helmet with protection 1 on all types of damage
     * <p>
     * Crafted with 5 iron ingots and a redstone torch
     * <p>
     * This helmet is intended to be easy to craft and slightly better than
     * a normal iron helmet
     */
    private static void createApprenticeBow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Apprentice Bow");
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 2, false);

        item.setItemMeta(meta);
        apprenticeBow = item;

        // Creates the crafting recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("apprentice_bow"), item);
        sr.shape(" RS", "R S", " RS");
        sr.setIngredient('S', Material.STRING);
        sr.setIngredient('R', Material.REDSTONE_TORCH);
        Bukkit.getServer().addRecipe(sr);
    }
}
