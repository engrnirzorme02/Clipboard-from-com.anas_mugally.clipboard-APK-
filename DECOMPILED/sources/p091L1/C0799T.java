package p091L1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p035E1.InterfaceC0297r;
import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: L1.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0799T implements InterfaceC0301v, InterfaceC0297r {

    /* JADX INFO: renamed from: a */
    private final Resources f3211a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0301v f3212b;

    private C0799T(Resources resources, InterfaceC0301v interfaceC0301v) {
        this.f3211a = (Resources) AbstractC2022k.m8408e(resources);
        this.f3212b = (InterfaceC0301v) AbstractC2022k.m8408e(interfaceC0301v);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0301v m3741f(Resources resources, InterfaceC0301v interfaceC0301v) {
        if (interfaceC0301v == null) {
            return null;
        }
        return new C0799T(resources, interfaceC0301v);
    }

    @Override // p035E1.InterfaceC0297r
    /* JADX INFO: renamed from: a */
    public void mo1454a() {
        InterfaceC0301v interfaceC0301v = this.f3212b;
        if (interfaceC0301v instanceof InterfaceC0297r) {
            ((InterfaceC0297r) interfaceC0301v).mo1454a();
        }
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public void mo1436b() {
        this.f3212b.mo1436b();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return this.f3212b.mo1437c();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return BitmapDrawable.class;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f3211a, (Bitmap) this.f3212b.get());
    }
}
