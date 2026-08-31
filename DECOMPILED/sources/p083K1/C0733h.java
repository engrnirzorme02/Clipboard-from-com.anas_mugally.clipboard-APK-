package p083K1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.EnumC0126b;
import p019C1.EnumC0133i;
import p091L1.AbstractC0823p;
import p091L1.C0796P;
import p091L1.C0824q;

/* JADX INFO: renamed from: K1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0733h implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    private final C0796P f2906a = C0796P.m3726b();

    /* JADX INFO: renamed from: b */
    private final int f2907b;

    /* JADX INFO: renamed from: c */
    private final int f2908c;

    /* JADX INFO: renamed from: d */
    private final EnumC0126b f2909d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0823p f2910e;

    /* JADX INFO: renamed from: f */
    private final boolean f2911f;

    /* JADX INFO: renamed from: g */
    private final EnumC0133i f2912g;

    /* JADX INFO: renamed from: K1.h$a */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C0733h(int i7, int i8, C0132h c0132h) {
        this.f2907b = i7;
        this.f2908c = i8;
        this.f2909d = (EnumC0126b) c0132h.m600c(C0824q.f3276f);
        this.f2910e = (AbstractC0823p) c0132h.m600c(AbstractC0823p.f3271h);
        C0131g c0131g = C0824q.f3280j;
        this.f2911f = c0132h.m600c(c0131g) != null && ((Boolean) c0132h.m600c(c0131g)).booleanValue();
        this.f2912g = (EnumC0133i) c0132h.m600c(C0824q.f3277g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f2906a.m3730f(this.f2907b, this.f2908c, this.f2911f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f2909d == EnumC0126b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f2907b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f2908c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo3843b = this.f2910e.mo3843b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo3843b);
        int iRound2 = Math.round(size.getHeight() * fMo3843b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fMo3843b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC0133i enumC0133i = this.f2912g;
        if (enumC0133i != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC0133i == EnumC0133i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
