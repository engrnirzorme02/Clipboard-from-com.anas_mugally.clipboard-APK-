package p043F1;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: F1.e */
/* JADX INFO: loaded from: classes.dex */
public class C0407e implements InterfaceC0406d {
    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: a */
    public void mo1743a(int i7) {
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: b */
    public void mo1744b() {
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: c */
    public void mo1745c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: d */
    public Bitmap mo1746d(int i7, int i8, Bitmap.Config config) {
        return Bitmap.createBitmap(i7, i8, config);
    }

    @Override // p043F1.InterfaceC0406d
    /* JADX INFO: renamed from: e */
    public Bitmap mo1747e(int i7, int i8, Bitmap.Config config) {
        return mo1746d(i7, i8, config);
    }
}
