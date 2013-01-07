/**
 * 
 */
package com.gtc.pfm.persistence.repository.mongo.package_;

import com.gtc.pfm.domain.Location;
import com.gtc.pfm.domain.Package;

import org.springframework.data.mongodb.core.geo.GeoResult;
import org.springframework.data.mongodb.core.geo.GeoResults;
import org.springframework.data.mongodb.core.geo.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stanriku
 *
 */
public class PackageRepositoryUtil {

   
    /**
     * converts {@link GeoResults} list to {@link Package} list
     * 
     * @param geoPackages
     * @return list of {@link Package}
     */
    public static List<Package> convertGeoPackages(GeoResults<Package> geoPackages) {
        
        if(geoPackages == null || geoPackages.getContent() == null || geoPackages.getContent().size() < 0 ){
            return null;
        }
        
        List<GeoResult<Package>> geoContent = geoPackages.getContent();
        
        List<Package> packages = new ArrayList<Package>();
        
        for (GeoResult<Package> geoResult : geoContent) {
            Package content = geoResult.getContent();
            content.setDistance(geoResult.getDistance().getNormalizedValue());
            packages.add(content);
        }
        return packages;
    }
    
    /**
     * converts {@link Location} to {@link Point}
     * @param location
     * @return {@link Point}
     */
    public static Point convertPoint(Location location) {
        
        if(location == null)
            return null;
        
        Point point = new Point(location.getLongitude(), location.getLatitude());
        return point;
    }
    
}
