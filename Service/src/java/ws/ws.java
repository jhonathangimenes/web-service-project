/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;

/**
 *
 * @author Desenvolvimento
 */
@WebService(serviceName = "ws")
public class ws {
    
    List<Employee> listEmployee = new ArrayList<>();
    List<Consignment> listConsignment = new ArrayList<>();
    List<Portion> listPortion = new ArrayList<>();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getEmployee")
    public List<Employee> getEmployee(){
        return this.listEmployee;
    }
    
    @WebMethod(operationName = "getConsignment")
    public List<Consignment> getConsignment(){
        return this.listConsignment;
    }
    
    @WebMethod(operationName = "getPortion")    
    public List<Portion> getPortion(){
        return this.listPortion;
    }    
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listaAlunos")
    public List<String> listaAlunos() {
        List<String> lista = new ArrayList<>();
        lista.add("Raysa");
        lista.add("Dalvino");
        lista.add("Honorio");
        lista.add("Fabio");
        lista.add("Zuilton");
        lista.add("Naya");
        lista.add("Ronnizya");
        return lista;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "addEmployee")
    @Oneway
    public void addEmployee(@WebParam(name = "e") Employee e) {
        this.listEmployee.add(e);
    }
    
    @WebMethod(operationName = "addConsignment")
    @Oneway
    public void addConsignment(@WebParam(name = "c") Consignment c) {
        this.listConsignment.add(c);
    }
    
    @WebMethod(operationName = "addPortion")
    @Oneway
    public void addPortion(@WebParam(name = "p") Portion p) {
        this.listPortion.add(p);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "payInstallment")
    @Oneway
    public void payInstallment(@WebParam(name = "portion") int portion) {
        for(int i = 0 ; i < listPortion.size() ; i++){
            if(portion == listPortion.get(i).getMonth()){
                listPortion.get(i).setStatus("Pago");
                System.out.print("Parcela do Mês: "+listPortion.get(i).getMonth());
            }
        }
    }
    



    /**
     * Operação de Web service
     */

    

    
    
}
