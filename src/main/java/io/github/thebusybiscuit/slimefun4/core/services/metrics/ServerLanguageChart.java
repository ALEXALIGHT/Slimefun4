package io.github.thebusybiscuit.slimefun4.core.services.metrics;

import org.bstats.bukkit.Metrics.SimplePie;

import io.github.thebusybiscuit.slimefun4.core.services.localization.Language;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;

class ServerLanguageChart extends SimplePie {

    ServerLanguageChart() {
        super("language", () -> {
            Language language = SlimefunPlugin.getLocalization().getDefaultLanguage();
            boolean supported = SlimefunPlugin.getLocalization().isLanguageLoaded(language.getId());
            return supported ? language.getId() : "Unsupported Language";
        });
    }

}
