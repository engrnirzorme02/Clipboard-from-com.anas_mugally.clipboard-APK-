package p091L1;

import android.graphics.Bitmap;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: L1.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0805Z implements InterfaceC0134j {

    /* JADX INFO: renamed from: L1.Z$a */
    private static final class a implements InterfaceC0301v {

        /* JADX INFO: renamed from: a */
        private final Bitmap f3231a;

        a(Bitmap bitmap) {
            this.f3231a = bitmap;
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f3231a;
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: b */
        public void mo1436b() {
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: c */
        public int mo1437c() {
            return AbstractC2023l.m8417h(this.f3231a);
        }

        @Override // p035E1.InterfaceC0301v
        /* JADX INFO: renamed from: d */
        public Class mo1438d() {
            return Bitmap.class;
        }
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(Bitmap bitmap, int i7, int i8, C0132h c0132h) {
        return new a(bitmap);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(Bitmap bitmap, C0132h c0132h) {
        return true;
    }
}
