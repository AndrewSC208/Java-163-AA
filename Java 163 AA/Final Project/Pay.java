/* Filename Pay.java */
/* Written by Andrew Meiling */
/* Written on May 3rd, 2014 */
/* Final Project */
/* Game Zone exercise # 14 */
/* Pg 255 */
/* CIS163AA - Java Programming: level 1 */
/* Class # 11681 */

import java.util.*;
import javax.swing.*;

public class Pay
{
	public static void main(String[] args)
	{
		// variables:
		// final ins rates:
		final double MED_INS = 32.50;
		final double DENTAL_INS = 20.00;
		final double LTD_INS = 10.00;
		// final hourly pay rates:
		final double SKILL_LVL_ONE_RATE = 17.00;
		final double SKILL_LVL_TWO_RATE = 20.00;
		final double SKILL_LVL_THREE_RATE = 22.00;
		// final overtime pay:
		final double LVL_ONE_OT = SKILL_LVL_ONE_RATE * 1.5;
		final double LVL_TWO_OT = SKILL_LVL_TWO_RATE * 1.5;
		final double LVL_THREE_OT = SKILL_LVL_THREE_RATE * 1.5;
		// final retirement percent:
		final double RETIRMENT = .03;
		double totalPay = 0.0, regularPay, otPay = 0.0;
		double grossPay, retirementDeduction, totalDeductions = 0.0;
		String workerLevelString, hoursWorkedString;
		int workerLevel, hoursWorked, medIns, dentalIns, ltdIns, ot, invest;

		// Hours worked:
		hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours did the worker work? ");
		hoursWorked = Integer.parseInt(hoursWorkedString);

		// Workers level:
		do {
		workerLevelString = JOptionPane.showInputDialog("What skill level is the worker? Enter 1,2,3 for subsequent level");
		workerLevel = Integer.parseInt(workerLevelString);
		} while(workerLevel > 3);

		// I need to write a JOption pane window to get the choices for ins:
		medIns = JOptionPane.showConfirmDialog(null, "Do you want medical ins? ", "Yes", JOptionPane.YES_NO_OPTION);
		// this returns 1 if no is selected.

		dentalIns = JOptionPane.showConfirmDialog(null, "Do you want dental ins?", "Yes", JOptionPane.YES_NO_OPTION);
		// This will return 1 if no is selected:

		ltdIns = JOptionPane.showConfirmDialog(null, "Do you want ltd ins?", "Yes", JOptionPane.YES_NO_OPTION);
		// This will return 1 if no is selected:


		// body:
		// I need to now get and assign new values to the variables:
		if(workerLevel == 1)
		{
			// skill level one:
			if(hoursWorked > 40)
			{
				regularPay = SKILL_LVL_ONE_RATE * 40;
				ot = hoursWorked - 40;
				otPay = ot * LVL_ONE_OT;
				totalPay = regularPay + otPay;
				grossPay = totalPay;
			}
			else
			{
				totalPay = hoursWorked * SKILL_LVL_ONE_RATE;
				regularPay = totalPay;
				grossPay = totalPay;
			}	
		}
		else if(workerLevel == 2)
		{
			// skill level two:
			if(hoursWorked > 40)
			{
				regularPay = SKILL_LVL_TWO_RATE * 40;
				ot = hoursWorked - 40;
				otPay = ot * LVL_TWO_OT;
				totalPay = regularPay + otPay;
				grossPay = totalPay;
				if(medIns == 0)
				{
					totalPay = totalPay - MED_INS;
					totalDeductions = MED_INS;
				}
				if(dentalIns == 0){
					totalPay = totalPay - DENTAL_INS;
					totalDeductions = totalDeductions + DENTAL_INS;
				}
				if(ltdIns == 0)
				{
					totalPay = totalPay - LTD_INS;
					totalDeductions = totalDeductions + LTD_INS;
				}
			}
			else
			{
				
				totalPay = hoursWorked * SKILL_LVL_TWO_RATE;
				regularPay = totalPay;
				grossPay = totalPay;
				if(medIns == 0)
				{
					totalPay = totalPay - MED_INS;
					totalDeductions = MED_INS;
				}
				if(dentalIns == 0){
					totalPay = totalPay - DENTAL_INS;
					totalDeductions = totalDeductions + DENTAL_INS;
				}
				if(ltdIns == 0)
				{
					totalPay = totalPay - LTD_INS;
					totalDeductions = totalDeductions + LTD_INS;
				}
			}
		}
		else
		{
			// skill level three:
			if(hoursWorked > 40)
			{
				regularPay = SKILL_LVL_THREE_RATE * 40;
				ot = hoursWorked - 40;
				otPay = ot * LVL_THREE_OT;
				totalPay = regularPay + otPay;
				grossPay = totalPay;
				if(medIns == 0)
				{
					totalPay = totalPay - MED_INS;
					totalDeductions = MED_INS;
				}
				if(dentalIns == 0){
					totalPay = totalPay - DENTAL_INS;
					totalDeductions = totalDeductions + DENTAL_INS;
				}
				if(ltdIns == 0)
				{
					totalPay = totalPay - LTD_INS;
					totalDeductions = totalDeductions + LTD_INS;
				}
				// invest:
				invest = JOptionPane.showConfirmDialog(null, "Would you like to invest 3 percent into retirement?", "Yes", JOptionPane.YES_NO_OPTION);
				// This will return 1 if no is selected:
				if(invest == 0)
				{
					retirementDeduction = grossPay * RETIRMENT;
					totalPay = totalPay - retirementDeduction;
				}

			}
			else
			{
				totalPay = hoursWorked * SKILL_LVL_THREE_RATE;
				regularPay = totalPay;
				grossPay = totalPay;
				if(medIns == 0)
				{
					totalPay = totalPay - MED_INS;
					totalDeductions = MED_INS;
				}
				if(dentalIns == 0){
					totalPay = totalPay - DENTAL_INS;
					totalDeductions = totalDeductions + DENTAL_INS;
				}
				if(ltdIns == 0)
				{
					totalPay = totalPay - LTD_INS;
					totalDeductions = totalDeductions + LTD_INS;
				}
				// invest:
				invest = JOptionPane.showConfirmDialog(null, "Would you like to invest 3 percent into retirement?", "Yes", JOptionPane.YES_NO_OPTION);
				// This will return 1 if no is selected:
				if(invest == 0)
				{
					retirementDeduction = grossPay * RETIRMENT;
					totalPay = totalPay - retirementDeduction;
				}
			}
		}
		
		// Print statements:
		// Hours worked:
		System.out.println("These are the total hours worked: " + hoursWorked);
		// Hourly rate:
		switch(workerLevel)
		{
			case 1:
				System.out.println("The workers hourly pay rate is: " + SKILL_LVL_ONE_RATE);
				break;
			case 2:
				System.out.println("The workers hourly pay rate is: " + SKILL_LVL_TWO_RATE);
				break;
			case 3:
				System.out.println("The workers hourly pay rate is: " + SKILL_LVL_THREE_RATE);
				break;
		}
		// regular pay:
		System.out.println("The workers regular pay is: " + regularPay);
		// OT pay:
		System.out.println("The workers over time pay is: " + otPay);
		// Total Deductions:
		System.out.println("The workers total deductions are: " + totalDeductions);
		// Net pay:
		System.out.println("The net pay of the worker is: " + totalPay);

		// JOptionPane to show the workers gross pay:
		JOptionPane.showMessageDialog(null, "The workers gross pay is: $" + grossPay);
	}
}