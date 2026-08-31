package p091L1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.EnumC0126b;
import p019C1.EnumC0133i;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;
import p183Y1.AbstractC2018g;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: L1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0824q {

    /* JADX INFO: renamed from: f */
    public static final C0131g f3276f = C0131g.m595f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC0126b.f682c);

    /* JADX INFO: renamed from: g */
    public static final C0131g f3277g = C0131g.m594e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h */
    public static final C0131g f3278h = AbstractC0823p.f3271h;

    /* JADX INFO: renamed from: i */
    public static final C0131g f3279i;

    /* JADX INFO: renamed from: j */
    public static final C0131g f3280j;

    /* JADX INFO: renamed from: k */
    private static final Set f3281k;

    /* JADX INFO: renamed from: l */
    private static final b f3282l;

    /* JADX INFO: renamed from: m */
    private static final Set f3283m;

    /* JADX INFO: renamed from: n */
    private static final Queue f3284n;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0406d f3285a;

    /* JADX INFO: renamed from: b */
    private final DisplayMetrics f3286b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0404b f3287c;

    /* JADX INFO: renamed from: d */
    private final List f3288d;

    /* JADX INFO: renamed from: e */
    private final C0796P f3289e = C0796P.m3726b();

    /* JADX INFO: renamed from: L1.q$a */
    class a implements b {
        a() {
        }

        @Override // p091L1.C0824q.b
        /* JADX INFO: renamed from: a */
        public void mo3754a() {
        }

        @Override // p091L1.C0824q.b
        /* JADX INFO: renamed from: b */
        public void mo3755b(InterfaceC0406d interfaceC0406d, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: L1.q$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo3754a();

        /* JADX INFO: renamed from: b */
        void mo3755b(InterfaceC0406d interfaceC0406d, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3279i = C0131g.m595f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3280j = C0131g.m595f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3281k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3282l = new a();
        f3283m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f3284n = AbstractC2023l.m8415f(0);
    }

    public C0824q(List list, DisplayMetrics displayMetrics, InterfaceC0406d interfaceC0406d, InterfaceC0404b interfaceC0404b) {
        this.f3288d = list;
        this.f3286b = (DisplayMetrics) AbstractC2022k.m8408e(displayMetrics);
        this.f3285a = (InterfaceC0406d) AbstractC2022k.m8408e(interfaceC0406d);
        this.f3287c = (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b);
    }

    /* JADX INFO: renamed from: a */
    private static int m3845a(double d7) {
        int iM3853l = m3853l(d7);
        int iM3862x = m3862x(((double) iM3853l) * d7);
        return m3862x((d7 / ((double) (iM3862x / iM3853l))) * ((double) iM3862x));
    }

    /* JADX INFO: renamed from: b */
    private void m3846b(InterfaceC0797Q interfaceC0797Q, EnumC0126b enumC0126b, boolean z7, boolean z8, BitmapFactory.Options options, int i7, int i8) {
        boolean zHasAlpha;
        if (this.f3289e.m3731g(i7, i8, options, z7, z8)) {
            return;
        }
        if (enumC0126b == EnumC0126b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC0797Q.mo3737e().hasAlpha();
        } catch (IOException e7) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC0126b, e7);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m3847c(ImageHeaderParser.ImageType imageType, InterfaceC0797Q interfaceC0797Q, b bVar, InterfaceC0406d interfaceC0406d, AbstractC0823p abstractC0823p, int i7, int i8, int i9, int i10, int i11, BitmapFactory.Options options) {
        int i12;
        int i13;
        int i14;
        int iFloor;
        int iFloor2;
        if (i8 <= 0 || i9 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i10 + "x" + i11 + "]");
                return;
            }
            return;
        }
        if (m3856r(i7)) {
            i13 = i8;
            i12 = i9;
        } else {
            i12 = i8;
            i13 = i9;
        }
        float fMo3843b = abstractC0823p.mo3843b(i12, i13, i10, i11);
        if (fMo3843b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo3843b + " from: " + abstractC0823p + ", source: [" + i8 + "x" + i9 + "], target: [" + i10 + "x" + i11 + "]");
        }
        AbstractC0823p.g gVarMo3842a = abstractC0823p.mo3842a(i12, i13, i10, i11);
        if (gVarMo3842a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f7 = i12;
        float f8 = i13;
        int i15 = i12;
        int i16 = i13;
        int iM3862x = i15 / m3862x(fMo3843b * f7);
        int iM3862x2 = i16 / m3862x(fMo3843b * f8);
        AbstractC0823p.g gVar = AbstractC0823p.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarMo3842a == gVar ? Math.max(iM3862x, iM3862x2) : Math.min(iM3862x, iM3862x2)));
        if (gVarMo3842a == gVar && iMax < 1.0f / fMo3843b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            i14 = 0;
            iFloor = (int) Math.ceil(f7 / fMin);
            iFloor2 = (int) Math.ceil(f8 / fMin);
            int i17 = iMax / 8;
            if (i17 > 0) {
                iFloor /= i17;
                iFloor2 /= i17;
            }
        } else {
            i14 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f9 = iMax;
                iFloor = (int) Math.floor(f7 / f9);
                iFloor2 = (int) Math.floor(f8 / f9);
            } else if (imageType.isWebp()) {
                float f10 = iMax;
                iFloor = Math.round(f7 / f10);
                iFloor2 = Math.round(f8 / f10);
            } else if (i15 % iMax == 0 && i16 % iMax == 0) {
                iFloor = i15 / iMax;
                iFloor2 = i16 / iMax;
            } else {
                int[] iArrM3854m = m3854m(interfaceC0797Q, options, bVar, interfaceC0406d);
                iFloor = iArrM3854m[0];
                iFloor2 = iArrM3854m[1];
            }
        }
        double dMo3843b = abstractC0823p.mo3843b(iFloor, iFloor2, i10, i11);
        options.inTargetDensity = m3845a(dMo3843b);
        options.inDensity = m3853l(dMo3843b);
        if (m3857s(options)) {
            options.inScaled = true;
        } else {
            int i18 = i14;
            options.inTargetDensity = i18;
            options.inDensity = i18;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i8 + "x" + i9 + "], degreesToRotate: " + i7 + ", target: [" + i10 + "x" + i11 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fMo3843b + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dMo3843b + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC0301v m3848d(InterfaceC0797Q interfaceC0797Q, int i7, int i8, C0132h c0132h, b bVar) {
        byte[] bArr = (byte[]) this.f3287c.mo1739e(65536, byte[].class);
        BitmapFactory.Options optionsM3852k = m3852k();
        optionsM3852k.inTempStorage = bArr;
        EnumC0126b enumC0126b = (EnumC0126b) c0132h.m600c(f3276f);
        EnumC0133i enumC0133i = (EnumC0133i) c0132h.m600c(f3277g);
        AbstractC0823p abstractC0823p = (AbstractC0823p) c0132h.m600c(AbstractC0823p.f3271h);
        boolean zBooleanValue = ((Boolean) c0132h.m600c(f3279i)).booleanValue();
        C0131g c0131g = f3280j;
        try {
            return C0814g.m3805f(m3849h(interfaceC0797Q, optionsM3852k, abstractC0823p, enumC0126b, enumC0133i, c0132h.m600c(c0131g) != null && ((Boolean) c0132h.m600c(c0131g)).booleanValue(), i7, i8, zBooleanValue, bVar), this.f3285a);
        } finally {
            m3860v(optionsM3852k);
            this.f3287c.mo1738d(bArr);
        }
    }

    /* JADX INFO: renamed from: h */
    private Bitmap m3849h(InterfaceC0797Q interfaceC0797Q, BitmapFactory.Options options, AbstractC0823p abstractC0823p, EnumC0126b enumC0126b, EnumC0133i enumC0133i, boolean z7, int i7, int i8, boolean z8, b bVar) {
        String str;
        ColorSpace colorSpace;
        long jM8393b = AbstractC2018g.m8393b();
        int[] iArrM3854m = m3854m(interfaceC0797Q, options, bVar, this.f3285a);
        int i9 = iArrM3854m[0];
        int i10 = iArrM3854m[1];
        String str2 = options.outMimeType;
        boolean z9 = (i9 == -1 || i10 == -1) ? false : z7;
        int iMo3733a = interfaceC0797Q.mo3733a();
        int iM3765j = AbstractC0804Y.m3765j(iMo3733a);
        boolean zM3768m = AbstractC0804Y.m3768m(iMo3733a);
        int i11 = i7;
        if (i11 == Integer.MIN_VALUE) {
            i11 = m3856r(iM3765j) ? i10 : i9;
        }
        if (i8 == -2147483648) {
            i8 = m3856r(iM3765j) ? i9 : i10;
        }
        ImageHeaderParser.ImageType imageTypeMo3737e = interfaceC0797Q.mo3737e();
        m3847c(imageTypeMo3737e, interfaceC0797Q, bVar, this.f3285a, abstractC0823p, iM3765j, i9, i10, i11, i8, options);
        int i12 = i11;
        int i13 = i8;
        m3846b(interfaceC0797Q, enumC0126b, z9, zM3768m, options, i12, i13);
        int i14 = Build.VERSION.SDK_INT;
        if (m3864z(imageTypeMo3737e)) {
            if (i9 < 0 || i10 < 0 || !z8) {
                float f7 = m3857s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i15 = options.inSampleSize;
                float f8 = i15;
                int iCeil = (int) Math.ceil(i9 / f8);
                int iCeil2 = (int) Math.ceil(i10 / f8);
                int iRound = Math.round(iCeil * f7);
                int iRound2 = Math.round(iCeil2 * f7);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i9 + "x" + i10 + "], sampleSize: " + i15 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f7);
                }
                i12 = iRound;
                i13 = iRound2;
            } else {
                str = "Downsampler";
            }
            if (i12 > 0 && i13 > 0) {
                m3863y(options, this.f3285a, i12, i13);
            }
        } else {
            str = "Downsampler";
        }
        if (enumC0133i != null) {
            if (i14 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((enumC0133i == EnumC0133i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapM3850i = m3850i(interfaceC0797Q, options, bVar, this.f3285a);
        bVar.mo3755b(this.f3285a, bitmapM3850i);
        if (Log.isLoggable(str, 2)) {
            m3858t(i9, i10, str2, options, bitmapM3850i, i7, i8, jM8393b);
        }
        if (bitmapM3850i == null) {
            return null;
        }
        bitmapM3850i.setDensity(this.f3286b.densityDpi);
        Bitmap bitmapM3769n = AbstractC0804Y.m3769n(this.f3285a, bitmapM3850i, iMo3733a);
        if (!bitmapM3850i.equals(bitmapM3769n)) {
            this.f3285a.mo1745c(bitmapM3850i);
        }
        return bitmapM3769n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap m3850i(InterfaceC0797Q interfaceC0797Q, BitmapFactory.Options options, b bVar, InterfaceC0406d interfaceC0406d) {
        Bitmap bitmapM3850i;
        if (!options.inJustDecodeBounds) {
            bVar.mo3754a();
            interfaceC0797Q.mo3736d();
        }
        int i7 = options.outWidth;
        int i8 = options.outHeight;
        String str = options.outMimeType;
        AbstractC0804Y.m3764i().lock();
        try {
            try {
                bitmapM3850i = interfaceC0797Q.mo3734b(options);
            } catch (IllegalArgumentException e7) {
                IOException iOExceptionM3859u = m3859u(e7, i7, i8, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM3859u);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM3859u;
                }
                try {
                    interfaceC0406d.mo1745c(bitmap);
                    options.inBitmap = null;
                    bitmapM3850i = m3850i(interfaceC0797Q, options, bVar, interfaceC0406d);
                } catch (IOException unused) {
                    throw iOExceptionM3859u;
                }
            }
            AbstractC0804Y.m3764i().unlock();
            return bitmapM3850i;
        } catch (Throwable th) {
            AbstractC0804Y.m3764i().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    private static String m3851j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: k */
    private static synchronized BitmapFactory.Options m3852k() {
        BitmapFactory.Options options;
        Queue queue = f3284n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m3861w(options);
        }
        return options;
    }

    /* JADX INFO: renamed from: l */
    private static int m3853l(double d7) {
        if (d7 > 1.0d) {
            d7 = 1.0d / d7;
        }
        return (int) Math.round(d7 * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: m */
    private static int[] m3854m(InterfaceC0797Q interfaceC0797Q, BitmapFactory.Options options, b bVar, InterfaceC0406d interfaceC0406d) {
        options.inJustDecodeBounds = true;
        m3850i(interfaceC0797Q, options, bVar, interfaceC0406d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX INFO: renamed from: n */
    private static String m3855n(BitmapFactory.Options options) {
        return m3851j(options.inBitmap);
    }

    /* JADX INFO: renamed from: r */
    private static boolean m3856r(int i7) {
        return i7 == 90 || i7 == 270;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m3857s(BitmapFactory.Options options) {
        int i7;
        int i8 = options.inTargetDensity;
        return i8 > 0 && (i7 = options.inDensity) > 0 && i8 != i7;
    }

    /* JADX INFO: renamed from: t */
    private static void m3858t(int i7, int i8, String str, BitmapFactory.Options options, Bitmap bitmap, int i9, int i10, long j7) {
        Log.v("Downsampler", "Decoded " + m3851j(bitmap) + " from [" + i7 + "x" + i8 + "] " + str + " with inBitmap " + m3855n(options) + " for [" + i9 + "x" + i10 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC2018g.m8392a(j7));
    }

    /* JADX INFO: renamed from: u */
    private static IOException m3859u(IllegalArgumentException illegalArgumentException, int i7, int i8, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i7 + ", outHeight: " + i8 + ", outMimeType: " + str + ", inBitmap: " + m3855n(options), illegalArgumentException);
    }

    /* JADX INFO: renamed from: v */
    private static void m3860v(BitmapFactory.Options options) {
        m3861w(options);
        Queue queue = f3284n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* JADX INFO: renamed from: w */
    private static void m3861w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: x */
    private static int m3862x(double d7) {
        return (int) (d7 + 0.5d);
    }

    /* JADX INFO: renamed from: y */
    private static void m3863y(BitmapFactory.Options options, InterfaceC0406d interfaceC0406d, int i7, int i8) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = interfaceC0406d.mo1747e(i7, i8, config);
    }

    /* JADX INFO: renamed from: z */
    private boolean m3864z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0301v m3865e(ParcelFileDescriptor parcelFileDescriptor, int i7, int i8, C0132h c0132h) {
        return m3848d(new InterfaceC0797Q.c(parcelFileDescriptor, this.f3288d, this.f3287c), i7, i8, c0132h, f3282l);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0301v m3866f(InputStream inputStream, int i7, int i8, C0132h c0132h, b bVar) {
        return m3848d(new InterfaceC0797Q.b(inputStream, this.f3288d, this.f3287c), i7, i8, c0132h, bVar);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC0301v m3867g(ByteBuffer byteBuffer, int i7, int i8, C0132h c0132h) {
        return m3848d(new InterfaceC0797Q.a(byteBuffer, this.f3288d, this.f3287c), i7, i8, c0132h, f3282l);
    }

    /* JADX INFO: renamed from: o */
    public boolean m3868o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m17102c();
    }

    /* JADX INFO: renamed from: p */
    public boolean m3869p(InputStream inputStream) {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m3870q(ByteBuffer byteBuffer) {
        return true;
    }
}
