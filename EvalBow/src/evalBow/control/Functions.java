package evalBow.control;

import evalBow.model.Archer;
import evalBow.model.Category;
import evalBow.model.StartNumber;

public interface Functions {
	public boolean addArcher(String name, String club, Category category, StartNumber startNumber);
	public void addCategory(String name);
	public void getRanking(Archer archer, int day);
}
