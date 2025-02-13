package com.team2539.cougarswervelib;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public interface DriveController {
    Double getDriveMotor();

    void resetEncoder();

    void setReferenceVoltage(double voltage);

    double getStateVelocity();

    Double getMotorTemperature();

    WPI_TalonFX getRawDriveMotor();
}
