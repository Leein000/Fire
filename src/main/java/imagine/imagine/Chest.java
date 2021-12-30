package imagine.imagine;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.Random;

public class Chest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {

        if (sender instanceof Player) {

            Player p = (Player) sender;
            Random r = new Random();

            for (int i = 0; i < 8; i++) {
            Firework firework = p.getWorld().spawn(p.getLocation().add(r.nextInt(3), -3, r.nextInt(3)), Firework.class);
            FireworkMeta meta = firework.getFireworkMeta();

            meta.addEffect(FireworkEffect.builder().withColor(Color.GREEN).with(FireworkEffect.Type.STAR).withFlicker().build());
            firework.setFireworkMeta(meta);

        }

        return false;
    }
}