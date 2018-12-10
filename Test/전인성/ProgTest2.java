package ¿¸¿Œº∫;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProgTest2 {
	
	Map<String,MemberData>mapList = new Hashtable<String, MemberData>();
	
	void mapListAdd(String memberID, String name, String tel, String genderd) {
		Set<String>keyset=mapList.keySet();
		Iterator<String> keyiterator = keyset.iterator();
		String MemberData = keyiterator.next();
		String memberID = mapList.get(MemberData)		
	}
	void mapListRemove(String memberID, String name, String tel, String genderd) {
		memberID remove(mapList MemberData);
	}
	ArrayList<MemberData> getMapList(){
		?
		
	}
	
}
