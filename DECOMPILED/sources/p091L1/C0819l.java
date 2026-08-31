package p091L1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p019C1.InterfaceC0130f;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: L1.l */
/* JADX INFO: loaded from: classes.dex */
public class C0819l extends AbstractC0815h {

    /* JADX INFO: renamed from: b */
    private static final byte[] f3255b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0130f.f689a);

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        messageDigest.update(f3255b);
    }

    @Override // p091L1.AbstractC0815h
    /* JADX INFO: renamed from: c */
    protected Bitmap mo3807c(InterfaceC0406d interfaceC0406d, Bitmap bitmap, int i7, int i8) {
        return AbstractC0804Y.m3757b(interfaceC0406d, bitmap, i7, i8);
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        return obj instanceof C0819l;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return -599754482;
    }
}
