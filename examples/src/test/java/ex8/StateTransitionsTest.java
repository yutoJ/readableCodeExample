package ex8;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StateTransitionsTest {
    @Test
    public void canTransit() throws Exception {

        boolean expacted = true;
        StateTransitions transitions = new StateTransitions();

        assertThat(transitions.canTransit( State.accepted, State.done), is(expacted));

    }

    @Test
    public void cannotTransit() throws Exception {

        boolean expacted = false;
        StateTransitions transitions = new StateTransitions();

        assertThat(transitions.canTransit( State.accepted, State.reviewing), is(expacted));

    }

}