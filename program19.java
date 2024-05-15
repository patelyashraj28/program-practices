import java.awt.Graphics; 

 

public class AppletLifeCycleDemo extends Applet { 

     

    public void init() { 

        System.out.println("Init method is called"); 

    } 

 

    public void start() { 

        System.out.println("Start method is called"); 

    } 

 

    public void paint(Graphics g) { 

        System.out.println("Paint method is called"); 

        g.drawString("Hello from Applet", 20, 20); 

    } 

 

    public void stop() { 

        System.out.println("Stop method is called"); 

    } 

 

    public void destroy() { 

        System.out.println("Destroy method is called"); 

    } 

} 