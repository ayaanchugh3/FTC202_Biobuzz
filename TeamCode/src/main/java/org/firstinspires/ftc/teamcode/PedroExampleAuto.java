package org.firstinspires.ftc.teamcode;

import static com.pedropathing.api.Paths.line;

import com.pedropathing.follower.Follower;
import com.pedropathing.math.Pose;
import com.pedropathing.paths.Path;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.pedro.Constants;

@Disabled
@Autonomous(name = "Pedro Example Auto", group = "Pedro")
public class PedroExampleAuto extends OpMode {

    private static final Pose START_POSE = new Pose(12, 12, 0);
    private static final Pose END_POSE = new Pose(36, 12, 0);

    private Follower follower;
    private Path path;

    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
        follower.setPose(START_POSE);
        path = line(START_POSE, END_POSE).constant(START_POSE);
    }

    @Override
    public void start() {
        follower.follow(path);
    }

    @Override
    public void loop() {
        follower.update();

        Pose pose = follower.pose();
        telemetry.addData("x", pose.x());
        telemetry.addData("y", pose.y());
        telemetry.addData("heading (rad)", pose.heading());
        telemetry.addData("busy", follower.isBusy());
        telemetry.update();
    }

    @Override
    public void stop() {
        follower.stop();
    }
}
