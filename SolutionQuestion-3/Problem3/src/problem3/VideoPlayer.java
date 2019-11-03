
package problem3;


public class VideoPlayer implements VideoPlayerState{
    private VideoPlayerState stopState;
    private VideoPlayerState playState;
    private VideoPlayerState pauseState;
    private VideoPlayerState forwardState;
    private VideoPlayerState rewindState;
    private VideoPlayerState state;

    public VideoPlayer() {
        this.stopState = new StopState(this);
        this.playState = new PlayState(this);
        this.pauseState = new PauseState(this);
        this.forwardState = new ForwardState(this);
        this.rewindState = new RewindState(this);
        this.state = stopState;
    }

    public VideoPlayerState getStopState() {
        return stopState;
    }

    public void setStopState(VideoPlayerState stopState) {
        this.stopState = stopState;
    }

    public VideoPlayerState getPlayState() {
        return playState;
    }

    public void setPlayState(VideoPlayerState playState) {
        this.playState = playState;
    }

    public VideoPlayerState getPauseState() {
        return pauseState;
    }

    public void setPauseState(VideoPlayerState pauseState) {
        this.pauseState = pauseState;
    }

    public VideoPlayerState getForwardState() {
        return forwardState;
    }

    public void setForwardState(VideoPlayerState forwardState) {
        this.forwardState = forwardState;
    }

    public VideoPlayerState getRewindState() {
        return rewindState;
    }

    public void setRewindState(VideoPlayerState rewindState) {
        this.rewindState = rewindState;
    }

    public VideoPlayerState getState() {
        return state;
    }

    public void setState(VideoPlayerState state) {
        this.state = state;
    }
   

    @Override
    public void stop() {
        state.stop();
    }

    @Override
    public void play() {
        state.play();
    }

    @Override
    public void pause() {
        state.pause();
    }

    @Override
    public void forward() {
        state.forward();
    }

    @Override
    public void rewind() {
        state.rewind();
    }
}
