import java.io. *;
import java.net. *;
import java.util.logging.Logger;
public class Server {
    static Logger logger = Logger.getLogger("global");
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            logger.info("Socketok, accetto conn...");
            Socket socket = serverSocket.accept();
            logger.info("Accettata una connessione...");
            ObjectOutputStream oS = new ObjectOutputStream (socket.getOutputStream());
            ObjectInputStream iS = new ObjectInputStream (socket.getInputStream());
            String nome= (String) iS.readObject();
            logger.info("Ricevuto: "+ nome);
            oS.writeObject("Hello "+ nome);
            socket.close();
        }catch(EOFException e) {
            logger.severe("Problemi con la connessione: "+ e.getMessage());
            e.printStackTrace();
        }catch(Throwable t) {
            logger.severe("Lanciata Throwable: "+ t.getMessage());
            t.printStackTrace();
        }
    }
}