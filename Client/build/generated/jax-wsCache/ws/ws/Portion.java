
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de portion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="portion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="portionValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "portion", propOrder = {
    "contractNumber",
    "day",
    "month",
    "portionValue",
    "status",
    "year"
})
public class Portion {

    protected int contractNumber;
    protected int day;
    protected int month;
    protected float portionValue;
    protected String status;
    protected int year;

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
     * Obtém o valor da propriedade portionValue.
     * 
     */
    public float getPortionValue() {
        return portionValue;
    }

    /**
     * Define o valor da propriedade portionValue.
     * 
     */
    public void setPortionValue(float value) {
        this.portionValue = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
