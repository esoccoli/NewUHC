package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class LeatherEconomy
{
    public static ItemStack leatherEconomy;

    public static void init() {
        createLeatherEconomy();
    }

    private static void createLeatherEconomy(){
        ItemStack item = new ItemStack(Material.LEATHER, 8);
        leatherEconomy = item;

        ShapedRecipe leather_economy = new ShapedRecipe(NamespacedKey.minecraft("leather_economy"), item);
        leather_economy.shape("SLS", "SLS", "SLS");
        leather_economy.setIngredient('S', Material.STICK);
        leather_economy.setIngredient('L', Material.LEATHER);

        leather_economy.setGroup("leather_economy");
        // Add recipe to server
        Bukkit.getServer().addRecipe(leather_economy);
    }
}
