/**
 * 
 */
package com.gtc.pfm.domain;

/**
 * VenueType qualifiers {@link Venue}(s)
 * 
 * @author stanriku
 *
 */
public class VenueType {

    public int type;
    
    public String name;
    
    /**
     * 
     */
    public VenueType() {
        
    }
    
    /**
     * 
     */
    public VenueType(VenueTypeEnum venueTypeEnum) {
        this.setName(venueTypeEnum.getName());
        this.setType(venueTypeEnum.getType());
    }
   
    /**
     * @param type
     * @param name
     */
    public VenueType(int type, String name) {
        super();
        this.type = type;
        this.name = name;
    }



    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VenueType [type=");
        builder.append(type);
        builder.append(", name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }
    
    

}
