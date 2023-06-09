package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ApprenticeSword
{
    public static ItemStack apprenticeSword;

    public static void init () {
        createApprenticeSword();
    }

    /**
     * Creates a sharpness 2 iron sword called "Apprentice Sword"
     * <p>
     * Crafted with 2 redstone blocks and an iron sword
     * <p>
     * This sword is intended to be easy to craft so that
     * you can have a decent weapon even if you don't find many resources
     */
    private static void createApprenticeSword () {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Apprentice Sword");

        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, false);
        item.setItemMeta(meta);
        apprenticeSword = item;

        // Adds the recipe for the Apprentice Sword
        // Can be crafted in any of the 3 columns

        // Left column
        ShapedRecipe leftColSR = new ShapedRecipe(NamespacedKey.minecraft("apprentice_sword_left"), item);
        leftColSR.shape("R  ", "I  ", "R  ");
        leftColSR.setIngredient('R', Material.REDSTONE_BLOCK);
        leftColSR.setIngredient('I', Material.IRON_SWORD);
        Bukkit.getServer().addRecipe(leftColSR);

        // Middle column
        ShapedRecipe midColSR = new ShapedRecipe(NamespacedKey.minecraft("apprentice_sword_mid"), item);

        midColSR.shape(" R ", " I ", " R ");
        midColSR.setIngredient('R', Material.REDSTONE_BLOCK);
        midColSR.setIngredient('I', Material.IRON_SWORD);
        Bukkit.getServer().addRecipe(midColSR);

        // Right column
        ShapedRecipe rightColSR = new ShapedRecipe(NamespacedKey.minecraft("apprentice_sword_right"), item);
        rightColSR.shape("  R", "  I", "  R");
        rightColSR.setIngredient('R', Material.REDSTONE_BLOCK);
        rightColSR.setIngredient('I', Material.IRON_SWORD);
        Bukkit.getServer().addRecipe(rightColSR);

        // Sets the group for all 3 recipes
        leftColSR.setGroup("apprentice_sword");
        midColSR.setGroup("apprentice_sword");
        rightColSR.setGroup("apprentice_sword");
    }
}
