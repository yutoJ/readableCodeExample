package ex8;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateTransitions {

    Map<State, Set<State>> allowed;

    {
        allowed = new HashMap<State, Set<State>>();

        allowed.put(State.reviewing, EnumSet.of(State.accepted, State.reminding));
        allowed.put(State.reminding, EnumSet.of(State.reviewing, State.done));
        allowed.put(State.accepted, EnumSet.of(State.doing, State.done));
        allowed.put(State.doing, EnumSet.of(State.stopping, State.done));
        allowed.put(State.stopping, EnumSet.of(State.doing, State.done));

    }

    boolean canTransit(State from, State to){
        Set<State> allowedStates = allowed.get(from);
        return allowedStates.contains(to);
    }
}
