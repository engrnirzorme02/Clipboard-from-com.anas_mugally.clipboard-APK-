package p120P1;

import android.util.Log;
import com.bumptech.glide.load.AbstractC3214a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0404b;

/* JADX INFO: renamed from: P1.j */
/* JADX INFO: loaded from: classes.dex */
public class C1193j implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final List f4268a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0134j f4269b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0404b f4270c;

    public C1193j(List list, InterfaceC0134j interfaceC0134j, InterfaceC0404b interfaceC0404b) {
        this.f4268a = list;
        this.f4269b = interfaceC0134j;
        this.f4270c = interfaceC0404b;
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m5248e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            }
        } catch (IOException e7) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e7);
            return null;
        }
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(InputStream inputStream, int i7, int i8, C0132h c0132h) {
        byte[] bArrM5248e = m5248e(inputStream);
        if (bArrM5248e == null) {
            return null;
        }
        return this.f4269b.mo605a(ByteBuffer.wrap(bArrM5248e), i7, i8, c0132h);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(InputStream inputStream, C0132h c0132h) {
        return !((Boolean) c0132h.m600c(AbstractC1192i.f4267b)).booleanValue() && AbstractC3214a.m17092f(this.f4268a, inputStream, this.f4270c) == ImageHeaderParser.ImageType.GIF;
    }
}
