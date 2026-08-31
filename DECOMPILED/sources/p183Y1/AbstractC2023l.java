package p183Y1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p155U1.AbstractC1658a;

/* JADX INFO: renamed from: Y1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2023l {

    /* JADX INFO: renamed from: a */
    private static final char[] f6710a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f6711b = new char[64];

    /* JADX INFO: renamed from: c */
    private static volatile Handler f6712c;

    /* JADX INFO: renamed from: Y1.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6713a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f6713a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6713a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6713a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6713a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6713a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8410a() {
        if (!m8427r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8411b(AbstractC1658a abstractC1658a, AbstractC1658a abstractC1658a2) {
        if (abstractC1658a == null) {
            return abstractC1658a2 == null;
        }
        return abstractC1658a.m6928D(abstractC1658a2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8412c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8413d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: e */
    private static String m8414e(byte[] bArr, char[] cArr) {
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            int i8 = i7 * 2;
            char[] cArr2 = f6710a;
            cArr[i8] = cArr2[(b7 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: f */
    public static Queue m8415f(int i7) {
        return new ArrayDeque(i7);
    }

    /* JADX INFO: renamed from: g */
    public static int m8416g(int i7, int i8, Bitmap.Config config) {
        return i7 * i8 * m8418i(config);
    }

    /* JADX INFO: renamed from: h */
    public static int m8417h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: i */
    public static int m8418i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i7 = a.f6713a[config.ordinal()];
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2 && i7 != 3) {
                return i7 != 4 ? 4 : 8;
            }
        }
        return i8;
    }

    /* JADX INFO: renamed from: j */
    public static List m8419j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private static Handler m8420k() {
        if (f6712c == null) {
            synchronized (AbstractC2023l.class) {
                try {
                    if (f6712c == null) {
                        f6712c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6712c;
    }

    /* JADX INFO: renamed from: l */
    public static int m8421l(float f7) {
        return m8422m(f7, 17);
    }

    /* JADX INFO: renamed from: m */
    public static int m8422m(float f7, int i7) {
        return m8423n(Float.floatToIntBits(f7), i7);
    }

    /* JADX INFO: renamed from: n */
    public static int m8423n(int i7, int i8) {
        return (i8 * 31) + i7;
    }

    /* JADX INFO: renamed from: o */
    public static int m8424o(Object obj, int i7) {
        return m8423n(obj == null ? 0 : obj.hashCode(), i7);
    }

    /* JADX INFO: renamed from: p */
    public static int m8425p(boolean z7, int i7) {
        return m8423n(z7 ? 1 : 0, i7);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m8426q() {
        return !m8427r();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m8427r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8428s(int i7) {
        return i7 > 0 || i7 == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m8429t(int i7, int i8) {
        return m8428s(i7) && m8428s(i8);
    }

    /* JADX INFO: renamed from: u */
    public static void m8430u(Runnable runnable) {
        m8420k().postAtFrontOfQueue(runnable);
    }

    /* JADX INFO: renamed from: v */
    public static void m8431v(Runnable runnable) {
        m8420k().post(runnable);
    }

    /* JADX INFO: renamed from: w */
    public static void m8432w(Runnable runnable) {
        m8420k().removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: x */
    public static String m8433x(byte[] bArr) {
        String strM8414e;
        char[] cArr = f6711b;
        synchronized (cArr) {
            strM8414e = m8414e(bArr, cArr);
        }
        return strM8414e;
    }
}
