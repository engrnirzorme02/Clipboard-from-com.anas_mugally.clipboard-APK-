package p127Q1;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p019C1.C0132h;
import p035E1.InterfaceC0301v;
import p099M1.C0885b;

/* JADX INFO: renamed from: Q1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1247a implements InterfaceC1251e {

    /* JADX INFO: renamed from: a */
    private final Bitmap.CompressFormat f4471a;

    /* JADX INFO: renamed from: b */
    private final int f4472b;

    public C1247a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p127Q1.InterfaceC1251e
    /* JADX INFO: renamed from: a */
    public InterfaceC0301v mo5496a(InterfaceC0301v interfaceC0301v, C0132h c0132h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC0301v.get()).compress(this.f4471a, this.f4472b, byteArrayOutputStream);
        interfaceC0301v.mo1436b();
        return new C0885b(byteArrayOutputStream.toByteArray());
    }

    public C1247a(Bitmap.CompressFormat compressFormat, int i7) {
        this.f4471a = compressFormat;
        this.f4472b = i7;
    }
}
