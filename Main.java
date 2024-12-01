
public class Main {

    public static class Customer {

        private String FirstName;
        private String LastName;
        private String SocSecurityNumber;
        private String BillingAddress;
        private String ShippingAddress;

        public Customer(String FirstName, String LastName, String SocSecurityNumber) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.SocSecurityNumber = SocSecurityNumber;
        }

        public void setFirstName(String FirstName) {
            this.FirstName = FirstName;
        }

        public void setLastName(String LastName) {
            this.LastName = LastName;
        }

        public void setSocSecurityNumber(String SocSecurityNumber) {
            this.SocSecurityNumber = SocSecurityNumber;
        }

        public void setBillingAddress(String BillingAddress) {
            this.BillingAddress = BillingAddress;
        }

        public void setShippingAddress(String ShippingAddress) {
            this.ShippingAddress = ShippingAddress;
        }

        public String GetFirstName() {
            return FirstName;
        }

        public String GetLastName() {
            return LastName;
        }

        public String GetSocSecurityNumber() {
            return SocSecurityNumber;
        }

        public String GetBillingAddress() {
            return BillingAddress;
        }

        public String GetShippingAddress() {
            return ShippingAddress;
        }

        public String toString() {
            return FirstName + " " + LastName + " " + SocSecurityNumber + " " + BillingAddress + " " + ShippingAddress; //retu
        }
    }

    public static class Adress {
        private String Street;
        private String City;
        private String State;
        private String ZipCode;

        public Adress(String Street, String City, String State, String ZipCode) {
            this.Street = Street;
            this.City = City;
            this.State = State;
            this.ZipCode = ZipCode;
        }

        public void setStreet(String Street) {
            this.Street = Street;
        }

        public void setCity(String City) {
            this.City = City;
        }

        public void setState(String State) {
            this.State = State;
        }

        public void setZipCode(String ZipCode) {
            this.ZipCode = ZipCode;
        }

        public String getStreet() {
            return Street;
        }

        public String getCity() {
            return City;
        }

        public String getState() {
            return State;
        }

        public String getZipCode() {
            return ZipCode;
        }
    }

    public static void main(String[] args) {
        Adress Adress1 = new Adress("123 Main St", "Chicago", "AS", "12345");
        Adress Adress2 = new Adress("1000 Main St", "Iowa", "FR", "52557");
        Adress Adress3 = new Adress("789 Main St", "Texas", "N", "12345");

        Customer Customer1 = new Customer("Ali", "Elgazzar", "123-45-6698");
        Customer1.setBillingAddress(Adress1.getCity());
        Customer1.setShippingAddress(Adress1.getCity());

        Customer Customer2 = new Customer("Amin", "mohamed", "159-55-6555");
        Customer2.setBillingAddress(Adress1.getCity());
        Customer2.setShippingAddress(Adress2.getCity());

        Customer Customer3 = new Customer("John", "Daison", "147-45-6733");
        Customer3.setBillingAddress(Adress2.getCity());
        Customer3.setShippingAddress(Adress3.getCity());

        Customer[] CustsData = {Customer1, Customer2, Customer3};
        for (Customer Index : CustsData) {
            if (Index.GetBillingAddress().equals("Chicago")) {
                System.out.println(Index.toString());
            }
        }


    }
}