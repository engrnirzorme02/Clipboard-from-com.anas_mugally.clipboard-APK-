package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6626O;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, InterfaceC6624N interfaceC6624N, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, InterfaceC1875e interfaceC1875e) {
        return AbstractC6626O.m28102e(new zzac(this, str, null), interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r12.zze(r0) == r1) goto L29;
     */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzse zzseVar, InterfaceC1875e interfaceC1875e) {
        zzad zzadVar;
        zzae zzaeVar;
        zzen zzenVar;
        if (interfaceC1875e instanceof zzad) {
            zzadVar = (zzad) interfaceC1875e;
            int i7 = zzadVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzadVar = new zzad(this, interfaceC1875e);
            }
        } else {
            zzadVar = new zzad(this, interfaceC1875e);
        }
        Object obj = zzadVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzadVar.zzd;
        if (i8 != 0) {
            if (i8 == 1) {
                zzenVar = zzadVar.zze;
                zzaeVar = (zzae) zzadVar.zza;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzenVar = (zzen) zzadVar.zza;
                AbstractC1437o.m6082b(obj);
            }
            zzenVar.zza();
            return C1444v.f4971a;
        }
        AbstractC1437o.m6082b(obj);
        zzen zzenVarZzc = zzz.zzc(this);
        if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
            this.zzd = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return C1444v.f4971a;
        }
        this.zze = zzi(zzseVar.zzg());
        zzan zzanVar = this.zzc;
        long jZzf = zzseVar.zzf();
        zzadVar.zza = this;
        zzadVar.zze = zzenVarZzc;
        zzadVar.zzd = 1;
        if (zzanVar.zzd(jZzf, zzadVar) != objE) {
            zzaeVar = this;
            zzenVar = zzenVarZzc;
        }
        return objE;
        zzan zzanVar2 = zzaeVar.zzc;
        zzadVar.zza = zzenVar;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
