package pactical;

public class Customer {
    public Integer id;
    public String fullName;
    public Integer numberPhone;
    public String adress;
    public String dateOD;
    public String dateReturn;

    public Customer(Integer id, String fullName, Integer numberPhone, String adress, String dateOD, String dateReturn) {
        this.id = id;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.adress = adress;
        this.dateOD = dateOD;
        this.dateReturn = dateReturn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDateOD() {
        return dateOD;
    }

    public void setDateOD(String dateOD) {
        this.dateOD = dateOD;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }
}
