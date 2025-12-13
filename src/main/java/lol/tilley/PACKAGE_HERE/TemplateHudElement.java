package lol.tilley.PACKAGE_HERE;

import org.rusherhack.client.api.feature.hud.TextHudElement;

public class TemplateHudElement extends TextHudElement {

    public TemplateHudElement() {
        super("TemplateHudElement");
    }

    @Override
    public String getText () {
        return "text";
    }

}
