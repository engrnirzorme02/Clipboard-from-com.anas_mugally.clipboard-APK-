package p106N1;

import android.graphics.drawable.Drawable;
import p035E1.InterfaceC0301v;

/* JADX INFO: renamed from: N1.k */
/* JADX INFO: loaded from: classes.dex */
final class C0945k extends AbstractC0944j {
    private C0945k(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: renamed from: f */
    static InterfaceC0301v m4197f(Drawable drawable) {
        if (drawable != null) {
            return new C0945k(drawable);
        }
        return null;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public void mo1436b() {
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return Math.max(1, this.f3657a.getIntrinsicWidth() * this.f3657a.getIntrinsicHeight() * 4);
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return this.f3657a.getClass();
    }
}
