
package org.mule.modules.philytrain.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.philytrain.PhilyTrainConnector;


/**
 * A <code>PhilyTrainConnectorCapabilitiesAdapter</code> is a wrapper around {@link PhilyTrainConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-04T01:24:42-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class PhilyTrainConnectorCapabilitiesAdapter
    extends PhilyTrainConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
