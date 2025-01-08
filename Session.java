/**
 * Name class: Session
 * Date: 08 January 2025
 * Author: Chin hongnyheng
 * Collarborators: Try Khemchhun
 * Modified: 08 January 2025
 * Description: A class that testing the Subject class
 * Functions:
 * - getName(): String
 * Variables:
 * - name: String
 */
public class Session {
    private int startTime;
    private int endTime;

    public Session(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setDuration(int startTime, int endTime) { 
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public static void main(String[] args) {
        Session session = new Session(13, 14);
        session.setDuration(13, 14);
    }
}
// exception
