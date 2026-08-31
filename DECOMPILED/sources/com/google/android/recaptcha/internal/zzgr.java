package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC6119o;
import p145S5.C1444v;
import p238e6.InterfaceC5371p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgr extends AbstractC6119o implements InterfaceC5371p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgr(zzgd zzgdVar, String str, int i7) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i7;
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i7 = this.zzc;
        if (i7 != -1) {
            this.zza.zzc().zze(i7, objArr);
        }
        return C1444v.f4971a;
    }
}
