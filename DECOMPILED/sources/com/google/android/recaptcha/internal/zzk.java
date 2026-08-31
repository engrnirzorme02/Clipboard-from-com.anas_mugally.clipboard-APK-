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
final class zzk extends AbstractC6097l implements InterfaceC5371p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, zzek zzekVar, long j7, zzsc zzscVar, InterfaceC1875e interfaceC1875e) {
        super(2, interfaceC1875e);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j7;
        this.zze = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, interfaceC1875e);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // p238e6.InterfaceC5371p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((InterfaceC6624N) obj, (InterfaceC1875e) obj2)).invokeSuspend(C1444v.f4971a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public final Object invokeSuspend(Object obj) {
        Object objM28176a;
        zzen zzenVar;
        Object objM6073b;
        Object objE = AbstractC2005b.m8369e();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            AbstractC1437o.m6082b(obj);
            objM28176a = obj;
        } else {
            AbstractC1437o.m6082b(obj);
            InterfaceC6624N interfaceC6624N = (InterfaceC6624N) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC6672k.m28225b(interfaceC6624N, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null));
            }
            InterfaceC6639V[] interfaceC6639VArr = (InterfaceC6639V[]) arrayList.toArray(new InterfaceC6639V[0]);
            InterfaceC6639V[] interfaceC6639VArr2 = (InterfaceC6639V[]) Arrays.copyOf(interfaceC6639VArr, interfaceC6639VArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            objM28176a = AbstractC6662f.m28176a(interfaceC6639VArr2, this);
            if (objM28176a == objE) {
                return objE;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) objM28176a;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!C1436n.m6077f(((C1436n) it2.next()).m6080i())) {
                    zzenVar.zza();
                    objM6073b = C1436n.m6073b(C1444v.f4971a);
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            C1436n.a aVar = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar));
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            C1436n.a aVar2 = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar2));
        }
        return C1436n.m6072a(objM6073b);
    }
}
