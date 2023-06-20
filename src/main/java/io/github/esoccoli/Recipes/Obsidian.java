package io.github.esoccoli.Recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class Obsidian
{
    public static ItemStack obsidian;

    public static void init() {
        createObsidianRecipe();
    }

    private static void createObsidianRecipe(){
        obsidian = new ItemStack(Material.OBSIDIAN, 1);
        ShapelessRecipe recipe = new ShapelessRecipe(NamespacedKey.minecraft("obsidian"), obsidian);
        recipe.addIngredient(Material.LAVA_BUCKET);
        recipe.addIngredient(Material.WATER_BUCKET);
        recipe.setGroup("obsidian");

        Bukkit.getServer().addRecipe(recipe);
    }
}
