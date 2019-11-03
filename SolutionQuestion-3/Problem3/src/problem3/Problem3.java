
package problem3;


public class Problem3 {

   
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        
       // these state are not working before run player play state....
        videoPlayer.forward();
        videoPlayer.rewind();
        videoPlayer.pause();
        videoPlayer.stop();
        
       // change state with in player behaviour....
        videoPlayer.play();
        videoPlayer.forward();
        videoPlayer.pause();
        videoPlayer.rewind();
        videoPlayer.stop();
    }
    
}
