package p1Code;

import exception.CaseVideException;
//@SuppressWarnings("unused")

public class terrain {
	private Jeton Terrain[];
	
	public terrain() {
		Jeton Terrain[]= new Jeton[5];
		for (int i=0; i<5; i++) {
			Terrain[i]=new Jeton();
		}
	}
	
	public boolean addToken(int i) throws Exception {
		Jeton t = new Jeton();
		t.CreationMonstre();
		this.Terrain[i]=t;
		return true;
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
