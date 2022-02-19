package cn.zhicheng233.cloudy.gui;

import cn.zhicheng233.cloudy.Cloudy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.resources.I18n;
import org.lwjgl.opengl.GL11;

import java.io.IOException;
//Cloudy Client 仿Jello的主菜单

public class MainScreen extends GuiScreen {

    @Override
    public void initGui() {

        int i = 24;
        int j = this.height / 4 + 48;

        this.addSingleplayerMultiplayerButtons(j, 24);

        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, j + 72 + 12, 98, 20, I18n.format("menu.options", new Object[0])));
        this.buttonList.add(new GuiButton(4, this.width / 2 + 2, j + 72 + 12, 98, 20, I18n.format("menu.quit", new Object[0])));
        this.buttonList.add(new GuiButtonLanguage(5, this.width / 2 - 124, j + 72 + 12));
        super.initGui();
    }

    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.id == 0) {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }


        if (button.id == 1) {
            this.mc.displayGuiScreen(new GuiSelectWorld(this));
        }

        if (button.id == 2) {
            this.mc.displayGuiScreen(new GuiMultiplayer(this));
        }


        if (button.id == 4) {
            this.mc.shutdown();
        }


    }

    private void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_) {


        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, p_73969_1_, I18n.format("menu.singleplayer", new Object[0])));
        this.buttonList.add(new GuiButton(2, this.width / 2 - 100, p_73969_1_ + p_73969_2_ * 1, I18n.format("menu.multiplayer", new Object[0])));

    }

    private final ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());

    //Cloudy Client 绘制主菜单标题
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawBackground(0);
        GL11.glScaled(2.0, 2.0, 2.0);
        mc.fontRendererObj.drawString(Cloudy.instance.name, sr.getScaledWidth() / 2 - mc.fontRendererObj.getStringWidth(Cloudy.instance.name) / 2, sr.getScaledHeight() / 2 - mc.fontRendererObj.FONT_HEIGHT / 2, 0xFFFFFF);
        GL11.glScaled(0.5, 0.5, 0.5);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
