package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: androidx.core.widget.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2453d {

    /* JADX INFO: renamed from: androidx.core.widget.d$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m10732a(EdgeEffect edgeEffect, float f7, float f8) {
            edgeEffect.onPull(f7, f8);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m10733a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* JADX INFO: renamed from: b */
        public static float m10734b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: c */
        public static float m10735c(EdgeEffect edgeEffect, float f7, float f8) {
            try {
                return edgeEffect.onPullDistance(f7, f8);
            } catch (Throwable unused) {
                edgeEffect.onPull(f7, f8);
                return 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static EdgeEffect m10728a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m10733a(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: b */
    public static float m10729b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m10734b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m10730c(EdgeEffect edgeEffect, float f7, float f8) {
        a.m10732a(edgeEffect, f7, f8);
    }

    /* JADX INFO: renamed from: d */
    public static float m10731d(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m10735c(edgeEffect, f7, f8);
        }
        m10730c(edgeEffect, f7, f8);
        return f7;
    }
}
