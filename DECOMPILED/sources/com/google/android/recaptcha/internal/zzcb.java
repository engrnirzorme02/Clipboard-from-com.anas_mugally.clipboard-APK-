package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1631j;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcb {
    private Object zza;
    private final InterfaceC7419a zzb = AbstractC7425g.m32877b(false, 1, null);

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(Object obj, InterfaceC1875e interfaceC1875e) {
        zzby zzbyVar;
        InterfaceC7419a interfaceC7419a;
        zzcb zzcbVar;
        if (interfaceC1875e instanceof zzby) {
            zzbyVar = (zzby) interfaceC1875e;
            int i7 = zzbyVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, interfaceC1875e);
            }
        } else {
            zzbyVar = new zzby(this, interfaceC1875e);
        }
        Object obj2 = zzbyVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzbyVar.zzd;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj2);
            interfaceC7419a = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = interfaceC7419a;
            zzbyVar.zzd = 1;
            if (interfaceC7419a.mo32856d(null, zzbyVar) == objE) {
                return objE;
            }
            zzcbVar = this;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC7419a interfaceC7419a2 = (InterfaceC7419a) zzbyVar.zza;
            zzje zzjeVar = zzbyVar.zzf;
            zzcbVar = zzbyVar.zze;
            AbstractC1437o.m6082b(obj2);
            interfaceC7419a = interfaceC7419a2;
            obj = zzjeVar;
        }
        try {
            return AbstractC6087b.m27120a(AbstractC6118n.m27183a(zzcbVar.zza, obj));
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(Object[] objArr, InterfaceC1875e interfaceC1875e) {
        zzbz zzbzVar;
        InterfaceC7419a interfaceC7419a;
        zzcb zzcbVar;
        if (interfaceC1875e instanceof zzbz) {
            zzbzVar = (zzbz) interfaceC1875e;
            int i7 = zzbzVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, interfaceC1875e);
            }
        } else {
            zzbzVar = new zzbz(this, interfaceC1875e);
        }
        Object obj = zzbzVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzbzVar.zzd;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = interfaceC7419a;
            zzbzVar.zzd = 1;
            if (interfaceC7419a.mo32856d(null, zzbzVar) == objE) {
                return objE;
            }
            zzcbVar = this;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC7419a interfaceC7419a2 = (InterfaceC7419a) zzbzVar.zza;
            zzje[] zzjeVarArr = zzbzVar.zzf;
            zzcbVar = zzbzVar.zze;
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = interfaceC7419a2;
            objArr = zzjeVarArr;
        }
        try {
            return AbstractC6087b.m27120a(AbstractC1631j.m6744q(objArr, zzcbVar.zza));
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(Object obj, InterfaceC1875e interfaceC1875e) {
        zzca zzcaVar;
        InterfaceC7419a interfaceC7419a;
        zzcb zzcbVar;
        if (interfaceC1875e instanceof zzca) {
            zzcaVar = (zzca) interfaceC1875e;
            int i7 = zzcaVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, interfaceC1875e);
            }
        } else {
            zzcaVar = new zzca(this, interfaceC1875e);
        }
        Object obj2 = zzcaVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzcaVar.zzd;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj2);
            interfaceC7419a = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = interfaceC7419a;
            zzcaVar.zzd = 1;
            if (interfaceC7419a.mo32856d(null, zzcaVar) == objE) {
                return objE;
            }
            zzcbVar = this;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC7419a interfaceC7419a2 = (InterfaceC7419a) zzcaVar.zza;
            zzje zzjeVar = zzcaVar.zzf;
            zzcbVar = zzcaVar.zze;
            AbstractC1437o.m6082b(obj2);
            interfaceC7419a = interfaceC7419a2;
            obj = zzjeVar;
        }
        try {
            zzcbVar.zza = obj;
            C1444v c1444v = C1444v.f4971a;
            return C1444v.f4971a;
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }
}
