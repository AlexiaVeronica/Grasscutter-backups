package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

public class PacketPlayerEnterDungeonRsp extends BasePacket {

	public PacketPlayerEnterDungeonRsp(int pointId, int dungeonId) {
		super(PacketOpcodes.PlayerEnterDungeonRsp);

		PlayerEnterDungeonRsp proto = PlayerEnterDungeonRsp.newBuilder()
				.setPointId(pointId)
				.setDungeonId(dungeonId)
				.build();

		this.setData(proto);
	}
}
