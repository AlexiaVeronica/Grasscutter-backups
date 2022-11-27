package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

public class PacketMcoinExchangeHcoinRsp extends BasePacket {

    public PacketMcoinExchangeHcoinRsp(int retCode) {
        super(PacketOpcodes.McoinExchangeHcoinRsp);

        McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp proto = McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.newBuilder()
                .setRetcode(retCode)
                .build();

        this.setData(proto);
    }
}
