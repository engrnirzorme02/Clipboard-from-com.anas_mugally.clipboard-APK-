package p029D3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import p223d.C5173c;
import p325p3.AbstractC6742c;

/* JADX INFO: renamed from: D3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0189a {

    /* JADX INFO: renamed from: a */
    private final TimeInterpolator f850a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b */
    protected final View f851b;

    /* JADX INFO: renamed from: c */
    protected final int f852c;

    /* JADX INFO: renamed from: d */
    protected final int f853d;

    /* JADX INFO: renamed from: e */
    protected final int f854e;

    /* JADX INFO: renamed from: f */
    private C5173c f855f;

    public AbstractC0189a(View view) {
        this.f851b = view;
        Context context = view.getContext();
        this.f852c = AbstractC0196h.m978f(context, AbstractC6742c.f26226K, 300);
        this.f853d = AbstractC0196h.m978f(context, AbstractC6742c.f26230O, 150);
        this.f854e = AbstractC0196h.m978f(context, AbstractC6742c.f26229N, 100);
    }

    /* JADX INFO: renamed from: a */
    public float m939a(float f7) {
        return this.f850a.getInterpolation(f7);
    }

    /* JADX INFO: renamed from: b */
    protected C5173c m940b() {
        if (this.f855f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C5173c c5173c = this.f855f;
        this.f855f = null;
        return c5173c;
    }

    /* JADX INFO: renamed from: c */
    public C5173c m941c() {
        C5173c c5173c = this.f855f;
        this.f855f = null;
        return c5173c;
    }

    /* JADX INFO: renamed from: d */
    protected void m942d(C5173c c5173c) {
        this.f855f = c5173c;
    }

    /* JADX INFO: renamed from: e */
    protected C5173c m943e(C5173c c5173c) {
        if (this.f855f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C5173c c5173c2 = this.f855f;
        this.f855f = c5173c;
        return c5173c2;
    }
}
