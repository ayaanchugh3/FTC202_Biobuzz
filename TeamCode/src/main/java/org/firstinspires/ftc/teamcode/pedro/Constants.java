package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.follower.Follower;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Constants {
    private Constants() {
    }

    public static Follower create(HardwareMap hardwareMap) {
        throw new IllegalStateException(
                "Pedro Pathing requires the finished robot's drivetrain and localizer configuration."
        );
    }
}
