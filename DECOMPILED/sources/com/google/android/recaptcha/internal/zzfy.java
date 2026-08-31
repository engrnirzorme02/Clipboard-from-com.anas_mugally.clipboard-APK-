package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5371p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy extends zzfx {
    private final InterfaceC5371p zza;
    private final String zzb;

    public zzfy(InterfaceC5371p interfaceC5371p, String str, Object obj) {
        super(obj);
        this.zza = interfaceC5371p;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection collectionJ;
        if (!AbstractC6118n.m27183a(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            collectionJ = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                collectionJ.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            collectionJ = AbstractC1638q.m6765j();
        }
        zztfVarZzf.zze(collectionJ);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        InterfaceC5371p interfaceC5371p = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        interfaceC5371p.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
