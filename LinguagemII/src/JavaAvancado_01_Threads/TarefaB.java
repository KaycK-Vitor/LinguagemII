package JavaAvancado_01_Threads;

public class TarefaB extends Thread{
    
    public void run()
    {
        while(true){
            
            System.out.println("BBBBBBBBBB ----------  => Heranca");
            
            try{
                Thread.sleep(500);
            }
            catch(Exception ex)
            {
                System.out.println("Exceção ao executar TarefaB.");
            }
            
        }
    }
}