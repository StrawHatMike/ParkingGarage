package com.example.parkinggarage;

public class ManagerData {
    private static String managerEmail = "manager@sunysuffolk.edu";
    private static String managerPassword = "password1";
    private static boolean isManager = false;

    public static boolean getManager() {
        return isManager;
    }

    public static void setManager(boolean isManager) {
        ManagerData.isManager = isManager;
    }

    public static String getManagerPassword() {
        return managerPassword;
    }

    public static String getManagerEmail() {
        return managerEmail;
    }
}
