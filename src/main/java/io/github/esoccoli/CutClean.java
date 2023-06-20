package io.github.esoccoli;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

import static org.bukkit.Registry.MATERIAL;

public class CutClean implements Listener
{
    private Random rand = new Random();
    @EventHandler
    public void onBreakBlock(BlockBreakEvent event) {
        if (event.getBlock().getType() == Material.IRON_ORE || event.getBlock().getType() == Material.DEEPSLATE_IRON_ORE) {
            event.getBlock().getDrops().clear();
            event.getBlock().getDrops().add(new ItemStack(Material.IRON_INGOT, 1));
            event.getPlayer().giveExp(1);
        }
        else if (event.getBlock().getType() == Material.GOLD_ORE || event.getBlock().getType() == Material.DEEPSLATE_GOLD_ORE) {
            event.getBlock().getDrops().clear();
            event.getBlock().getDrops().add(new ItemStack(Material.GOLD_INGOT, 1));
            event.getPlayer().giveExp(1);
        }
        else if (event.getBlock().getType() == Material.COPPER_ORE || event.getBlock().getType() == Material.DEEPSLATE_COPPER_ORE) {
            event.getBlock().getDrops().clear();
            event.getBlock().getDrops().add(new ItemStack(Material.COPPER_INGOT, 1));
            event.getPlayer().giveExp(1);
        }
    }

    @EventHandler
    public void onKillAnimal(EntityDeathEvent event){
        if (event.getEntity().getType() == EntityType.PIG || event.getEntity().getType() == EntityType.HOGLIN) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.COOKED_PORKCHOP, rand.nextInt(1, 4)));
        }

        if (event.getEntity().getType() == EntityType.COW || event.getEntity().getType() == EntityType.MUSHROOM_COW) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.COOKED_BEEF, rand.nextInt(1, 4)));
            event.getDrops().add(new ItemStack(Material.LEATHER, rand.nextInt(1, 3)));
        }

        if (event.getEntity().getType() == EntityType.SHEEP) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.COOKED_MUTTON, rand.nextInt(1, 4)));
            event.getDrops().add(new ItemStack(Material.WHITE_WOOL, rand.nextInt(1, 3)));
        }

        if (event.getEntity().getType() == EntityType.CHICKEN) {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(Material.COOKED_CHICKEN, rand.nextInt(1, 4)));
            event.getDrops().add(new ItemStack(Material.FEATHER, rand.nextInt(1, 3)));
        }
    }
}

