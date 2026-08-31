package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.cardview.widget.e */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2389e extends Drawable {

    /* JADX INFO: renamed from: a */
    private static final double f8446a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    static float m10252a(float f7, float f8, boolean z7) {
        return z7 ? (float) (((double) f7) + ((1.0d - f8446a) * ((double) f8))) : f7;
    }

    /* JADX INFO: renamed from: b */
    static float m10253b(float f7, float f8, boolean z7) {
        return z7 ? (float) (((double) (f7 * 1.5f)) + ((1.0d - f8446a) * ((double) f8))) : f7 * 1.5f;
    }
}
