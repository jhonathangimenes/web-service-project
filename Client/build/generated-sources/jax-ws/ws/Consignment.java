
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consignment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="plots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valueConsignment" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consignment", propOrder = {
    "bank",
    "contractNumber",
    "day",
    "month",
    "plots",
    "registration",
    "valueConsignment",
    "year"
})
public class Consignment {

    protected String bank;
    protected int contractNumber;
    protected int day;
    protected int month;
    protected int plots;
    protected int registration;
    protected float valueConsignment;
    protected int year;

    /**
     * Obtém o valor da propriedade bank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Define o valor da propriedade bank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Obtém o valor da propriedade contractNumber.
     * 
     */
    public int getContractNumber() {
        return contractNumber;
    }

    /**
     * Define o valor da propriedade contractNumber.
     * 
     */
    public void setContractNumber(int value) {
        this.contractNumber = value;
    }

    /**
     * Obtém o valor da propriedade day.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Define o valor da propriedade day.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Obtém o valor da propriedade month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Define o valor da propriedade month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Obtém o valor da propriedade plots.
     * 
     */
    public int getPlots() {
        return plots;
    }

    /**
     * Define o valor da propriedade plots.
     * 
     */
    public void setPlots(int value) {
        this.plots = value;
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

    /**
     * Obtém o valor da propriedade valueConsignment.
     * 
     */
    public float getValueConsignment() {
        return valueConsignment;
    }

    /**
     * Define o valor da propriedade valueConsignment.
     * 
     */
    public void setValueConsignment(float value) {
        this.valueConsignment = value;
    }

    /**
     * Obtém o valor da propriedade year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Define o valor da propriedade year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
