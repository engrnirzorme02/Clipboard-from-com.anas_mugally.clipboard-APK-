package p091L1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: L1.Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0804Y {

    /* JADX INFO: renamed from: a */
    private static final Paint f3226a = new Paint(6);

    /* JADX INFO: renamed from: b */
    private static final Paint f3227b = new Paint(7);

    /* JADX INFO: renamed from: c */
    private static final Paint f3228c;

    /* JADX INFO: renamed from: d */
    private static final Set f3229d;

    /* JADX INFO: renamed from: e */
    private static final Lock f3230e;

    /* JADX INFO: renamed from: L1.Y$a */
    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j7, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f3229d = hashSet;
        f3230e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f3228c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    private static void m3756a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f3230e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f3226a);
            m3760e(canvas);
        } finally {
            f3230e.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m3757b(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7, int i8) {
        float width;
        float height;
        if (bitmap.getWidth() == i7 && bitmap.getHeight() == i8) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i8 > bitmap.getHeight() * i7) {
            width = i8 / bitmap.getHeight();
            width2 = (i7 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i7 / bitmap.getWidth();
            height = (i8 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo1746d = interfaceC0406d.mo1746d(i7, i8, m3766k(bitmap));
        m3770o(bitmap, bitmapMo1746d);
        m3756a(bitmap, bitmapMo1746d, matrix);
        return bitmapMo1746d;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m3758c(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7, int i8) {
        if (bitmap.getWidth() > i7 || bitmap.getHeight() > i8) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m3761f(interfaceC0406d, bitmap, i7, i8);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m3759d(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7, int i8) {
        int iMin = Math.min(i7, i8);
        float f7 = iMin;
        float f8 = f7 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f7 / width, f7 / height);
        float f9 = width * fMax;
        float f10 = fMax * height;
        float f11 = (f7 - f9) / 2.0f;
        float f12 = (f7 - f10) / 2.0f;
        RectF rectF = new RectF(f11, f12, f9 + f11, f10 + f12);
        Bitmap bitmapM3762g = m3762g(interfaceC0406d, bitmap);
        Bitmap bitmapMo1746d = interfaceC0406d.mo1746d(iMin, iMin, m3763h(bitmap));
        bitmapMo1746d.setHasAlpha(true);
        Lock lock = f3230e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1746d);
            canvas.drawCircle(f8, f8, f8, f3227b);
            canvas.drawBitmap(bitmapM3762g, (Rect) null, rectF, f3228c);
            m3760e(canvas);
            lock.unlock();
            if (!bitmapM3762g.equals(bitmap)) {
                interfaceC0406d.mo1745c(bitmapM3762g);
            }
            return bitmapMo1746d;
        } catch (Throwable th) {
            f3230e.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m3760e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m3761f(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7, int i8) {
        if (bitmap.getWidth() != i7 || bitmap.getHeight() != i8) {
            float fMin = Math.min(i7 / bitmap.getWidth(), i8 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapMo1746d = interfaceC0406d.mo1746d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m3766k(bitmap));
                m3770o(bitmap, bitmapMo1746d);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i7 + "x" + i8);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapMo1746d.getWidth() + "x" + bitmapMo1746d.getHeight());
                    StringBuilder sb = new StringBuilder();
                    sb.append("minPct:   ");
                    sb.append(fMin);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                m3756a(bitmap, bitmapMo1746d, matrix);
                return bitmapMo1746d;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: g */
    private static Bitmap m3762g(InterfaceC0406d interfaceC0406d, Bitmap bitmap) {
        Bitmap.Config configM3763h = m3763h(bitmap);
        if (configM3763h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo1746d = interfaceC0406d.mo1746d(bitmap.getWidth(), bitmap.getHeight(), configM3763h);
        new Canvas(bitmapMo1746d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo1746d;
    }

    /* JADX INFO: renamed from: h */
    private static Bitmap.Config m3763h(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        return config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: i */
    public static Lock m3764i() {
        return f3230e;
    }

    /* JADX INFO: renamed from: j */
    public static int m3765j(int i7) {
        switch (i7) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    private static Bitmap.Config m3766k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: l */
    static void m3767l(int i7, Matrix matrix) {
        switch (i7) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3768m(int i7) {
        switch (i7) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m3769n(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7) {
        if (!m3768m(i7)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m3767l(i7, matrix);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: o */
    public static void m3770o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
