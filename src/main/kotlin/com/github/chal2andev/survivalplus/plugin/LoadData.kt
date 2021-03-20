package com.github.chal2andev.survivalplus.plugin

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

object LoadData {
    val data: File = File(SurvivalPlusPlugin().dataFolder, "players.yml")
    val loadData: FileConfiguration = YamlConfiguration.loadConfiguration(data)

    fun loadConfig(){
        data.createNewFile()
        saveConfig()
    }
    fun saveConfig(){
        loadData.save(data)
    }
}