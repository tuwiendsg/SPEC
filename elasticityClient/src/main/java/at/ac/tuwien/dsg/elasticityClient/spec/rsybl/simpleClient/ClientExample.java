/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.tuwien.dsg.elasticityClient.spec.rsybl.simpleClient;

import at.ac.tuwien.dsg.csdg.inputProcessing.multiLevelModel.abstractModelXML.CloudServiceXML;
import at.ac.tuwien.dsg.csdg.inputProcessing.multiLevelModel.abstractModelXML.ServiceTopologyXML;
import at.ac.tuwien.dsg.csdg.inputProcessing.multiLevelModel.abstractModelXML.ServiceUnitXML;
import at.ac.tuwien.dsg.elasticityclient.spec.rsybl.simpleClient.SYBLControlClient;

/**
 *
 * @author Georgiana
 */
public class ClientExample {
    public void exampleOfSettingRequirements(){
        CloudServiceXML cloudServiceXML = new CloudServiceXML();
        ServiceTopologyXML serviceTopologyXML = new ServiceTopologyXML();
        ServiceUnitXML serviceUnitXML = new ServiceUnitXML();
        //Construct the needed details on above structures
        
        //unmarshall them into strings
        
        
        // call methods already existent
        String aboveCloudServiceToString="";
       SYBLControlClient syblControlClient=new SYBLControlClient();
     syblControlClient.initialInstantiationLifecycle(aboveCloudServiceToString, "", "", "");
    }
}
