package JavaAvancado_01_Threads;

public class TarefaA extends Thread{
    
    public void run()
    {
        while(true){
            
            System.out.println(" ---------- AAAAAAAAAA   =>   Heranca");
            
            try{
                Thread.sleep(550);
            }
            catch(Exception ex)
            {
                System.out.println("Exceção ao executar TarefaA.");
            }
            
        }
    }
}
