package io.github.esoccoli.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class DragonSword
{
    public static ItemStack dragonSword;

    public static void init() {
        createDragonSword();
    }
    private static void createDragonSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Dragon Sword");

        // Give the sword an attribute modifier that makes it have exactly 8 attack damage and 1.6 attack speed
        AttributeModifier attackDamage = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 8, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier attackSpeed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", -2.4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attackDamage);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, attackSpeed);

        item.setItemMeta(meta);
        dragonSword = item;

        // Creates the crafting recipe
        ShapedRecipe sword = new ShapedRecipe(NamespacedKey.minecraft("dragon_sword"), item);
        sword.shape(" B ", " D ", "OBO");
        sword.setIngredient('B', Material.BLAZE_POWDER);
        sword.setIngredient('D', Material.DIAMOND_SWORD);
        sword.setIngredient('O', Material.OBSIDIAN);

        Bukkit.getServer().addRecipe(sword);
    }
}