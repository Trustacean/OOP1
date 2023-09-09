
package Perusahaan;

public class Pegawai {
        //final default
        final String DEFAULT_NAME = "Worker";
        final String DEFAULT_SEX = "None";
        final String DEFAULT_PHONE_NUMBER = "Phone Number";
        final String DEFAULT_EMAIL = "Email";
        final String DEFAULT_ADDRESS = "Address";
        final String DEFAULT_DATE_OF_BIRTH = "01";
        final String DEFAULT_MONTH_OF_BIRTH = "1";
        final String DEFAULT_YEAR_OF_BIRTH = "2000";
        final int DEFAULT_EMPLOYEE_ID = 1000;
        final int DEFAULT_WAGES = 0;
        final boolean DEFAULT_ACTIVE = false;
        //variable declarations
        private String name;
        private String sex;
        private String phoneNumber;
        private String email;
        private String address;
        private String dateOfBirth;
        private String monthOfBirth;
        private String yearOfBirth;
        private int employeeId;
        private int wages;
        private boolean active;
        //constructor without parameters
        public Pegawai() {
                //initialize attribute values as default values
                this.name=DEFAULT_NAME;
                this.sex=DEFAULT_SEX;
                this.phoneNumber=DEFAULT_PHONE_NUMBER;
                this.email=DEFAULT_EMAIL;
                this.address=DEFAULT_ADDRESS;
                this.dateOfBirth=DEFAULT_DATE_OF_BIRTH;
                this.monthOfBirth=DEFAULT_MONTH_OF_BIRTH;
                this.yearOfBirth=DEFAULT_YEAR_OF_BIRTH;
                this.employeeId=DEFAULT_EMPLOYEE_ID;
                this.wages=DEFAULT_WAGES;
                this.active=DEFAULT_ACTIVE;
        }
        //constructor with parameters
        public Pegawai(String name, int employeeId){
                setName(name);
                setEmployeeId(employeeId);
        }
        public Pegawai(String name, String sex, String phoneNumber, 
        String email, String address,int date, int month, int year, int employeeId,
         int wages, 
        boolean active) {
                //calling set methods with parameters
                setName(name);
                setSex(sex);
                setPhoneNumber(phoneNumber);
                setEmail(email);
                setAddress(address);
                setDateOfBirth(date, month, year);
                setEmployeeId(employeeId);
                setWages(wages);
                setActive(active);
        }
        //set and getters for each attributes
        public void setName(String name) {
                this.name = name;
        }
        public String getName() {
                return name;
        }

        public void setSex(String sex) {
                if (sex=="male"||sex=="Male"||sex=="MALE") {
                        this.sex = "Male" ;
                } else if (sex=="female"||sex=="Female"||sex=="FEMALE") {
                        this.sex = "Female";        
                } else {
                        this.sex = "None";
                }
        }

        public String getSex() {
                return sex;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getEmail() {
                return email;
        }
        
        public void setAddress(String address) {
                this.address = address;
        }

        public String getAddress() {
                return address;
        }

        public void setDateOfBirth(int date, int month, int year) {
                if (year>2023) {
                        this.yearOfBirth="2000";
                } else if (year<1970) {
                        this.yearOfBirth="1970";
                } else {
                        this.yearOfBirth=Integer.toString(year);
                }
                        
                switch (month) {
                        case 1: this.monthOfBirth="January";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 2: this.monthOfBirth="February";
                                if (date<1||date>28){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 3: this.monthOfBirth="March";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 4: this.monthOfBirth="April";
                                if (date<1||date>30){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 5: this.monthOfBirth="May";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 6: this.monthOfBirth="June";
                                if (date<1||date>30){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 7: this.monthOfBirth="July";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 8: this.monthOfBirth="August";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 9: this.monthOfBirth="September";
                                if (date<1||date>30){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 10: this.monthOfBirth="October";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 11: this.monthOfBirth="November";
                                if (date<1||date>30){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        case 12: this.monthOfBirth="December";
                                if (date<1||date>31){
                                        this.dateOfBirth="01";
                                } else {
                                        this.dateOfBirth=String.format(
                                                "%02d", date);
                                }
                                break;
                        default:this.monthOfBirth="January"; 
                                this.dateOfBirth="01";
                                break;
                }
        }

        public String getDateOfBirth() {
                return dateOfBirth;
        }

        public String getMonthOfBirth() {
                return monthOfBirth;
        }

        public String getYearOfBirth() {
                return yearOfBirth;
        }
        
        public void setEmployeeId(int employeeId) {
                if (employeeId<0) {
                        this.employeeId=0;
                } else {
                        this.employeeId = employeeId;
                }
        }

        public int getEmployeeId() {
                return employeeId;
        }

        public void setWages(int wages) {
                if (wages<0) {
                        this.wages=0;
                } else {
                        this.wages = wages;
                }
        }

        public int getWages() {
                return wages;
        }

        public void setActive(boolean active) {
                this.active = active;
        }

        public boolean getActive() {
                return active;
        }

        //toString method to print employee's attributes
        public String toString() {
        
                return  "name = " + name + '\n' +
                        "sex = " + sex + '\n' +
                        "phoneNumber = " + phoneNumber + '\n' +
                        "email = " + email + '\n' +
                        "address = " + address + '\n' +
                        "dateOfBirth = " + dateOfBirth + ' ' +
                         monthOfBirth + ' ' + yearOfBirth + '\n' +
                        "employeeId = " + employeeId + '\n' +
                        "wages = " + wages + '\n' +
                        "active = " + active;
        }
}
