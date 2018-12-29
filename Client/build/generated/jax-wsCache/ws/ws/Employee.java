
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de employee complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignable_margin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="gross_income" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "consignableMargin",
    "grossIncome",
    "lastName",
    "name",
    "office",
    "registration"
})
public class Employee {

    @XmlElement(name = "consignable_margin")
    protected double consignableMargin;
    @XmlElement(name = "gross_income")
    protected float grossIncome;
    @XmlElement(name = "last_name")
    protected String lastName;
    protected String name;
    protected String office;
    protected int registration;

    /**
     * Obtém o valor da propriedade consignableMargin.
     * 
     */
    public double getConsignableMargin() {
        return consignableMargin;
    }

    /**
     * Define o valor da propriedade consignableMargin.
     * 
     */
    public void setConsignableMargin(double value) {
        this.consignableMargin = value;
    }

    /**
     * Obtém o valor da propriedade grossIncome.
     * 
     */
    public float getGrossIncome() {
        return grossIncome;
    }

    /**
     * Define o valor da propriedade grossIncome.
     * 
     */
    public void setGrossIncome(float value) {
        this.grossIncome = value;
    }

    /**
     * Obtém o valor da propriedade lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define o valor da propriedade lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade office.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Define o valor da propriedade office.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Obtém o valor da propriedade registration.
     * 
     */
    public int getRegistration() {
        return registration;
    }

    /**
     * Define o valor da propriedade registration.
     * 
     */
    public void setRegistration(int value) {
        this.registration = value;
    }

}
