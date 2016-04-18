    class CheckPort80{
    public static void main(String []args) throws Exception{
        String port = "80";
        int p = Integer.parseInt(port);
        Thread thr = new Thread(){
            public void run(){

                try{
                    java.net.ServerSocket s = new java.net.ServerSocket(p);
                    System.out.println("\nListening on port " + p);
                    s.accept();
                }catch(Exception e){
                    System.out.println("Err " + e);
                }
            }
        };

        thr.start();
        
        Thread.sleep(1000);
        System.out.println("Program finished.");
        System.exit(0);
    }
}