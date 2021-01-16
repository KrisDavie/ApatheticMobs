package whizzball1.apatheticmobs.handlers;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
// import net.minecraft.entity.ai.EntityAIAttackRanged;
// import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
// import net.minecraft.entity.ai.EntityAITasks;
// import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.WitherEntity;
import whizzball1.apatheticmobs.ApatheticMobs;
import whizzball1.apatheticmobs.config.ApatheticConfig;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class WitherHandler {

    // public static Map<UUID, WitherHandler> handlers = new HashMap<>();
    // int tickCount = 0;

    // public WitherEntity wither;

    // public WitherHandler(WitherEntity e) {
    // wither = e;
    // if (!ApatheticConfig.BOSS.witherRevenge.get()) {
    // wither.tasks.taskEntries.removeIf(t -> t.action instanceof
    // EntityAIAttackRanged);
    // wither.targetTasks.taskEntries.removeIf(t -> t.action instanceof
    // EntityAINearestAttackableTarget);
    // }
    // if (!ApatheticConfig.BOSS.witherAttacks.get()) {
    // wither.NOT_UNDEAD = t -> false;
    // }
    // }

    // public static void createNewHandler(WitherEntity e) {
    // UUID id = e.getUniqueID();
    // if (handlers.containsKey(id))
    // return;
    // handlers.put(id, new WitherHandler(e));
    // }

    // public static void removeHandler(WitherEntity e) {
    // ApatheticMobs.logger.info("removing dragon Handler!");
    // WitherHandler handler = handlers.get(e.getUniqueID());
    // handlers.remove(e.getUniqueID());
    // if (!(handler == null))
    // handler.removeWither();
    // }

    // public void removeWither() {
    // this.wither = null;
    // }

    // public void tick() {
    // for (int i = 1; i < 3; ++i) {
    // wither.updateWatchedTargetId(i, 0);
    // wither.idleHeadUpdates[i - 1] = 0;
    // }
    // wither.setAttackTarget(null);
    // tickCount++;
    // if (tickCount == 8) {
    // for (EntityAITasks.EntityAITaskEntry et : wither.tasks.taskEntries) {
    // if (et.action instanceof EntityAIAttackRanged) {
    // ((EntityAIAttackRanged) et.action).resetTask();
    // }
    // }
    // }
    // }
}