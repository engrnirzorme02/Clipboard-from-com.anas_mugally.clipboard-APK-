package p219c5;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: c5.g */
/* JADX INFO: loaded from: classes.dex */
public class C3024g {

    /* JADX INFO: renamed from: a */
    private static final byte f12451a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    private static final byte f12452b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: b */
    private static String m14993b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m14994c(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    /* JADX INFO: renamed from: a */
    public String m14995a() {
        byte[] bArrM14994c = m14994c(UUID.randomUUID(), new byte[17]);
        byte b7 = bArrM14994c[0];
        bArrM14994c[16] = b7;
        bArrM14994c[0] = (byte) ((b7 & f12452b) | f12451a);
        return m14993b(bArrM14994c);
    }
}
