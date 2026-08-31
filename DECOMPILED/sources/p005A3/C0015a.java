package p005A3;

import android.content.Context;
import android.graphics.Color;
import p033E.AbstractC0246a;
import p045F3.AbstractC0422b;
import p325p3.AbstractC6742c;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: A3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0015a {

    /* JADX INFO: renamed from: f */
    private static final int f85f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    private final boolean f86a;

    /* JADX INFO: renamed from: b */
    private final int f87b;

    /* JADX INFO: renamed from: c */
    private final int f88c;

    /* JADX INFO: renamed from: d */
    private final int f89d;

    /* JADX INFO: renamed from: e */
    private final float f90e;

    public C0015a(Context context) {
        this(AbstractC0422b.m1818b(context, AbstractC6742c.f26270o, false), AbstractC7539a.m33171b(context, AbstractC6742c.f26268n, 0), AbstractC7539a.m33171b(context, AbstractC6742c.f26266m, 0), AbstractC7539a.m33171b(context, AbstractC6742c.f26262k, 0), context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: e */
    private boolean m79e(int i7) {
        return AbstractC0246a.m1182k(i7, 255) == this.f89d;
    }

    /* JADX INFO: renamed from: a */
    public float m80a(float f7) {
        float f8 = this.f90e;
        if (f8 <= 0.0f || f7 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f7 / f8)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public int m81b(int i7, float f7) {
        int i8;
        float fM80a = m80a(f7);
        int iAlpha = Color.alpha(i7);
        int iM33179j = AbstractC7539a.m33179j(AbstractC0246a.m1182k(i7, 255), this.f87b, fM80a);
        if (fM80a > 0.0f && (i8 = this.f88c) != 0) {
            iM33179j = AbstractC7539a.m33178i(iM33179j, AbstractC0246a.m1182k(i8, f85f));
        }
        return AbstractC0246a.m1182k(iM33179j, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public int m82c(int i7, float f7) {
        return (this.f86a && m79e(i7)) ? m81b(i7, f7) : i7;
    }

    /* JADX INFO: renamed from: d */
    public boolean m83d() {
        return this.f86a;
    }

    public C0015a(boolean z7, int i7, int i8, int i9, float f7) {
        this.f86a = z7;
        this.f87b = i7;
        this.f88c = i8;
        this.f89d = i9;
        this.f90e = f7;
    }
}
