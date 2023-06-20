package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ProtectionBook
{
    public static ItemStack protectionBook;

    public static void init() {
        createProtectionBook();
    }

    private static void createProtectionBook() {
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK, 1);

        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        meta.setDisplayName("Book of Protection");

        item.setItemMeta(meta);
        protectionBook = item;

        ShapedRecipe protectionBook = new ShapedRecipe(NamespacedKey.minecraft("protection_book_top"), item);
        protectionBook.shape("PP ", "PI ", "   ");
        protectionBook.setIngredient('P', Material.PAPER);
        protectionBook.setIngredient('I', Material.IRON_INGOT);

        protectionBook.setGroup("protection_book");
        Bukkit.getServer().addRecipe(protectionBook);

        ShapedRecipe protectionBook_alt = new ShapedRecipe(NamespacedKey.minecraft("protection_book_bottom"), item);
        protectionBook_alt.shape("   ", " PP", " PI");
        protectionBook_alt.setIngredient('P', Material.PAPER);
        protectionBook_alt.setIngredient('I', Material.IRON_INGOT);

        protectionBook_alt.setGroup("protection_book");
        Bukkit.getServer().addRecipe(protectionBook_alt);

    }
}
