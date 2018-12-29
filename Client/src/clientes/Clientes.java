/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.ArrayList;
import java.util.List;
import ws.Employee;
//import ws.Employee;

/**
 *
 * @author Desenvolvimento
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();
        
            Employee e = new Employee();
                e.setRegistration(101);
                e.setName("Jhonathan");
                e.setLastName("Gimenes");
                e.setOffice("Desenvolvedor");
                e.setGrossIncome(3000);
                e.setConsignableMargin(350);
            addEmployee(e);   
        
        listEmployee = getEmployee();
        
        for(int i = 0; i < listEmployee.size(); i++){
            System.out.print(listEmployee.get(i).getName());
        }
        
        System.out.print("Você vai conseguir!!!\n");
    }

    private static java.util.List<java.lang.String> listaAlunos() {
        ws.Ws_Service service = new ws.Ws_Service();
        ws.Ws port = service.getWsPort();
        return port.listaAlunos();
    }

    private static java.util.List<ws.Employee> getEmployee() {
        ws.Ws_Service service = new ws.Ws_Service();
        ws.Ws port = service.getWsPort();
        return port.getEmployee();
    }

    private static void addEmployee(ws.Employee e) {
        ws.Ws_Service service = new ws.Ws_Service();
        ws.Ws port = service.getWsPort();
        port.addEmployee(e);
    }
    
    
    
    
}
