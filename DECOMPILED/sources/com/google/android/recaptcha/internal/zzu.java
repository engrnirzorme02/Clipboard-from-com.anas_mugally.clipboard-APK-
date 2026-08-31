package com.google.android.recaptcha.internal;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
final class zzu extends AbstractC6097l implements InterfaceC5371p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(zzsc zzscVar, zzv zzvVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        return new zzu(this.zzd, this.zze, interfaceC1875e);
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        zzse zzseVarZzj;
        Iterator it;
        Object objE = AbstractC2005b.m8369e();
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzseVarZzj = (zzse) this.zza;
            AbstractC1437o.m6082b(obj);
        } else {
            AbstractC1437o.m6082b(obj);
            if (!this.zzd.zzS()) {
                C1436n.a aVar = C1436n.f4958b;
                return C1436n.m6072a(C1436n.m6073b(AbstractC1437o.m6081a(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            zzseVarZzj = this.zzd.zzj();
            if (zzseVarZzj.zzi().zzd() == 0) {
                C1436n.a aVar2 = C1436n.f4958b;
                return C1436n.m6072a(C1436n.m6073b(AbstractC1437o.m6081a(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            this.zze.zzc = zzseVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzseVarZzj, this) == objE) {
                return objE;
            }
        }
        C1436n.a aVar3 = C1436n.f4958b;
        return C1436n.m6072a(C1436n.m6073b(C1444v.f4971a));
    }
}
