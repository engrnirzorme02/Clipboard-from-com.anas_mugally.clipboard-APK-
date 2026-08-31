package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6662f;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6639V;

/* JADX INFO: loaded from: classes2.dex */
final class zzh extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzl zzlVar, String str, long j7, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, interfaceC1875e);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVarZzf;
        Object objM28176a;
        zzen zzenVar;
        Object objE = AbstractC2005b.m8369e();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            AbstractC1437o.m6082b(obj);
            objM28176a = obj;
        } else {
            AbstractC1437o.m6082b(obj);
            InterfaceC6624N interfaceC6624N = (InterfaceC6624N) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(AbstractC6672k.m28225b(interfaceC6624N, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null));
                }
            }
            InterfaceC6639V[] interfaceC6639VArr = (InterfaceC6639V[]) arrayList.toArray(new InterfaceC6639V[0]);
            InterfaceC6639V[] interfaceC6639VArr2 = (InterfaceC6639V[]) Arrays.copyOf(interfaceC6639VArr, interfaceC6639VArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            objM28176a = AbstractC6662f.m28176a(interfaceC6639VArr2, this);
            if (objM28176a == objE) {
                return objE;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) objM28176a).iterator();
        while (it.hasNext()) {
            Object objM6080i = ((C1436n) it.next()).m6080i();
            if (C1436n.m6078g(objM6080i)) {
                zzshVarZzf.zzh((zzsi) objM6080i);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
