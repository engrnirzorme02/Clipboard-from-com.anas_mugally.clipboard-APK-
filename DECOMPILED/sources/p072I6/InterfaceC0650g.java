package p072I6;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: I6.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0650g extends InterfaceC0640B, ReadableByteChannel {
    /* JADX INFO: renamed from: E */
    boolean mo3009E();

    /* JADX INFO: renamed from: G0 */
    void mo3011G0(long j7);

    /* JADX INFO: renamed from: L0 */
    long mo3015L0();

    /* JADX INFO: renamed from: O */
    long mo3018O();

    /* JADX INFO: renamed from: O0 */
    InputStream mo3019O0();

    /* JADX INFO: renamed from: P */
    String mo3020P(long j7);

    /* JADX INFO: renamed from: U */
    void mo3026U(C0648e c0648e, long j7);

    /* JADX INFO: renamed from: b0 */
    String mo3035b0(Charset charset);

    /* JADX INFO: renamed from: f */
    C0648e mo3043f();

    /* JADX INFO: renamed from: l */
    void mo3052l(long j7);

    /* JADX INFO: renamed from: n0 */
    String mo3056n0();

    /* JADX INFO: renamed from: r */
    C0651h mo3063r(long j7);

    /* JADX INFO: renamed from: r0 */
    int mo3064r0(C0662s c0662s);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    /* JADX INFO: renamed from: s0 */
    byte[] mo3066s0(long j7);
}
