/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package Builder;

public class OutcomeDirector {
    private OutcomeBuilder _builder;
    
    public OutcomeDirector(OutcomeBuilder builder) {
        this._builder = builder;
    }
    
    public void build(){
        _builder.addMetrics();
    }
}