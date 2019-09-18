package p1Code;

import exception.CaseNonDisponibleException;
import exception.CaseVideException;

public class terrain {
	private Jeton Terrain[];
	
	public terrain() {
		Terrain[0]=null;
	}
	
	public boolean addToken(Jeton t, int i) throws CaseNonDisponibleException {
		if (Terrain[i]!=null) {
			Terrain[i]=t;
			return true;
		}
		else
			throw new CaseNonDisponibleException();
	}
	
	public boolean removeToken(int i) throws CaseVideException{
		if (Terrain[i]==null)
			throw new CaseVideException();
		else {
			Terrain[i]=null;
			return true;
		}
	}

	public Jeton[] getTerrain() {
		return Terrain;
	}
}
