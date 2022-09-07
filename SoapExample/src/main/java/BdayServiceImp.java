import java.util.HashMap;
import java.util.Map;

public class BdayServiceImp implements BdayService {
	
	private static  Map<Integer, Birthday>Birthdays = new HashMap<Integer,Birthday>();
		
	

	@Override
	public boolean addBirthday(Birthday B) {
		if (Birthdays.get(B.getId())!=null) {
			return false;	
		
		}else {
			return true;
		}
		
	}

	@Override
	public Birthday getBirthday(int id) {
		
		return Birthdays.get(id);
	}

}
