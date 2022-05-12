package com.rijksmuseum.tests.utils;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:prod.properties"})
public interface Environment extends Config {
    String uri();

    @Key("param.key")
    String getKey();
}
