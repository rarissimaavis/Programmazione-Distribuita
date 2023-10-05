import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Logger;
public class RegistroServer {
    static Logger logger = Logger.getLogger("global");
    public static void main(String[] args) {
        HashMap<String, RecordRegistro> hash = new HashMap<String, RecordRegistro>();
        Socket socket = null;
        System.out.println ("In attesa...");
        try{
            ServerSocket serverSocket = new ServerSocket(7000);
            while(true) {
                socket = serverSocket.accept();
                ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
                RecordRegistro record = (RecordRegistro) inStream.readObject();
                if(record.getIndirizzo()!=null) {//scrittura
                    hash.put(record.getNome(), record);
                }else{ //ricerca
                    RecordRegistro res = hash.get(record.getNome());
                    ObjectOutputStream outStream =new ObjectOutputStream (socket.getOutputStream());
                    outStream.writeObject(res);
                    outStream.flush();
                } //fine else
                socket.close();
            }//fine while
        }catch(EOFException e) {
            logger.severe(e.getMessage());
            e.printStackTrace();
        }catch(Throwable t) {
            logger.severe(t.getMessage());
            t.printStackTrace();
        }
        finally{//chiusura del socket
            try{ socket.close();
            }catch(IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}