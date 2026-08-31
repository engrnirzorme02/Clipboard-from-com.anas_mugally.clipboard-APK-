package p031D5;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p007A5.AbstractC0028a;

/* JADX INFO: renamed from: D5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0218a {

    /* JADX INFO: renamed from: a */
    private static Interpolator f932a;

    /* JADX INFO: renamed from: a */
    public static void m1101a(Context context, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(context, AbstractC0028a.f153c));
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m1102b(Context context) {
        if (f932a == null) {
            f932a = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        }
        return f932a;
    }
}
