/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Nzeed
 */
public class PropertyBean implements Serializable {
    
    public static final String Score_PROPERTY = "";
    
    private String FootballScore;
    
    private PropertyChangeSupport propertySupport;
    
    public PropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getFootballScore() {
        return FootballScore;
    }
    
    public void setFootballScore(String value) {
        String oldValue = this.FootballScore;
        this.FootballScore = value;
        propertySupport.firePropertyChange(Score_PROPERTY, oldValue, this.FootballScore);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
