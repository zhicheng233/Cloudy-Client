package cn.zhicheng233.cloudy;


import org.lwjgl.opengl.Display;
import viamcp.ViaMCP;

public enum Cloudy {
    /**
     * ClientAbout
     */
    instance, recommended;

    public String name = "Cloudy";

    public String version = "B1";

    public void run() {
        //改标题
        Display.setTitle(name + " | " + version);

        //初始化Via
        try
        {
            ViaMCP.getInstance().start();
            ViaMCP.getInstance().initAsyncSlider(); // For top left aligned slider

            ViaMCP.getInstance().initAsyncSlider(110, 50, 110, 150 );

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void stop() {

        //打印文本
        System.out.println("Cloudy Client ：Thank you for using~ Goodbye~  |  Stop！");
        System.out.println("  ███████   █         ██████    ██      ██      █   █   █");
        System.out.println("██          █       ██      ██  ██      ██      █   █   █");
        System.out.println("██          █       ██      ██  ██      ██  █████   █████");
        System.out.println("██          █       ██      ██  ██      ██  █   █       █");
        System.out.println("  ███████   ███       ██████      ██████    █████   █████");
    }
}
