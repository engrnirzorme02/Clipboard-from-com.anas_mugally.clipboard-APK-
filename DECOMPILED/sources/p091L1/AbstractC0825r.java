package p091L1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p035E1.InterfaceC0301v;
import p043F1.C0407e;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: L1.r */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0825r {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0406d f3290a = new a();

    /* JADX INFO: renamed from: L1.r$a */
    class a extends C0407e {
        a() {
        }

        @Override // p043F1.C0407e, p043F1.InterfaceC0406d
        /* JADX INFO: renamed from: c */
        public void mo1745c(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC0301v m3871a(InterfaceC0406d interfaceC0406d, Drawable drawable, int i7, int i8) {
        Bitmap bitmapM3872b;
        Drawable current = drawable.getCurrent();
        boolean z7 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM3872b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM3872b = null;
        } else {
            bitmapM3872b = m3872b(interfaceC0406d, current, i7, i8);
            z7 = true;
        }
        if (!z7) {
            interfaceC0406d = f3290a;
        }
        return C0814g.m3805f(bitmapM3872b, interfaceC0406d);
    }

    /* JADX INFO: renamed from: b */
    private static Bitmap m3872b(InterfaceC0406d interfaceC0406d, Drawable drawable, int i7, int i8) {
        if (i7 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i8 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i7 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i8 = drawable.getIntrinsicHeight();
        }
        Lock lockM3764i = AbstractC0804Y.m3764i();
        lockM3764i.lock();
        Bitmap bitmapMo1746d = interfaceC0406d.mo1746d(i7, i8, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo1746d);
            drawable.setBounds(0, 0, i7, i8);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo1746d;
        } finally {
            lockM3764i.unlock();
        }
    }
}
