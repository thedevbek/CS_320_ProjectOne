package com.jetbrains.bek;


import java.util.ArrayList;

public class appointmentService {
    private final ArrayList<String> serviceList;
    private final ArrayList<String> deleteService;


    public appointmentService(ArrayList<String> serviceList, ArrayList<String> deleteService, ArrayList<String> updateAppoinment) {
        this.serviceList = serviceList;
        this.deleteService = deleteService;
        serviceList = new ArrayList<>();
    }

    public boolean addAppointmentID(String AppointmentID) {
        boolean serviceAlready = false;
        for (int i = 0; i < serviceList.size(); i++)

            if (serviceList.equals(AppointmentID)) {
                serviceAlready = true;
                break;
            }


        if (!serviceAlready) {
            serviceList.add(AppointmentID);
            return true;
        } else {
            return false;
        }

    }

    public boolean deleteService(String AppointmentID, String AppointmentDate, String AppointmentDescription) {
        for (int i = 0; i < serviceList.size(); i++) {
            if (serviceList.equals(AppointmentID)) {
                serviceList.remove(AppointmentDate);
                return true;
            }
            if (serviceList.equals(AppointmentDate)) {
                serviceList.remove(AppointmentDate);
                return true;
            }
            if (serviceList.equals(AppointmentDescription)) {
                serviceList.remove(AppointmentDescription);
                return true;
            }
        }
        return false;
    }

    public boolean updateService(String AppointmentID, String AppointmentDate, String AppointmentDescription) {
        for (int i = 0; i < serviceList.size(); i++) {
            if (serviceList.equals(AppointmentID)) {
                serviceList.remove(AppointmentID);
                return true;
            }
            if (serviceList.equals(AppointmentDate)) {
                serviceList.remove(AppointmentDate);
                return true;
            }
            if (serviceList.equals(AppointmentDescription)) {
                serviceList.remove(AppointmentDescription);
                return true;
            }
        }

        return false;
    }
}
