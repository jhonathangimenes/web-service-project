
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addPortion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addPortion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="p" type="{http://ws/}portion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPortion", propOrder = {
    "p"
})
public class AddPortion {

    protected Portion p;

    /**
     * Obtém o valor da propriedade p.
     * 
     * @return
     *     possible object is
     *     {@link Portion }
     *     
     */
    public Portion getP() {
        return p;
    }

    /**
     * Define o valor da propriedade p.
     * 
     * @param value
     *     allowed object is
     *     {@link Portion }
     *     
     */
    public void setP(Portion value) {
        this.p = value;
    }

}
