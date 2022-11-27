package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;

public class PacketMusicGameStartToPlayOthersBeatmapRsp extends BasePacket {

	public PacketMusicGameStartToPlayOthersBeatmapRsp(MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum unknownEnum1) {
		super(PacketOpcodes.MusicGameStartToPlayOthersBeatmapRsp);

        var proto = MusicGameStartToPlayOthersBeatmapRspOuterClass.MusicGameStartToPlayOthersBeatmapRsp.newBuilder();

        proto.setUnknownEnum1(unknownEnum1);

        this.setData(proto);
	}
}
