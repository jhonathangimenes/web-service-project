
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addEmployee complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="e" type="{http://ws/}employee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEmployee", propOrder = {
    "e"
})
public class AddEmployee {

    protected Employee e;

    /**
     * Obtém o valor da propriedade e.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getE() {
        return e;
    }

    /**
     * Define o valor da propriedade e.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setE(Employee value) {
        this.e = value;
    }

}
