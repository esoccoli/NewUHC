package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class PowerBook
{
    public static ItemStack powerBook;

    public static void init() {
        createPowerBook();
    }

    private static void createPowerBook() {
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Book of Power");
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, false);
        item.setItemMeta(meta);

        PowerBook.powerBook = item;

        ShapedRecipe powerBook = new ShapedRecipe(NamespacedKey.minecraft("power_book"), item);

        powerBook.shape("F  ", " PP", " PB");
        powerBook.setIngredient('F', Material.FLINT);
        powerBook.setIngredient('P', Material.PAPER);
        powerBook.setIngredient('B', Material.BONE);

        powerBook.setGroup("power_book");

        Bukkit.getServer().addRecipe(powerBook);
    }
}
