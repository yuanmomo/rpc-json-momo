package net.yuanmomo.rpc.serializer;

public interface IDeser<S,D> {
	public D deserialize(S obj) ;
}
