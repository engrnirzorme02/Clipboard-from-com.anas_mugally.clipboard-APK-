package p176X1;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: X1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1941a implements InterfaceC0130f {

    /* JADX INFO: renamed from: b */
    private final int f6431b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0130f f6432c;

    private C1941a(int i7, InterfaceC0130f interfaceC0130f) {
        this.f6431b = i7;
        this.f6432c = interfaceC0130f;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0130f m7993c(Context context) {
        return new C1941a(context.getResources().getConfiguration().uiMode & 48, AbstractC1942b.m7996c(context));
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        this.f6432c.mo590a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f6431b).array());
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C1941a) {
            C1941a c1941a = (C1941a) obj;
            if (this.f6431b == c1941a.f6431b && this.f6432c.equals(c1941a.f6432c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        return AbstractC2023l.m8424o(this.f6432c, this.f6431b);
    }
}
