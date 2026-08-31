package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: androidx.cardview.widget.a */
/* JADX INFO: loaded from: classes.dex */
class C2385a implements InterfaceC2387c {
    C2385a() {
    }

    /* JADX INFO: renamed from: p */
    private C2388d m10227p(InterfaceC2386b interfaceC2386b) {
        return (C2388d) interfaceC2386b.mo10225e();
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: a */
    public void mo10228a(InterfaceC2386b interfaceC2386b, Context context, ColorStateList colorStateList, float f7, float f8, float f9) {
        interfaceC2386b.mo10222b(new C2388d(colorStateList, f7));
        View viewMo10226f = interfaceC2386b.mo10226f();
        viewMo10226f.setClipToOutline(true);
        viewMo10226f.setElevation(f8);
        mo10242o(interfaceC2386b, f9);
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: b */
    public void mo10229b(InterfaceC2386b interfaceC2386b, float f7) {
        m10227p(interfaceC2386b).m10251h(f7);
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: c */
    public float mo10230c(InterfaceC2386b interfaceC2386b) {
        return interfaceC2386b.mo10226f().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: d */
    public float mo10231d(InterfaceC2386b interfaceC2386b) {
        return m10227p(interfaceC2386b).m10248d();
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: e */
    public void mo10232e(InterfaceC2386b interfaceC2386b) {
        mo10242o(interfaceC2386b, mo10234g(interfaceC2386b));
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: f */
    public void mo10233f(InterfaceC2386b interfaceC2386b, float f7) {
        interfaceC2386b.mo10226f().setElevation(f7);
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: g */
    public float mo10234g(InterfaceC2386b interfaceC2386b) {
        return m10227p(interfaceC2386b).m10247c();
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: h */
    public ColorStateList mo10235h(InterfaceC2386b interfaceC2386b) {
        return m10227p(interfaceC2386b).m10246b();
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: i */
    public void mo10236i(InterfaceC2386b interfaceC2386b) {
        if (!interfaceC2386b.mo10224d()) {
            interfaceC2386b.mo10221a(0, 0, 0, 0);
            return;
        }
        float fMo10234g = mo10234g(interfaceC2386b);
        float fMo10231d = mo10231d(interfaceC2386b);
        int iCeil = (int) Math.ceil(AbstractC2389e.m10252a(fMo10234g, fMo10231d, interfaceC2386b.mo10223c()));
        int iCeil2 = (int) Math.ceil(AbstractC2389e.m10253b(fMo10234g, fMo10231d, interfaceC2386b.mo10223c()));
        interfaceC2386b.mo10221a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: j */
    public void mo10237j() {
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: k */
    public float mo10238k(InterfaceC2386b interfaceC2386b) {
        return mo10231d(interfaceC2386b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: l */
    public float mo10239l(InterfaceC2386b interfaceC2386b) {
        return mo10231d(interfaceC2386b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: m */
    public void mo10240m(InterfaceC2386b interfaceC2386b) {
        mo10242o(interfaceC2386b, mo10234g(interfaceC2386b));
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: n */
    public void mo10241n(InterfaceC2386b interfaceC2386b, ColorStateList colorStateList) {
        m10227p(interfaceC2386b).m10249f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC2387c
    /* JADX INFO: renamed from: o */
    public void mo10242o(InterfaceC2386b interfaceC2386b, float f7) {
        m10227p(interfaceC2386b).m10250g(f7, interfaceC2386b.mo10224d(), interfaceC2386b.mo10223c());
        mo10236i(interfaceC2386b);
    }
}
