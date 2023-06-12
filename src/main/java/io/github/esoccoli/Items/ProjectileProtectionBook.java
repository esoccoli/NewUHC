package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ProjectileProtectionBook
{
    public static ItemStack projProtBook;

    public static void init() {
        createProjProtBook();
    }

    private static void createProjProtBook(){
        ItemStack item = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("Artemis' Book");
        meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, false);
        item.setItemMeta(meta);

        ShapedRecipe projProtBook = new ShapedRecipe(NamespacedKey.minecraft("artemis_book_top"), item);
        projProtBook.shape("PP ", "PA ", "   ");
        projProtBook.setIngredient('P', Material.PAPER);
        projProtBook.setIngredient('A', Material.ARROW);

        projProtBook.setGroup("artemis_book");
        Bukkit.getServer().addRecipe(projProtBook);

        projProtBook = new ShapedRecipe(NamespacedKey.minecraft("artemis_book_bottom"), item);
        projProtBook.shape("   ", " PP", " PA");
        projProtBook.setIngredient('P', Material.PAPER);
        projProtBook.setIngredient('A', Material.ARROW);

        projProtBook.setGroup("artemis_book");
        Bukkit.getServer().addRecipe(projProtBook);
    }
}
