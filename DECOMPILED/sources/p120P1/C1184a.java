package p120P1;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC3214a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p011B1.C0057c;
import p011B1.C0058d;
import p011B1.C0059e;
import p011B1.InterfaceC0055a;
import p019C1.C0132h;
import p019C1.EnumC0126b;
import p019C1.InterfaceC0134j;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;
import p083K1.C0735j;
import p183Y1.AbstractC2018g;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: P1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1184a implements InterfaceC0134j {

    /* JADX INFO: renamed from: f */
    private static final a f4219f = new a();

    /* JADX INFO: renamed from: g */
    private static final b f4220g = new b();

    /* JADX INFO: renamed from: a */
    private final Context f4221a;

    /* JADX INFO: renamed from: b */
    private final List f4222b;

    /* JADX INFO: renamed from: c */
    private final b f4223c;

    /* JADX INFO: renamed from: d */
    private final a f4224d;

    /* JADX INFO: renamed from: e */
    private final C1185b f4225e;

    /* JADX INFO: renamed from: P1.a$a */
    static class a {
        a() {
        }

        /* JADX INFO: renamed from: a */
        InterfaceC0055a m5204a(InterfaceC0055a.a aVar, C0057c c0057c, ByteBuffer byteBuffer, int i7) {
            return new C0059e(aVar, c0057c, byteBuffer, i7);
        }
    }

    /* JADX INFO: renamed from: P1.a$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private final Queue f4226a = AbstractC2023l.m8415f(0);

        b() {
        }

        /* JADX INFO: renamed from: a */
        synchronized C0058d m5205a(ByteBuffer byteBuffer) {
            C0058d c0058d;
            try {
                c0058d = (C0058d) this.f4226a.poll();
                if (c0058d == null) {
                    c0058d = new C0058d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c0058d.m242p(byteBuffer);
        }

        /* JADX INFO: renamed from: b */
        synchronized void m5206b(C0058d c0058d) {
            c0058d.m240a();
            this.f4226a.offer(c0058d);
        }
    }

    public C1184a(Context context, List list, InterfaceC0406d interfaceC0406d, InterfaceC0404b interfaceC0404b) {
        this(context, list, interfaceC0406d, interfaceC0404b, f4220g, f4219f);
    }

    /* JADX INFO: renamed from: c */
    private C1188e m5200c(ByteBuffer byteBuffer, int i7, int i8, C0058d c0058d, C0132h c0132h) {
        StringBuilder sb;
        long jM8393b = AbstractC2018g.m8393b();
        try {
            C0057c c0057cM241c = c0058d.m241c();
            if (c0057cM241c.m222b() > 0 && c0057cM241c.m223c() == 0) {
                Bitmap.Config config = c0132h.m600c(AbstractC1192i.f4266a) == EnumC0126b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC0055a interfaceC0055aM5204a = this.f4224d.m5204a(this.f4225e, c0057cM241c, byteBuffer, m5201e(c0057cM241c, i7, i8));
                interfaceC0055aM5204a.mo212f(config);
                interfaceC0055aM5204a.mo209c();
                Bitmap bitmapMo208b = interfaceC0055aM5204a.mo208b();
                if (bitmapMo208b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder();
                    }
                    return null;
                }
                C1188e c1188e = new C1188e(new C1186c(this.f4221a, interfaceC0055aM5204a, C0735j.m3497c(), i7, i8, bitmapMo208b));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC2018g.m8392a(jM8393b));
                }
                return c1188e;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("Decoded GIF from stream in ");
            sb.append(AbstractC2018g.m8392a(jM8393b));
            Log.v("BufferGifDecoder", sb.toString());
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC2018g.m8392a(jM8393b));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m5201e(C0057c c0057c, int i7, int i8) {
        int iMin = Math.min(c0057c.m221a() / i8, c0057c.m224d() / i7);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i7 + "x" + i8 + "], actual dimens: [" + c0057c.m224d() + "x" + c0057c.m221a() + "]");
        }
        return iMax;
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1188e mo605a(ByteBuffer byteBuffer, int i7, int i8, C0132h c0132h) {
        C0058d c0058dM5205a = this.f4223c.m5205a(byteBuffer);
        try {
            return m5200c(byteBuffer, i7, i8, c0058dM5205a, c0132h);
        } finally {
            this.f4223c.m5206b(c0058dM5205a);
        }
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(ByteBuffer byteBuffer, C0132h c0132h) {
        return !((Boolean) c0132h.m600c(AbstractC1192i.f4267b)).booleanValue() && AbstractC3214a.m17093g(this.f4222b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C1184a(Context context, List list, InterfaceC0406d interfaceC0406d, InterfaceC0404b interfaceC0404b, b bVar, a aVar) {
        this.f4221a = context.getApplicationContext();
        this.f4222b = list;
        this.f4224d = aVar;
        this.f4225e = new C1185b(interfaceC0406d, interfaceC0404b);
        this.f4223c = bVar;
    }
}
