    import java.rmi.*;
     
    public interface ChatClienInt extends Remote{	
    	public void tell (String name)throws RemoteException ;
    	public String getName()throws RemoteException ;
    }