package org.pentaho.kettle.plugin.xsdgen.ui.steps;

import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.trans.step.StepDialogInterface;
import org.pentaho.di.ui.trans.step.BaseStepXulDialog;
import org.pentaho.kettle.plugin.xsdgen.steps.XsdGenStepMeta;
import org.pentaho.ui.xul.components.XulTextbox;

/**
 * Created by dams on 16-03-2017.
 */
public class XsdGenStepDialog extends BaseStepXulDialog implements StepDialogInterface {

    private static final Class<?> PKG = XsdGenStepMeta.class;

    private String workingStepName;

    private String outputName;

    private XsdGenStepMetaMapper metaMapper;

    public XsdGenStepDialog(Shell parent, Object in, TransMeta tr, String sname) throws Throwable {
        super("org/pentaho/kettle/plugin/xsdgen/ui/dialog.xul", parent, (BaseStepMeta) in, tr, sname);
        init();
    }

    public void init() throws Throwable {
        workingStepName = stepname;
        metaMapper = new XsdGenStepMetaMapper();

        //add metadata logic
    }

    private void setTextBoxValue(String textbox, String value){
        ((XulTextbox) getXulDomContainer().getDocumentRoot().getElementById(textbox)).setValue(value);
    }

    @Override
    protected Class<?> getClassForMessages() {
        return XsdGenStepMeta.class;
    }

    @Override
    public void onAccept() {

    }

    @Override
    public void onCancel() {
        setStepName(null);
        dispose();
    }

    public void setStepName(String stepname){
        workingStepName=stepname;
    }

    public String getStepName(){
        return workingStepName;
    }
}
