package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class VorpalSword
{
    public static ItemStack vorpalSword;

    public static void init() {
        createVorpalSword();
    }

    private static void createVorpalSword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("Vorpal Sword");
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 2, false);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 2, false);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, false);
        item.setItemMeta(meta);

        vorpalSword = item;

        ShapedRecipe vorpalSwordLeft = new ShapedRecipe(NamespacedKey.minecraft("vorpal_sword_left"), item);
        vorpalSwordLeft.shape("B  ", "I  ", "R  ");

        vorpalSwordLeft.setIngredient('B', Material.BONE);
        vorpalSwordLeft.setIngredient('I', Material.IRON_SWORD);
        vorpalSwordLeft.setIngredient('R', Material.ROTTEN_FLESH);

        ShapedRecipe vorpalSwordMid = new ShapedRecipe(NamespacedKey.minecraft("vorpal_sword_mid"), item);
        vorpalSwordMid.shape(" B ", " I ", " R ");

        vorpalSwordMid.setIngredient('B', Material.BONE);
        vorpalSwordMid.setIngredient('I', Material.IRON_SWORD);
        vorpalSwordMid.setIngredient('R', Material.ROTTEN_FLESH);

        ShapedRecipe vorpalSwordRight = new ShapedRecipe(NamespacedKey.minecraft("vorpal_sword_right"), item);
        vorpalSwordRight.shape("  B", "  I", "  R");

        vorpalSwordRight.setIngredient('B', Material.BONE);
        vorpalSwordRight.setIngredient('I', Material.IRON_SWORD);
        vorpalSwordRight.setIngredient('R', Material.ROTTEN_FLESH);

        vorpalSwordLeft.setGroup("vorpal_sword");
        vorpalSwordMid.setGroup("vorpal_sword");
        vorpalSwordRight.setGroup("vorpal_sword");

        Bukkit.getServer().addRecipe(vorpalSwordLeft);
        Bukkit.getServer().addRecipe(vorpalSwordMid);
        Bukkit.getServer().addRecipe(vorpalSwordRight);
    }
}
