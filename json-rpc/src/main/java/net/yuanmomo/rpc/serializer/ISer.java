package net.yuanmomo.rpc.serializer;

public interface ISer<S,D> {
	public D serialize(S obj) ;
}
