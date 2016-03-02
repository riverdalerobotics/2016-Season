package robot.oi;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutoChooser {
	SendableChooser laneChooser = new SendableChooser();
	SendableChooser defenceChooser = new SendableChooser();
	SendableChooser distanceChooser = new SendableChooser();
	SendableChooser goalChooser = new SendableChooser();

	public AutoChooser() {
		laneChooser.addObject("1", new Integer(1));
		laneChooser.addObject("2", new Integer(2));
		laneChooser.addObject("3", new Integer(3));
		laneChooser.addObject("4", new Integer(4));
		laneChooser.addObject("5", new Integer(5));

		defenceChooser.addObject("Low Bar", new String("Low Bar"));
		defenceChooser.addObject("Ramparts", new String("Ramparts"));
		defenceChooser.addObject("Moat", new String("Moat"));
		defenceChooser.addObject("Rock Wall", new String("Rock Wall"));
		defenceChooser.addObject("Rough Terrain", new String("Rough Terrain"));
		defenceChooser.addObject("Portcullis", new String("Portcullis"));
		defenceChooser.addObject("Cheval de Frise", new String("Cheval de Frise"));

		distanceChooser.addObject("Close", new String("Close"));
		distanceChooser.addObject("Far", new String("Far"));

		goalChooser.addObject("Left", new String("Left"));
		goalChooser.addObject("Center", new String("Center"));
		goalChooser.addObject("Right", new String("Right"));

		SmartDashboard.putData("Slot position", laneChooser);
		SmartDashboard.putData("Defences", defenceChooser);
		SmartDashboard.putData("Distance", distanceChooser);
		SmartDashboard.putData("Goal", goalChooser);
	}

	/**
	 * 
	 * @return The selected lane, as an integer
	 */
	public int getSelectedSlot() {
		return (int) laneChooser.getSelected();
	}

	/**
	 * 
	 * @return The selected defense, as a string
	 */
	public String getSelectedDefence() {
		return (String) defenceChooser.getSelected();
	}

	/**
	 * 
	 * @return The selected distance, as a string
	 */
	public String getSelectedDistance() {
		return (String) distanceChooser.getSelected();
	}

	/**
	 * 
	 * @return The selected goal, as a String
	 */
	public String getSelectedGoal() {
		return (String) goalChooser.getSelected();
	}
}