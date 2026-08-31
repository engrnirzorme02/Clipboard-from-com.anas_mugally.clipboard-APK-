package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2862d {
    /* JADX INFO: renamed from: a */
    public static Interpolator m14236a(Context context, int i7) {
        return AnimationUtils.loadInterpolator(context, i7);
    }
}
