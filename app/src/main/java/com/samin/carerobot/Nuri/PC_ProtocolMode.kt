package com.samin.carerobot.Nuri

import com.jeongmin.nurimotortester.Nuri.EnumCodesMap
import com.jeongmin.nurimotortester.Nuri.ProtocolMode

enum class PC_ProtocolMode(val byte: Byte) {
    //    StopRobot(0x00),
//    MODE_CARRY_HEAVY(0x01),
//    MODE_CARRY_HEIGHT(0x02),
//    MODE_BEHAVIOR_STAND(0x03),
//    MODE_BEHAVIOR_WALKHAND(0x04),
//    MODE_BEHAVIOR_WALKHUG(0x05),
//    MODE_CHANGE_CHANGEHUG(0x06),
//    MODE_CHANGE_TRANSFERSTAND(0x07),
//    MODE_CHANGE_TRANSFERHARNESS(0x08),
//    MODE_ALL_POSITION(0x09),
//    MODE_ALL_CHANGESLING(0x0A),
//    MODE_ALL_TRANSFERSLING(0x0B),
//    MODE_ALL_TRANSFERBEDRIDDENSLING(0x0C),
//    MODE_ALL_TRANSFERBEDRIDDENBOARD(0x0D),
//    MODE_ALL_TRANSFERCHAIR(0x0E),
//    RESET_SPEECH(0x0F),
//    USING_SPEECH(0x10),
//    PING(0X50),
//    REQ_MODE_CARRY_HEAVY(0x51),
//    REQ_MODE_CARRY_HEIGHT(0x52),
//    REQ_MODE_BEHAVIOR_STAND(0x53),
//    REQ_MODE_BEHAVIOR_WALKHAND(0x54),
//    REQ_MODE_BEHAVIOR_WALKHUG(0x55),
//    REQ_MODE_CHANGE_CHANGEHUG(0x56),
//    REQ_MODE_CHANGE_TRANSFERSTAND(0x57),
//    REQ_MODE_CHANGE_TRANSFERHARNESS(0x58),
//    REQ_MODE_ALL_POSITION(0x59),
//    REQ_MODE_ALL_CHANGESLING(0x5A),
//    REQ_MODE_ALL_TRANSFERSLING(0x5B),
//    REQ_MODE_ALL_TRANSFERBEDRIDDENSLING(0x5C),
//    REQ_MODE_ALL_TRANSFERBEDRIDDENBOARD(0x5D),
//    REQ_MODE_ALL_TRANSFERCHAIR(0x5E),
//    REQ_SPEECH(0x5F),
//    REQ_USING_SPEECH(0x60),
//    REQ_TOUCH(0x9E.toByte()),
//    REQ_FIRMWARE(0x9F.toByte()),
//    FEED_PING(0xA0.toByte()),
//    FEED_MODE_CARRY_HEAVY(0xA1.toByte()),
//    FEED_MODE_CARRY_HEIGHT(0xA20.toByte()),
//    FEED_MODE_BEHAVIOR_STAND(0xA3.toByte()),
//    FEED_MODE_BEHAVIOR_WALKHAND(0xA4.toByte()),
//    FEED_MODE_BEHAVIOR_WALKHUG(0xA5.toByte()),
//    FEED_MODE_CHANGE_CHANGEHUG(0xA6.toByte()),
//    FEED_MODE_CHANGE_TRANSFERSTAND(0xA7.toByte()),
//    FEED_MODE_CHANGE_TRANSFERHARNESS(0xA8.toByte()),
//    FEED_MODE_ALL_POSITION(0xA9.toByte()),
//    FEED_MODE_ALL_CHANGESLING(0xAA.toByte()),
//    FEED_MODE_ALL_TRANSFERSLING(0xAB.toByte()),
//    FEED_MODE_ALL_TRANSFERBEDRIDDENSLING(0xAC.toByte()),
//    FEED_MODE_ALL_TRANSFERBEDRIDDENBOARD(0xAD.toByte()),
//    FEED_MODE_ALL_TRANSFERCHAIR(0xAE.toByte()),
//    FEED_SPEECH(0xAF.toByte()),
//    FEED_USING_SPEECH(0xB0.toByte()),
//    FEED_TOUCH(0xEE.toByte()),
//    FEED_FIRMWARE(0xEF.toByte());
    StopRobot(0x00),
    MoveRobot(0x01),
    SETSPEED(0x02),
    FEEDSPEECH(0x03.toByte());



    companion object : EnumCodesMap<PC_ProtocolMode, Byte> by EnumCodesMap({ it.byte })
}