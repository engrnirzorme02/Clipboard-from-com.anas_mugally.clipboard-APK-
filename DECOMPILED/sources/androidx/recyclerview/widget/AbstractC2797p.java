package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2797p extends RecyclerView.AbstractC2762m {

    /* JADX INFO: renamed from: g */
    boolean f11243g = true;

    /* JADX INFO: renamed from: A */
    public abstract boolean mo13711A(RecyclerView.AbstractC2749E abstractC2749E);

    /* JADX INFO: renamed from: B */
    public final void m13878B(RecyclerView.AbstractC2749E abstractC2749E) {
        m13886J(abstractC2749E);
        m13344h(abstractC2749E);
    }

    /* JADX INFO: renamed from: C */
    public final void m13879C(RecyclerView.AbstractC2749E abstractC2749E) {
        m13887K(abstractC2749E);
    }

    /* JADX INFO: renamed from: D */
    public final void m13880D(RecyclerView.AbstractC2749E abstractC2749E, boolean z7) {
        m13888L(abstractC2749E, z7);
        m13344h(abstractC2749E);
    }

    /* JADX INFO: renamed from: E */
    public final void m13881E(RecyclerView.AbstractC2749E abstractC2749E, boolean z7) {
        m13889M(abstractC2749E, z7);
    }

    /* JADX INFO: renamed from: F */
    public final void m13882F(RecyclerView.AbstractC2749E abstractC2749E) {
        m13890N(abstractC2749E);
        m13344h(abstractC2749E);
    }

    /* JADX INFO: renamed from: G */
    public final void m13883G(RecyclerView.AbstractC2749E abstractC2749E) {
        m13891O(abstractC2749E);
    }

    /* JADX INFO: renamed from: H */
    public final void m13884H(RecyclerView.AbstractC2749E abstractC2749E) {
        m13892P(abstractC2749E);
        m13344h(abstractC2749E);
    }

    /* JADX INFO: renamed from: I */
    public final void m13885I(RecyclerView.AbstractC2749E abstractC2749E) {
        m13893Q(abstractC2749E);
    }

    /* JADX INFO: renamed from: J */
    public void m13886J(RecyclerView.AbstractC2749E abstractC2749E) {
    }

    /* JADX INFO: renamed from: K */
    public void m13887K(RecyclerView.AbstractC2749E abstractC2749E) {
    }

    /* JADX INFO: renamed from: L */
    public void m13888L(RecyclerView.AbstractC2749E abstractC2749E, boolean z7) {
    }

    /* JADX INFO: renamed from: M */
    public void m13889M(RecyclerView.AbstractC2749E abstractC2749E, boolean z7) {
    }

    /* JADX INFO: renamed from: N */
    public void m13890N(RecyclerView.AbstractC2749E abstractC2749E) {
    }

    /* JADX INFO: renamed from: O */
    public void m13891O(RecyclerView.AbstractC2749E abstractC2749E) {
    }

    /* JADX INFO: renamed from: P */
    public void m13892P(RecyclerView.AbstractC2749E abstractC2749E) {
    }

    /* JADX INFO: renamed from: Q */
    public void m13893Q(RecyclerView.AbstractC2749E abstractC2749E) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: a */
    public boolean mo13338a(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2) {
        int i7;
        int i8;
        return (cVar == null || ((i7 = cVar.f10932a) == (i8 = cVar2.f10932a) && cVar.f10933b == cVar2.f10933b)) ? mo13717x(abstractC2749E) : mo13719z(abstractC2749E, i7, cVar.f10933b, i8, cVar2.f10933b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: b */
    public boolean mo13339b(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2) {
        int i7;
        int i8;
        int i9 = cVar.f10932a;
        int i10 = cVar.f10933b;
        if (abstractC2749E2.m13265N()) {
            int i11 = cVar.f10932a;
            i8 = cVar.f10933b;
            i7 = i11;
        } else {
            i7 = cVar2.f10932a;
            i8 = cVar2.f10933b;
        }
        return mo13718y(abstractC2749E, abstractC2749E2, i9, i10, i7, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: c */
    public boolean mo13340c(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2) {
        int i7 = cVar.f10932a;
        int i8 = cVar.f10933b;
        View view = abstractC2749E.f10894a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f10932a;
        int top = cVar2 == null ? view.getTop() : cVar2.f10933b;
        if (abstractC2749E.m13290z() || (i7 == left && i8 == top)) {
            return mo13711A(abstractC2749E);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo13719z(abstractC2749E, i7, i8, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: d */
    public boolean mo13341d(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2) {
        int i7 = cVar.f10932a;
        int i8 = cVar2.f10932a;
        if (i7 != i8 || cVar.f10933b != cVar2.f10933b) {
            return mo13719z(abstractC2749E, i7, cVar.f10933b, i8, cVar2.f10933b);
        }
        m13882F(abstractC2749E);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2762m
    /* JADX INFO: renamed from: f */
    public boolean mo13342f(RecyclerView.AbstractC2749E abstractC2749E) {
        return !this.f11243g || abstractC2749E.m13288x();
    }

    /* JADX INFO: renamed from: x */
    public abstract boolean mo13717x(RecyclerView.AbstractC2749E abstractC2749E);

    /* JADX INFO: renamed from: y */
    public abstract boolean mo13718y(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2749E abstractC2749E2, int i7, int i8, int i9, int i10);

    /* JADX INFO: renamed from: z */
    public abstract boolean mo13719z(RecyclerView.AbstractC2749E abstractC2749E, int i7, int i8, int i9, int i10);
}
