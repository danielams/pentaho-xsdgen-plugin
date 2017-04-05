package org.pentaho.kettle.plugin.xsdgen.steps;

/**
 * Created by dams on 07-03-2017.
 */

import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * This class is the implementation of StepDataInterface.
 * <p>
 * Implementing classes inherit from BaseStepData, which implements the entire
 * interface completely.
 * <p>
 * In addition classes implementing this interface usually keep track of
 * per-thread resources during step execution. Typical examples are:
 * result sets, temporary data, caching indexes, etc.
 * <p>
 * The implementation for the demo step stores the output row structure in
 * the data class.
 */
public class XsdGenStepData  extends BaseStepData implements StepDataInterface{

    public XsdGenStepData(){
        super();
    }
}
