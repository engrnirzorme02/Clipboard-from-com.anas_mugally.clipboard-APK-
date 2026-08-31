package p091L1;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;

/* JADX INFO: renamed from: L1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0818k implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final C0813f f3254a = new C0813f();

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(ByteBuffer byteBuffer, int i7, int i8, C0132h c0132h) {
        return this.f3254a.m3803c(ImageDecoder.createSource(byteBuffer), i7, i8, c0132h);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(ByteBuffer byteBuffer, C0132h c0132h) {
        return true;
    }
}
