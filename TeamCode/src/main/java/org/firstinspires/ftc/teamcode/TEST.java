package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Eric D'Urso on 8/15/2017.
 * Eric Says Hi
 */
@TeleOp (name = "ColorSensor")
public class TEST extends OpMode {
    private com.qualcomm.robotcore.hardware.ColorSensor ColorSensor;

    @Override
    public void init() {
        ColorSensor = hardwareMap.colorSensor.get("ColorSensor");
    }

    @Override
    public void loop() {

        ColorSensor.enableLed(true);

            telemetry.addData("red", ColorSensor.red());
            telemetry.addData("green", ColorSensor.green());
            telemetry.addData("blue", ColorSensor.blue());
            telemetry.addData("rgb", ColorSensor.argb());
            telemetry.addData("ALPHA?", ColorSensor.alpha());//alpha = brightness


    }
}
