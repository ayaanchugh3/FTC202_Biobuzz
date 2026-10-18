package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class MecanumTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Declare our motors
        // Make sure your ID's match your configuration
        Robot robot = new Robot();

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
            robot.drive(gamepad1.left_stick_x * 1.1,-gamepad1.left_stick_y,gamepad1.right_stick_x);
        }
    }
}