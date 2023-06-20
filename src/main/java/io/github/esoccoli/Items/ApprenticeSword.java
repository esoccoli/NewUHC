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
        ShapedRecipe app_sword_left = new ShapedRecipe(NamespacedKey.minecraft("apprentice_sword_left"), item);
        app_sword_left.shape("R  ", "I  ", "R  ");
        app_sword_left.setIngredient('R', Material.REDSTONE_BLOCK);
        app_sword_left.setIngredient('I', Material.IRON_SWORD);

        app_sword_left.setGroup("apprentice_sword");
        Bukkit.getServer().addRecipe(app_sword_left);

        // Middle column
        ShapedRecipe app_sword_middle = new ShapedRecipe(NamespacedKey.minecraft("apprentice_sword_middle"), item);

        app_sword_middle.shape(" R ", " I ", " R ");
        app_sword_middle.setIngredient('R', Material.REDSTONE_BLOCK);
        app_sword_middle.setIngredient('I', Material.IRON_SWORD);

        app_sword_middle.setGroup("apprentice_sword");
        Bukkit.getServer().addRecipe(app_sword_middle);

        // Right column
        ShapedRecipe app_sword_right = new ShapedRecipe(NamespacedKey.minecraft("apprentice_sword_right"), item);
        app_sword_right.shape("  R", "  I", "  R");
        app_sword_right.setIngredient('R', Material.REDSTONE_BLOCK);
        app_sword_right.setIngredient('I', Material.IRON_SWORD);

        app_sword_right.setGroup("apprentice_sword");
        Bukkit.getServer().addRecipe(app_sword_right);
    }
}
