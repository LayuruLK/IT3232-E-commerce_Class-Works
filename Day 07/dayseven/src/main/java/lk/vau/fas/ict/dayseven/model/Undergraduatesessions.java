package lk.vau.fas.ict.dayseven.model;

public class Undergraduatesessions {
    private int under_graduates_id;
	private int sessions_id;
    
    public Undergraduatesessions(int under_graduates_id, int sessions_id) {
        this.under_graduates_id = under_graduates_id;
        this.sessions_id = sessions_id;
    }

    public int getUnder_graduates_id() {
        return under_graduates_id;
    }

    public void setUnder_graduates_id(int under_graduates_id) {
        this.under_graduates_id = under_graduates_id;
    }

    public int getSessions_id() {
        return sessions_id;
    }

    public void setSessions_id(int sessions_id) {
        this.sessions_id = sessions_id;
    }

    
}
