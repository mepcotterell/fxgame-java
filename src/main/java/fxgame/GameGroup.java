package fxgame;

import javafx.scene.Group;
import javafx.animation.Timeline;

/**
 * A <code>GameGroup</code> node is a {@link javafx.scene.Group} that updates
 * its children via an associated {@link javafx.animation.Timeline}.
 */
public class GameGroup extends Group {

    /** The target framerate for a <code>GameGroup</code>. */
    public static final double TARGET_FPS = 60.0;

    private final Timeline timeline = new Timeline(TARGET_FPS);

    /** 
     * Constructs a <code>GameGroup</code> object with default settings.
     */
    public GameGroup() {
	super();
    } // GameGroup

    /**
     * Returns the {@link javafx.animation.Timeline} associated with this
     * <code>GameGroup</code>.
     *
     * @return the associated timeline
     */
    public Timeline getTimeline() {
	return this.timeline;
    } // getTimeline

} // GameGroup

