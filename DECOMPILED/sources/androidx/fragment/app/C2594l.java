package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public class C2594l {

    /* JADX INFO: renamed from: a */
    private final AbstractC2596n f10223a;

    private C2594l(AbstractC2596n abstractC2596n) {
        this.f10223a = abstractC2596n;
    }

    /* JADX INFO: renamed from: b */
    public static C2594l m12250b(AbstractC2596n abstractC2596n) {
        return new C2594l((AbstractC2596n) AbstractC0910g.m4140h(abstractC2596n, "callbacks == null"));
    }

    /* JADX INFO: renamed from: a */
    public void m12251a(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        AbstractC2596n abstractC2596n = this.f10223a;
        abstractC2596n.f10229e.m12387l(abstractC2596n, abstractC2596n, abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: c */
    public void m12252c() {
        this.f10223a.f10229e.m12404w();
    }

    /* JADX INFO: renamed from: d */
    public boolean m12253d(MenuItem menuItem) {
        return this.f10223a.f10229e.m12410z(menuItem);
    }

    /* JADX INFO: renamed from: e */
    public void m12254e() {
        this.f10223a.f10229e.m12326A();
    }

    /* JADX INFO: renamed from: f */
    public void m12255f() {
        this.f10223a.f10229e.m12330C();
    }

    /* JADX INFO: renamed from: g */
    public void m12256g() {
        this.f10223a.f10229e.m12343L();
    }

    /* JADX INFO: renamed from: h */
    public void m12257h() {
        this.f10223a.f10229e.m12351P();
    }

    /* JADX INFO: renamed from: i */
    public void m12258i() {
        this.f10223a.f10229e.m12353Q();
    }

    /* JADX INFO: renamed from: j */
    public void m12259j() {
        this.f10223a.f10229e.m12356S();
    }

    /* JADX INFO: renamed from: k */
    public boolean m12260k() {
        return this.f10223a.f10229e.m12366Z(true);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC2599q m12261l() {
        return this.f10223a.f10229e;
    }

    /* JADX INFO: renamed from: m */
    public void m12262m() {
        this.f10223a.f10229e.m12357S0();
    }

    /* JADX INFO: renamed from: n */
    public View m12263n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10223a.f10229e.m12405w0().onCreateView(view, str, context, attributeSet);
    }
}
