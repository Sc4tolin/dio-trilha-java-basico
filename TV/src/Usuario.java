public class Usuario {

    public static void main(String[] args) throws Exception{
        
       SmartTv smartTv = new SmartTv( );

      
       
    
       smartTv.diminuirVolume();
       System.out.println("Volume atual :  "+ smartTv.volume);

     
       smartTv.diminuirVolume();
       System.out.println("Volume atual :  "+ smartTv.volume);

       smartTv.diminuirVolume();
       System.out.println("Volume atual :  "+ smartTv.volume);

       smartTv.mudarCanal(13);
       System.out.println("Canal Atual :  " + smartTv.canal);

        smartTv.aumentarVolume();
       System.out.println("Volume atual :  "+ smartTv.volume);


        System.out.println("TV Ligada :  " + smartTv.ligada);
        System.out.println("Canal Atual :  " + smartTv.canal);
        System.out.println("Volume atual :  "+ smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo Status --> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Novo Status --> Tv Ligada ? " + smartTv.ligada);

    
        


    }
    
}
