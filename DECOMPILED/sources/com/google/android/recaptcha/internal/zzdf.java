package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzdf extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsp zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdf(zzdt zzdtVar, zzsp zzspVar, zzen zzenVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzdtVar;
        this.zzc = zzspVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzdf(this.zzb, this.zzc, this.zzd, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdf) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC2005b.m8369e();
        int i7 = this.zza;
        AbstractC1437o.m6082b(obj);
        if (i7 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsp zzspVar = this.zzc;
            zzfj zzfjVarZzh = zzdt.zzh(zzdtVar);
            zzbr zzbrVarZzd = zzdt.zzd(zzdtVar);
            this.zza = 1;
            obj = zzfjVarZzh.zzb(zzbrVarZzd, zzspVar, this);
            if (obj == objE) {
                return objE;
            }
        }
        zzsr zzsrVar = (zzsr) obj;
        this.zzd.zza();
        return zzsrVar;
    }
}
