package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class SharpnessBook
{
    public static ItemStack sharpnessBook;

    public static void init() {
        createSharpnessBook();
    }

    private static void createSharpnessBook() {
        ItemStack item = new ItemStack(Material.BOOK, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Book of Sharpening");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        item.setItemMeta(meta);

        sharpnessBook = item;

        ShapedRecipe sharpBook = new ShapedRecipe(NamespacedKey.minecraft("sharpness_book"), item);

        sharpBook.shape("F  ", " PP", " PI");
        sharpBook.setIngredient('F', Material.FLINT);
        sharpBook.setIngredient('P', Material.PAPER);
        sharpBook.setIngredient('I', Material.IRON_SWORD);

        sharpBook.setGroup("sharpness_book");

        Bukkit.getServer().addRecipe(sharpBook);
    }
}
