/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;

/**
 *
 * @author Yan
 */
public interface PrescribedDrugsService extends OpenmrsService { 
    
    public PrescribedDrugs savePrescribedDrugs(PrescribedDrugs pd);
    
    public PrescribedDrugs getPrescribedDrugs(Integer id);
    
}
