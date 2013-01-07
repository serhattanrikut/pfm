/**
 * 
 */
package com.gtc.pfm.ws.controller;

import com.gtc.pfm.domain.Package;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.List;

/**
 * @author stanriku
 *
 */
@JsonRootName("packages")
public class Packages {

    @JsonProperty("packageList")
    private List<Package> packages;
    
    /**
     * 
     */
    public Packages() {
        
    }

    /**
     * @param packages
     */
    public Packages(List<Package> packages) {
        super();
        this.packages = packages;
    }



    /**
     * @return the packages
     */
    public List<Package> getPackages() {
        return packages;
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }
    
    

}
