package info.batey.kafka.unit;

import kafka.serializer.Decoder;

public class ByteArrayDecoder implements Decoder<byte[]> {
    @Override
    public byte[] fromBytes(byte[] bytes) {
        return bytes;
    }
}
