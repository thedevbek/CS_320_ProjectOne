package com.jetbrains.bek;

public class appointment {

        private static String appointmentID;
        private String appointmentDate;
        private String appointmentDescription;

        appointment(String appointmentID, String appointmentDate, String appointmentDescription){
            setAppointmentID(appointmentID);
            setAppointmentDate(appointmentDate);
            setAppointmentDescription(appointmentDescription);

        }

   public String getAppointmentID() {
            return appointmentID;
   }
   private void setAppointmentID(String appointmentID) {
            validateAppointmentID(appointmentID);
            this.appointmentID = appointmentID;
   }

   public String getAppointmentDate(){
            return appointmentDate;
    }
    private void setAppointmentDate(String appointmentDate) {
            validateAppointmentDate(appointmentDate);
            this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    private void setAppointmentDescription(String appointmentDescription) {
            validateAppointmentDescription(appointmentDescription);
            this.appointmentDescription = appointmentDescription;
    }

    private void validateAppointmentID(String appointmentID) {
            if (appointmentID == null) {
                throw new RuntimeException(" Appointment ID cannot be null or empty!");
            }
            if (appointmentID.length() > 10) {
                throw new RuntimeException(" Appointment ID must have no more than 10 characters!");
            }
    }

    private void validateAppointmentDate(String appointmentDate) {
        if (appointmentDate == null) {
            throw new RuntimeException(" Appointment Date cannot be null or empty!");
        }
        if (appointmentDate.length() > 10) {
            throw new RuntimeException(" Appointment Date must have no more than 10 characters!");
        }
    }

    private void validateAppointmentDescription(String appointmentDescription) {
        if (appointmentDescription == null) {
            throw new RuntimeException(" Appointment Description cannot be null or empty!");
        }
        if (appointmentDescription.length() > 50) {
            throw new RuntimeException(" Appointment Description must have no more than 50 characters!");
        }
    }

    public static void main(String[] args) {
        appointment a = new appointment("13", "12/12/2023", "test");
        System.out.println(a.getAppointmentID());
    }
}


