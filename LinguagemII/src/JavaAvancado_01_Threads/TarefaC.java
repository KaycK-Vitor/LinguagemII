package JavaAvancado_01_Threads;

public class TarefaC implements Runnable {
   
    public void run()
    {
        while(true){
            
            System.out.println("----- CCCCCCCCCC ----- => Implementacao");
            
            try{
                Thread.sleep(500);
            }
            catch(Exception ex)
            {
                System.out.println("Exceção ao executar TarefaC.");
            }
            
        }
    }
}
