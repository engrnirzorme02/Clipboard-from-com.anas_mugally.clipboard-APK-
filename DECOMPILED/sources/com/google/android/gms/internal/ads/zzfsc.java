package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p174X.InterfaceC1885E;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsc implements InterfaceC1885E {
    public static final zzfsc zza = new zzfsc();
    private static final zzfrz zzb;

    static {
        zzfrz zzfrzVarZzd = zzfrz.zzd();
        AbstractC6118n.m27186d(zzfrzVarZzd, "getDefaultInstance(...)");
        zzb = zzfrzVarZzd;
    }

    private zzfsc() {
    }

    @Override // p174X.InterfaceC1885E
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // p174X.InterfaceC1885E
    public final Object readFrom(InputStream inputStream, InterfaceC1875e interfaceC1875e) {
        try {
            zzfrz zzfrzVarZzc = zzfrz.zzc(inputStream);
            AbstractC6118n.m27184b(zzfrzVarZzc);
            return zzfrzVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // p174X.InterfaceC1885E
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, InterfaceC1875e interfaceC1875e) {
        ((zzfrz) obj).zzaO(outputStream);
        return C1444v.f4971a;
    }
}
