package tekken;

import java.util.ArrayList;

public class CharacterData {
	public ArrayList<TekkenCharacter> chars = new ArrayList<TekkenCharacter>();

	public CharacterData() {
		chars.add(new TekkenCharacter("Gigas"));
	}
}
