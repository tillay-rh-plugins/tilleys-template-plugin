package lol.tilley;

import org.rusherhack.client.api.feature.hud.TextHudElement;

public class TemplateHudElement extends TextHudElement {

    public TemplateHudElement() {
        super("templatehud");
    }

    @Override
    public String getText () {
        return "text";
    }

}
