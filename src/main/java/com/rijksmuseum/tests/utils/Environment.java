package com.rijksmuseum.tests.utils;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:application.properties"})
public interface Environment extends Config {
    @Key("uri")
    String uri();

    @Key("param.key")
    String getKey();

    @Key("localization")
    String localization();
}
