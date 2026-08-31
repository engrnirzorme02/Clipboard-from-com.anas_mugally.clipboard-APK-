package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import p145S5.C1434l;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final InterfaceC6624N zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, InterfaceC6624N interfaceC6624N) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = interfaceC6624N;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : AbstractC1638q.m6599m0(zzeiVar2.zzd(), 20, 20, true)) {
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zztx zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        int iZzN = zztxVarZzk.zzN();
                        int i7 = iZzN - 1;
                        if (iZzN == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            zzrdVarZzi.zzq(zztxVarZzk.zzf());
                        } else if (i7 == 1) {
                            zzrdVarZzi.zzr(zztxVarZzk.zzg());
                        } else {
                            if (i7 != 2) {
                                throw new C1434l();
                            }
                            C1444v c1444v = C1444v.f4971a;
                        }
                        arrayList.add(zzejVar);
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                }
                if (zzrdVarZzi.zze() + zzrdVarZzi.zzf() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        AbstractC6672k.m28227d(this.zzd, null, null, new zzer(this, zztxVar, null), 3, null);
        zzh();
    }
}
