package com.Main;

import com.company.SystemAdministrator;

/**
 * This program is an inventory management system for bike parts. It prompts for a user name and password.
 * the system administrator must create additional accounts and assign them job titles. Once job titles are assigned
 * a user can log in and get access to the menu that is assigned for their role. Each persons role has different menu options
 * that allow them to examine parts, add parts, sell parts, sort parts, delete users and many other options depending on their
 * role and access permission.
 * @author Brad Weems & Brandon Frulla
 * @version 3.0
 */


public class Main {

    public static void main(String[] args) {
        SystemAdministrator systemAdministrator = new SystemAdministrator();
        systemAdministrator.logIn();
    }
}