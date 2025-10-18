package com.warren.example

// import com.warren.bt.*
import com.warren.bt.BehaviorScript
import com.warren.bt.BehaviorTree
import com.warren.bt.PowBehaviorTree
import com.warren.bt.Status
import org.powbot.api.rt4.Npc
import org.powbot.api.rt4.Npcs
import org.powbot.api.script.AbstractScript
import org.powbot.api.script.ScriptManifest

@ScriptManifest(
    name = "ExampleScript", description = "An example behavior script", version = "1.0.0", author = "Warren"
)
class ExampleScript : BehaviorScript() {
    override fun behaviorTree(): BehaviorTree {
        return PowBehaviorTree.build {
            sequence {
                succeed { logger.info("Hello, world") }
            }
        }
    }
}

fun main() {
    ExampleScript().startScript()
}
