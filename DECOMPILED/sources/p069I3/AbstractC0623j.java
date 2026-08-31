package p069I3;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.AbstractC4546v;

/* JADX INFO: renamed from: I3.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0623j {
    /* JADX INFO: renamed from: a */
    static AbstractC0618e m2746a(int i7) {
        if (i7 != 0) {
            return i7 != 1 ? m2747b() : new C0619f();
        }
        return new C0626m();
    }

    /* JADX INFO: renamed from: b */
    static AbstractC0618e m2747b() {
        return new C0626m();
    }

    /* JADX INFO: renamed from: c */
    static C0620g m2748c() {
        return new C0620g();
    }

    /* JADX INFO: renamed from: d */
    public static void m2749d(View view, float f7) {
        Drawable background = view.getBackground();
        if (background instanceof C0622i) {
            ((C0622i) background).m2717f0(f7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2750e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C0622i) {
            m2751f(view, (C0622i) background);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2751f(View view, C0622i c0622i) {
        if (c0622i.m2711W()) {
            c0622i.m2722k0(AbstractC4546v.m20832g(view));
        }
    }
}
