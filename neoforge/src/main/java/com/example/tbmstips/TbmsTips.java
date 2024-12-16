package com.example.tbmstips;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class TbmsTips {

    public TbmsTips(IEventBus eventBus) {
        CommonClass.init();

    }
}