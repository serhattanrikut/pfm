/**
 * 
 */
package com.gtc.pfm.domain;

/**
 * 
 * @author stanriku
 *
 */
public class PackageType implements PfmDomainObjectInterface{

    private int type;
    
    private String name;
    
    /**
     *  default constructor
     */
    public PackageType() {
        
    }
    
    /**
     * @param packageTypeEnum
     */
    public PackageType(PackageTypeEnum packageTypeEnum) {
        this.setType(packageTypeEnum.getType());
        this.setName(packageTypeEnum.getName());
    }
    
    /**
     * @param type
     * @param name
     */
    public PackageType(int type, String name) {
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
        builder.append("PackageType [type=");
        builder.append(type);
        builder.append(", name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }
    
}
