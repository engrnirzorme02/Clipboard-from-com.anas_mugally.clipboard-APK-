package p333q3;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p272j0.C5823a;
import p272j0.C5824b;
import p272j0.C5825c;

/* JADX INFO: renamed from: q3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6826a {

    /* JADX INFO: renamed from: a */
    public static final TimeInterpolator f27404a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final TimeInterpolator f27405b = new C5824b();

    /* JADX INFO: renamed from: c */
    public static final TimeInterpolator f27406c = new C5823a();

    /* JADX INFO: renamed from: d */
    public static final TimeInterpolator f27407d = new C5825c();

    /* JADX INFO: renamed from: e */
    public static final TimeInterpolator f27408e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m29843a(float f7, float f8, float f9) {
        return f7 + (f9 * (f8 - f7));
    }

    /* JADX INFO: renamed from: b */
    public static float m29844b(float f7, float f8, float f9, float f10, float f11) {
        if (f11 <= f9) {
            return f7;
        }
        return f11 >= f10 ? f8 : m29843a(f7, f8, (f11 - f9) / (f10 - f9));
    }

    /* JADX INFO: renamed from: c */
    public static int m29845c(int i7, int i8, float f7) {
        return i7 + Math.round(f7 * (i8 - i7));
    }
}
