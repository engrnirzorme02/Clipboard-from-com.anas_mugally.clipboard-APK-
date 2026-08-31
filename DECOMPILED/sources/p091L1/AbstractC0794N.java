package p091L1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p183Y1.AbstractC2017f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: L1.N */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0794N {

    /* JADX INFO: renamed from: L1.N$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private static final ColorMatrixColorFilter f3191a = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});

        /* JADX INFO: renamed from: a */
        public static Gainmap m3719a(Gainmap gainmap) {
            Bitmap gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() != Bitmap.Config.ALPHA_8) {
                return gainmap;
            }
            Gainmap gainmapM3878a = AbstractC0832y.m3878a(m3720b(gainmapContents));
            float[] ratioMin = gainmap.getRatioMin();
            gainmapM3878a.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
            float[] ratioMax = gainmap.getRatioMax();
            gainmapM3878a.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
            float[] gamma = gainmap.getGamma();
            gainmapM3878a.setGamma(gamma[0], gamma[1], gamma[2]);
            float[] epsilonSdr = gainmap.getEpsilonSdr();
            gainmapM3878a.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
            float[] epsilonHdr = gainmap.getEpsilonHdr();
            gainmapM3878a.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
            gainmapM3878a.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
            gainmapM3878a.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
            return gainmapM3878a;
        }

        /* JADX INFO: renamed from: b */
        private static Bitmap m3720b(Bitmap bitmap) {
            AbstractC2022k.m8404a(bitmap.getConfig() == Bitmap.Config.ALPHA_8);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(f3191a);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.setBitmap(null);
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: renamed from: L1.N$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private static final AbstractC2017f.b f3192a = AbstractC2017f.m8391a(new AbstractC2017f.b() { // from class: L1.O
            @Override // p183Y1.AbstractC2017f.b
            public final Object get() {
                return Boolean.valueOf(AbstractC0794N.b.m3723c());
            }
        });

        /* JADX INFO: renamed from: c */
        private static boolean m3723c() {
            if (Build.VERSION.SDK_INT != 34) {
                return false;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            boolean z7 = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z7);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
            return z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static boolean m3724d(BitmapFactory.Options options) {
            if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                return ((Boolean) f3192a.get()).booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m3713a(FileDescriptor fileDescriptor, BitmapFactory.Options options, InterfaceC0797Q interfaceC0797Q) {
        return (Build.VERSION.SDK_INT == 34 && b.m3724d(options) && m3715c(interfaceC0797Q)) ? m3716d(fileDescriptor, options) : BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m3714b(InputStream inputStream, BitmapFactory.Options options, InterfaceC0797Q interfaceC0797Q) {
        return (Build.VERSION.SDK_INT == 34 && b.m3724d(options) && m3715c(interfaceC0797Q)) ? m3717e(inputStream, options) : BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3715c(InterfaceC0797Q interfaceC0797Q) {
        try {
            boolean zMo3735c = interfaceC0797Q.mo3735c();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zMo3735c;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zMo3735c);
            return zMo3735c;
        } catch (IOException e7) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Bitmap m3716d(FileDescriptor fileDescriptor, BitmapFactory.Options options) throws Throwable {
        Throwable th;
        Bitmap bitmapDecodeFileDescriptor;
        Bitmap.Config config = options.inPreferredConfig;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        AbstractC2022k.m8404a(config == config2);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                if (bitmapDecodeFileDescriptor != null) {
                    bitmapDecodeFileDescriptor.recycle();
                }
                options.inPreferredConfig = config2;
                return null;
            }
            try {
                Bitmap bitmapM3718f = m3718f(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = config2;
                return bitmapM3718f;
            } catch (Throwable th2) {
                th = th2;
                if (bitmapDecodeFileDescriptor != null) {
                    bitmapDecodeFileDescriptor.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmapDecodeFileDescriptor = null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Bitmap m3717e(InputStream inputStream, BitmapFactory.Options options) throws Throwable {
        Throwable th;
        Bitmap bitmapDecodeStream;
        Bitmap.Config config = options.inPreferredConfig;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        AbstractC2022k.m8404a(config == config2);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                options.inPreferredConfig = config2;
                return null;
            }
            try {
                Bitmap bitmapM3718f = m3718f(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = config2;
                return bitmapM3718f;
            } catch (Throwable th2) {
                th = th2;
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bitmapDecodeStream = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static Bitmap m3718f(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            bitmap.setGainmap(a.m3719a(gainmap));
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }
}
