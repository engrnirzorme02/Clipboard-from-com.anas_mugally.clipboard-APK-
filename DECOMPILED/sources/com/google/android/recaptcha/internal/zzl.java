package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6626O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        AbstractC1638q.m6780w(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j7, InterfaceC1875e interfaceC1875e) {
        return AbstractC6626O.m28102e(new zzh(this, str, j7, null), interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object zzc(long j7, zzsc zzscVar, zzek zzekVar, InterfaceC1875e interfaceC1875e) {
        zzi zziVar;
        if (interfaceC1875e instanceof zzi) {
            zziVar = (zzi) interfaceC1875e;
            int i7 = zziVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, interfaceC1875e);
            }
        } else {
            zziVar = new zzi(this, interfaceC1875e);
        }
        Object objM28102e = zziVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zziVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM28102e);
            zzk zzkVar = new zzk(this, zzekVar, j7, zzscVar, null);
            zziVar.zzc = 1;
            objM28102e = AbstractC6626O.m28102e(zzkVar, zziVar);
            if (objM28102e == objE) {
                return objE;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(objM28102e);
        }
        return ((C1436n) objM28102e).m6080i();
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i7, AbstractC6112h abstractC6112h) {
        List listJ = AbstractC1638q.m6765j();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) listJ.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
