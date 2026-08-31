package p069I3;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import p365u3.AbstractC7159a;

/* JADX INFO: renamed from: I3.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0631r {

    /* JADX INFO: renamed from: c */
    C0627n f2476c;

    /* JADX INFO: renamed from: a */
    boolean f2474a = false;

    /* JADX INFO: renamed from: b */
    boolean f2475b = false;

    /* JADX INFO: renamed from: d */
    RectF f2477d = new RectF();

    /* JADX INFO: renamed from: e */
    final Path f2478e = new Path();

    /* JADX INFO: renamed from: a */
    public static AbstractC0631r m2879a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new C0633t(view) : new C0632s(view);
    }

    /* JADX INFO: renamed from: c */
    private boolean m2880c() {
        RectF rectF = this.f2477d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    /* JADX INFO: renamed from: j */
    private void m2881j() {
        if (!m2880c() || this.f2476c == null) {
            return;
        }
        C0628o.m2822l().m2827e(this.f2476c, 1.0f, this.f2477d, this.f2478e);
    }

    /* JADX INFO: renamed from: b */
    abstract void mo2882b(View view);

    /* JADX INFO: renamed from: d */
    public void m2883d(Canvas canvas, AbstractC7159a.a aVar) {
        if (!mo2888i() || this.f2478e.isEmpty()) {
            aVar.mo20873a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f2478e);
        aVar.mo20873a(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m2884e(View view, RectF rectF) {
        this.f2477d = rectF;
        m2881j();
        mo2882b(view);
    }

    /* JADX INFO: renamed from: f */
    public void m2885f(View view, C0627n c0627n) {
        this.f2476c = c0627n;
        m2881j();
        mo2882b(view);
    }

    /* JADX INFO: renamed from: g */
    public void m2886g(View view, boolean z7) {
        if (z7 != this.f2474a) {
            this.f2474a = z7;
            mo2882b(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2887h(View view, boolean z7) {
        this.f2475b = z7;
        mo2882b(view);
    }

    /* JADX INFO: renamed from: i */
    abstract boolean mo2888i();
}
