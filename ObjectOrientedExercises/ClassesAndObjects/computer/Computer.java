package computer;

/**
 *
 * @author vimago
 */
public class Computer {

    private String processor;
    private int memory;
    private String screen;
    private int hardDisk;

    private boolean on;
    private boolean screenSaverOn;

    public Computer(String processor, int memory, String screen, int hardDisk) {
        this.processor = processor;
        this.memory = memory;
        this.screen = screen;
        this.hardDisk = hardDisk;
        this.on = false;
        this.screenSaverOn = false;
    }

    public Computer() {
        this.on = false;
        this.screenSaverOn = false;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isScreenSaverOn() {
        return screenSaverOn;
    }

    public void setScreenSaverOn(boolean screenSaverOn) {
        this.screenSaverOn = screenSaverOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{");
        sb.append("processor=").append(processor);
        sb.append(", memory=").append(memory);
        sb.append(", screen=").append(screen);
        sb.append(", hardDisk=").append(hardDisk);
        sb.append(", on=").append(on);
        sb.append(", screenSaverOn=").append(screenSaverOn);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * Arrenca l'ordinador
     * @return true si té èxit, false si no
     */
    public boolean start() {
        boolean b = false;
        if (!on) {
            on = true;
            b = true;
        }
        return b;
    }
    
    /**
     * Apaga l'ordinador
     * @return false si té èxit, true si no
     */
    public boolean close() {
        boolean b = false;
        if (on) {
            on = false;
            b = false;
        }
        return b;
    }
    
    /**
     * Executa un programa si l'ordinador està encés i el salvapantalles està apagat
     * @return 
     */
    public boolean executeProgram(String nom) {
        boolean b = false;
        if (on && !screenSaverOn) {
            //TO-DO afegir llista programes
            b = true; 
        }
        return b;
    }
    
    /**
     * 
     * @return 
     */
    public boolean activeScreenSaver() {
        boolean b = false;
        if (on && !screenSaverOn) {
            screenSaverOn = true;
            b = true; 
        }
        return b;
    }


}
