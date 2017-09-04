
package org.mule.modules.philytrain.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.philytrain.PhilyTrainConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>PhilyTrainConnectorProcessAdapter</code> is a wrapper around {@link PhilyTrainConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-04T01:24:42-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class PhilyTrainConnectorProcessAdapter
    extends PhilyTrainConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<PhilyTrainConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, PhilyTrainConnectorCapabilitiesAdapter> getProcessTemplate() {
        final PhilyTrainConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,PhilyTrainConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, PhilyTrainConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, PhilyTrainConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
