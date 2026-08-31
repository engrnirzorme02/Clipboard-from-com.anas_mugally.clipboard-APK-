package p120P1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p019C1.C0132h;
import p019C1.EnumC0127c;
import p019C1.InterfaceC0135k;
import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2012a;

/* JADX INFO: renamed from: P1.d */
/* JADX INFO: loaded from: classes.dex */
public class C1187d implements InterfaceC0135k {
    @Override // p019C1.InterfaceC0135k
    /* JADX INFO: renamed from: b */
    public EnumC0127c mo607b(C0132h c0132h) {
        return EnumC0127c.SOURCE;
    }

    @Override // p019C1.InterfaceC0128d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo589a(InterfaceC0301v interfaceC0301v, File file, C0132h c0132h) throws Throwable {
        try {
            AbstractC2012a.m8378f(((C1186c) interfaceC0301v.get()).m5215c(), file);
            return true;
        } catch (IOException e7) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e7);
            return false;
        }
    }
}
