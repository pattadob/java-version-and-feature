package org.example.java16;

    // https://docs.oracle.com/en/java/javase/16/language/records.html#GUID-6699E26F-4A9B-4393-A08B-1E47D4B2D263
public class Records {
    public static void main(String[] args) {

        Records records = new Records();
        records.test();

    }

    void test(){
        Vehicle vehicle = new Vehicle("100", "Fuel");
        System.out.println(vehicle.getCode());

        VehicleRecord vehicleRecord = new VehicleRecord("200", "Electric");
        System.out.println(vehicleRecord.code());
    }

    public record VehicleRecord(String code, String engineType) {
        @Override
        public String code() {
            System.out.println("Code is " + code);
            return code;
        }
    }
    public class Vehicle {
        String code;
        String engineType;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        public Vehicle(String code, String engineType) {
            this.code = code;
            this.engineType = engineType;
        }
    }
}
