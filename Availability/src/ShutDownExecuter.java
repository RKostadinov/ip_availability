import java.util.List;
import java.util.Map;


public class ShutDownExecuter extends BaseExecuter {

	public ShutDownExecuter(String[] command, List<String> currentlyLoggedUsers, Map<String, Integer> usersToLoginCount) {
		super(command, currentlyLoggedUsers, usersToLoginCount);
	}

	@Override
	public void execute() {
		
		System.exit(0);

	}

}
