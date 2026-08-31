package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p232e0.C5250a;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: loaded from: classes.dex */
public class C2568p {

    /* JADX INFO: renamed from: d */
    private static final ThreadLocal f9899d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    private final int f9900a;

    /* JADX INFO: renamed from: b */
    private final C2566n f9901b;

    /* JADX INFO: renamed from: c */
    private volatile int f9902c = 0;

    C2568p(C2566n c2566n, int i7) {
        this.f9901b = c2566n;
        this.f9900a = i7;
    }

    /* JADX INFO: renamed from: g */
    private C5250a m11846g() {
        ThreadLocal threadLocal = f9899d;
        C5250a c5250a = (C5250a) threadLocal.get();
        if (c5250a == null) {
            c5250a = new C5250a();
            threadLocal.set(c5250a);
        }
        this.f9901b.m11826d().m24260j(c5250a, this.f9900a);
        return c5250a;
    }

    /* JADX INFO: renamed from: a */
    public void m11847a(Canvas canvas, float f7, float f8, Paint paint) {
        Typeface typefaceM11829g = this.f9901b.m11829g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM11829g);
        canvas.drawText(this.f9901b.m11825c(), this.f9900a * 2, 2, f7, f8, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: b */
    public int m11848b(int i7) {
        return m11846g().m24249h(i7);
    }

    /* JADX INFO: renamed from: c */
    public int m11849c() {
        return m11846g().m24250i();
    }

    /* JADX INFO: renamed from: d */
    public int m11850d() {
        return this.f9902c & 3;
    }

    /* JADX INFO: renamed from: e */
    public int m11851e() {
        return m11846g().m24252k();
    }

    /* JADX INFO: renamed from: f */
    public int m11852f() {
        return m11846g().m24253l();
    }

    /* JADX INFO: renamed from: h */
    public short m11853h() {
        return m11846g().m24254m();
    }

    /* JADX INFO: renamed from: i */
    public int m11854i() {
        return m11846g().m24255n();
    }

    /* JADX INFO: renamed from: j */
    public boolean m11855j() {
        return m11846g().m24251j();
    }

    /* JADX INFO: renamed from: k */
    public boolean m11856k() {
        return (this.f9902c & 4) > 0;
    }

    /* JADX INFO: renamed from: l */
    public void m11857l(boolean z7) {
        int iM11850d = m11850d();
        if (z7) {
            this.f9902c = iM11850d | 4;
        } else {
            this.f9902c = iM11850d;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m11858m(boolean z7) {
        int i7 = this.f9902c & 4;
        this.f9902c = z7 ? i7 | 2 : i7 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m11852f()));
        sb.append(", codepoints:");
        int iM11849c = m11849c();
        for (int i7 = 0; i7 < iM11849c; i7++) {
            sb.append(Integer.toHexString(m11848b(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
