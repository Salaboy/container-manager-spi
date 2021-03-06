/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kie.container.spi.model.base;

import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import org.kie.container.spi.model.ContainerInstanceConfiguration;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class BaseContainerInstanceConfiguration implements ContainerInstanceConfiguration {

    private Map<String, String> properties;

    @Override
    public Map<String, String> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, String> props) {
        this.properties = props;
    }

}
