package au.com.optus.mcas.sdp.nbnenabler.util;

import au.com.optus.mcas.core.properties.AbstractPropertiesContainer;
import au.com.optus.mcas.core.properties.Property;
import org.springframework.stereotype.Repository;


@Repository(value = "nbn-enabler-properties")
public class NbnEnablerPropertiesContainer extends AbstractPropertiesContainer {
    @Property(key = "nbn.properties")
    private String props;

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }
    
}
