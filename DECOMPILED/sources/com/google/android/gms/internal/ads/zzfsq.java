package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsq extends AbstractC6097l implements InterfaceC5371p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfrv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfsq(zzfrv zzfrvVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzfrvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        zzfsq zzfsqVar = new zzfsq(this.zzb, interfaceC1875e);
        zzfsqVar.zza = obj;
        return zzfsqVar;
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsq) create((zzfrz) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        AbstractC2005b.m8369e();
        AbstractC1437o.m6082b(obj);
        zzfsb zzfsbVarZza = zzfsa.zza((zzfrx) ((zzfrz) this.zza).zzcc());
        zzhll zzhllVarZzb = zzfsbVarZza.zzb();
        zzfrv zzfrvVar = this.zzb;
        String strZza = zzfrvVar.zza();
        AbstractC6118n.m27186d(strZza, "getGwsQueryId(...)");
        zzfsbVarZza.zzc(zzhllVarZzb, strZza, zzfrvVar);
        return zzfsbVarZza.zza();
    }
}
