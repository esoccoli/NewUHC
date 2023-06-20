package io.github.esoccoli.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class String
{
    public static ItemStack string;

    public static void init() {
        createStringRecipe();
    }

    private static void createStringRecipe(){
        string = new ItemStack(Material.STRING, 1);
        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("string"), string);
        recipe.shape("WW", "WW");
        recipe.setIngredient('W', Material.WHITE_WOOL);
        recipe.setGroup("string");
        Bukkit.getServer().addRecipe(recipe);
    }
}
