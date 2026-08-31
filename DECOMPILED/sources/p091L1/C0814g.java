package p091L1;

import android.graphics.Bitmap;
import p035E1.InterfaceC0297r;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: L1.g */
/* JADX INFO: loaded from: classes.dex */
public class C0814g implements InterfaceC0301v, InterfaceC0297r {

    /* JADX INFO: renamed from: a */
    private final Bitmap f3251a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0406d f3252b;

    public C0814g(Bitmap bitmap, InterfaceC0406d interfaceC0406d) {
        this.f3251a = (Bitmap) AbstractC2022k.m8409f(bitmap, "Bitmap must not be null");
        this.f3252b = (InterfaceC0406d) AbstractC2022k.m8409f(interfaceC0406d, "BitmapPool must not be null");
    }

    /* JADX INFO: renamed from: f */
    public static C0814g m3805f(Bitmap bitmap, InterfaceC0406d interfaceC0406d) {
        if (bitmap == null) {
            return null;
        }
        return new C0814g(bitmap, interfaceC0406d);
    }

    @Override // p035E1.InterfaceC0297r
    /* JADX INFO: renamed from: a */
    public void mo1454a() {
        this.f3251a.prepareToDraw();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public void mo1436b() {
        this.f3252b.mo1745c(this.f3251a);
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return AbstractC2023l.m8417h(this.f3251a);
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return Bitmap.class;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f3251a;
    }
}
