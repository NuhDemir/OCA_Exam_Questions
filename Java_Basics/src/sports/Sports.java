package sports;

import java.util.List;

public class Sports {
	  private String sportName;
	    private int numberOfPlayers;
	    private String equipmentUsed;
	    private List<String> rules;

	    // Constructor
	    public Sports(String sportName, int numberOfPlayers, String equipmentUsed, List<String> rules) {
	        this.sportName = sportName;
	        this.numberOfPlayers = numberOfPlayers;
	        this.equipmentUsed = equipmentUsed;
	        this.rules = rules;
	    }

	    // Getter methods
	    public String getSportName() {
	        return sportName;
	    }

	    public int getNumberOfPlayers() {
	        return numberOfPlayers;
	    }

	    public String getEquipmentUsed() {
	        return equipmentUsed;
	    }

	    public List<String> getRules() {
	        return rules;
	    }

	    // Setter methods
	    public void setSportName(String sportName) {
	        this.sportName = sportName;
	    }

	    public void setNumberOfPlayers(int numberOfPlayers) {
	        this.numberOfPlayers = numberOfPlayers;
	    }

	    public void setEquipmentUsed(String equipmentUsed) {
	        this.equipmentUsed = equipmentUsed;
	    }

	    public void setRules(List<String> rules) {
	        this.rules = rules;
	    }

	    // Additional methods (if needed)
	    public void addRule(String rule) {
	        this.rules.add(rule);
	    }

	    public void removeRule(String rule) {
	        this.rules.remove(rule);
	    }

}
