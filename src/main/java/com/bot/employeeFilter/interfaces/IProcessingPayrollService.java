package com.bot.employeeFilter.interfaces;

import com.bot.employeeFilter.entity.*;
import com.bot.employeeFilter.model.Employee;
import com.bot.employeeFilter.model.FilterModel;
import com.bot.employeeFilter.model.PayrollMonthlyDetail;

import java.util.List;

public interface IProcessingPayrollService {
    List<?> getLeaveAndLOPService(int year, int month) throws Exception;
    String leaveApprovalService(Leave requestDetail) throws Exception;
    List<PayrollMonthlyDetail> getPayrollProcessingDetailService(int month, int year) throws Exception;
    List<Attendance> getAttendanceByPage(FilterModel filterModel) throws Exception;
    List<Employee> getJoineeAndExitingEmployeesService() throws Exception;
    List<BonusShiftOvertime> getBonusShiftOTService(int forMonth, int forYear) throws Exception;
    List<ReimbursementAdhocDeduction> getReimbursementAdhocDeductionService(int forMonth, int forYear) throws Exception;
    boolean holdSalaryDetailService(HikeBonusSalaryAdhoc hikeBonusSalaryAdhoc) throws Exception;
    List<HikeBonusSalaryAdhoc> filterHikeBonusSalaryAdhocService(FilterModel filterModel) throws Exception;
    String finalizeSalaryRunConfigService(SalaryRunConfigProcessing salaryRunConfigProcessing) throws Exception;
    List<BonusShiftOvertime> getBonusService(FilterModel filterModel) throws Exception;
    List<BonusShiftOvertime> getOvertimeService(FilterModel filterModel) throws Exception;
}
