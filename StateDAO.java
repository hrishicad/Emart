package mypack;

import java.util.List;

public interface StateDAO
{
	void addState(StateMaster C);
	List< StateMaster > getStates();
	void delete(int id);
	void update(StateMaster S, int id);
	
}
