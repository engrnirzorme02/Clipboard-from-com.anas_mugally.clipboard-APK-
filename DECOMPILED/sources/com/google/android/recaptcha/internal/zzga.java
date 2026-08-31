package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listJ;
        if (!AbstractC6118n.m27183a(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr == null || (listJ = AbstractC1631j.m6690c(objArr)) == null) {
            listJ = AbstractC1638q.m6765j();
        }
        zzfzVar.zzb(listJ);
        return true;
    }
}
