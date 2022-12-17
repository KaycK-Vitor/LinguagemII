package JavaAvancado_01_Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TarefaB extends Thread{
    public void run()
    {
        while(true){
            System.out.println("BBBBBBBBBB ----------");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TarefaA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}