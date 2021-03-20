package com.github.chal2andev.survivalplus.plugin

import org.bukkit.plugin.java.JavaPlugin


class SurvivalPlusPlugin: JavaPlugin(){

    override fun onEnable() {
        LoadData.loadConfig()
    }

    override fun onDisable() {
        LoadData.saveConfig()
    }


}