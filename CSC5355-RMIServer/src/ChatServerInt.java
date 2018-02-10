
    import java.rmi.*;
    import java.util.*;
     
    public interface ChatServerInt extends Remote{	
    	public boolean login (ChatClienInt a)throws RemoteException ;
    	public void publish (String s)throws RemoteException ;
    	public Vector getConnected() throws RemoteException ;
    }