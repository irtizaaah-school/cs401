import java.util.Vector;

public class Message{

        //MEMBER VARIABLES
        private String content;
        private String sender;
        private boolean isDelivered;
        private Vector<String> readBy;


        //CONSTRUCTOR
        public Message(String content, String sender){
                this.content = content;
                this.sender = sender;
                this.setIsDelivered(false);
        }

        //SETTERS
        public void setSender(String sender){
                this.sender = sender;
        }
  
        public void setContent(String content){
                this.content = content;
        }
  
        public void setReadBy(Vector<String> readBy){
                this.readBy = readBy;
        }
  
        public void setIsDelivered(boolean isDelivered){
                this.isDelivered = isDelivered;
        }
  

        //GETTERS
        public String getSender(){
                return this.sender;
        }
  
        public String getContent(){
                return this.content;
        }
  
        public Vector<String> getReadBy(){
                return this.readBy;
        }
  
        public boolean getIsDelivered(){
                return this.isDelivered;
        }
}
