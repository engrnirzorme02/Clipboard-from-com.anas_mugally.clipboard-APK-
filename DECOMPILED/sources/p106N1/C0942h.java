package p106N1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.AbstractC3214a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0404b;
import p083K1.C0733h;
import p183Y1.AbstractC2012a;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: N1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0942h {

    /* JADX INFO: renamed from: a */
    private final List f3651a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0404b f3652b;

    /* JADX INFO: renamed from: N1.h$a */
    private static final class a implements InterfaceC0301v {

        /* JADX INFO: renamed from: a */
        private final AnimatedImageDrawable f3653a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f3653a = animatedImageDrawable;
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f3653a;
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: b */
        public void mo1436b() {
            this.f3653a.stop();
            this.f3653a.clearAnimationCallbacks();
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: c */
        public int mo1437c() {
            return this.f3653a.getIntrinsicWidth() * this.f3653a.getIntrinsicHeight() * AbstractC2023l.m8418i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: d */
        public Class mo1438d() {
            return Drawable.class;
        }
    }

    /* JADX INFO: renamed from: N1.h$b */
    private static final class b implements InterfaceC0134j {

        /* JADX INFO: renamed from: a */
        private final C0942h f3654a;

        b(C0942h c0942h) {
            this.f3654a = c0942h;
        }

        @Override // p019C1.InterfaceC0134j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0301v mo605a(ByteBuffer byteBuffer, int i7, int i8, C0132h c0132h) {
            return this.f3654a.m4183b(ImageDecoder.createSource(byteBuffer), i7, i8, c0132h);
        }

        @Override // p019C1.InterfaceC0134j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo606b(ByteBuffer byteBuffer, C0132h c0132h) {
            return this.f3654a.m4185d(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: N1.h$c */
    private static final class c implements InterfaceC0134j {

        /* JADX INFO: renamed from: a */
        private final C0942h f3655a;

        c(C0942h c0942h) {
            this.f3655a = c0942h;
        }

        @Override // p019C1.InterfaceC0134j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0301v mo605a(InputStream inputStream, int i7, int i8, C0132h c0132h) {
            return this.f3655a.m4183b(ImageDecoder.createSource(AbstractC2012a.m8374b(inputStream)), i7, i8, c0132h);
        }

        @Override // p019C1.InterfaceC0134j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo606b(InputStream inputStream, C0132h c0132h) {
            return this.f3655a.m4184c(inputStream);
        }
    }

    private C0942h(List list, InterfaceC0404b interfaceC0404b) {
        this.f3651a = list;
        this.f3652b = interfaceC0404b;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0134j m4180a(List list, InterfaceC0404b interfaceC0404b) {
        return new b(new C0942h(list, interfaceC0404b));
    }

    /* JADX INFO: renamed from: e */
    private boolean m4181e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0134j m4182f(List list, InterfaceC0404b interfaceC0404b) {
        return new c(new C0942h(list, interfaceC0404b));
    }

    /* JADX INFO: renamed from: b */
    InterfaceC0301v m4183b(ImageDecoder.Source source, int i7, int i8, C0132h c0132h) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C0733h(i7, i8, c0132h));
        if (AbstractC0936b.m4174a(drawableDecodeDrawable)) {
            return new a(AbstractC0937c.m4175a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* JADX INFO: renamed from: c */
    boolean m4184c(InputStream inputStream) {
        return m4181e(AbstractC3214a.m17092f(this.f3651a, inputStream, this.f3652b));
    }

    /* JADX INFO: renamed from: d */
    boolean m4185d(ByteBuffer byteBuffer) {
        return m4181e(AbstractC3214a.m17093g(this.f3651a, byteBuffer));
    }
}
