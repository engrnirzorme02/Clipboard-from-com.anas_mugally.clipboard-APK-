package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3488n0;
import com.google.android.gms.ads.internal.util.C3466c0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p036E2.BinderC0375w;
import p036E2.C0366r0;
import p036E2.InterfaceC0337d;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcgv implements zzckv {
    private static zzcgv zza;

    private static synchronized zzcgv zzF(Context context, zzbox zzboxVar, int i7, boolean z7, int i8, zzcid zzcidVar) {
        try {
            zzcgv zzcgvVar = zza;
            if (zzcgvVar != null) {
                return zzcgvVar;
            }
            long jMo18159a = C7351t.m32357o().mo18159a();
            zzbci.zza(context);
            if (((Boolean) zzbea.zze.zze()).booleanValue()) {
                zzbbt.zza(context);
            }
            zzfdy zzfdyVarZza = zzfdy.zza(context);
            C7584a c7584aZzb = zzfdyVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i8);
            zzfdyVarZza.zzc(zzboxVar);
            zzcis zzcisVar = new zzcis(null);
            zzcgw zzcgwVar = new zzcgw();
            zzcgwVar.zza(c7584aZzb);
            zzcgwVar.zzb(context);
            zzcgwVar.zzc(jMo18159a);
            zzcisVar.zza(new zzcgx(zzcgwVar, null));
            zzcisVar.zzb(new zzcjl(zzcidVar));
            zzcgv zzcgvVarZzc = zzcisVar.zzc();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzot)).booleanValue()) {
                C7351t.m32351i().zza(zzfgc.zzc(), zzcgvVarZzc.zzB());
                C7351t.m32351i().zzb();
            }
            ((zzdwx) ((zzcih) zzcgvVarZzc).zzo.zzb()).zza();
            ((zzcgr) ((zzcih) zzcgvVarZzc).zzn.zzb()).zza();
            C7351t.m32354l().zze(context, c7584aZzb, zzcgvVarZzc.zzB());
            C7351t.m32356n().zza(context);
            C7351t.m32349g().m17437M(context);
            C7351t.m32349g().m17438N(context);
            AbstractC3488n0.m17544a(context);
            C7351t.m32353k().zza(context);
            C7351t.m32343a().m17530a(context);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoJ)).booleanValue()) {
                String str = (String) C3250D.m17200c().zzd(zzbci.zzoK);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzcgvVarZzc.zzC().zza(C7351t.m32353k());
                    }
                }
            } else {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoI)).booleanValue()) {
                    zzcgvVarZzc.zzC().zza(C7351t.m32353k());
                }
            }
            ((C3466c0) ((zzcih) zzcgvVarZzc).zzan.zzb()).m17518a();
            zzbxs.zzb(context);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue()) {
                if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzaN)).booleanValue()) {
                    new zzecb(context, c7584aZzb, new zzbbh(new zzbbm(context)), new zzebg(new zzebc(context), (zzgpd) ((zzcih) zzcgvVarZzc).zzd.zzb())).zza(C7351t.m32354l().zzo().zzx());
                }
            }
            zza = zzcgvVarZzc;
            return zzcgvVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcgv zza(Context context, zzbox zzboxVar, int i7) {
        return zzF(context, zzboxVar, ModuleDescriptor.MODULE_VERSION, false, i7, new zzcid());
    }

    public abstract zzdwp zzA();

    public abstract zzdsm zzB();

    abstract zzdpu zzC();

    @Override // com.google.android.gms.internal.ads.zzckv
    public final zzbyl zzD() {
        return zzE();
    }

    public abstract zzbyl zzE();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzcyt zzd();

    public abstract zzcjw zze();

    public abstract zzfki zzf();

    public abstract zzcpo zzg();

    public abstract zzeyz zzh();

    public abstract zzcnx zzi();

    public abstract zzexm zzj();

    public abstract zzdgg zzk();

    public abstract zzfap zzl();

    public abstract zzdhc zzm();

    public abstract zzdoq zzn();

    public abstract zzfcc zzo();

    public abstract InterfaceC0337d zzp();

    public abstract BinderC0375w zzq();

    public abstract C0366r0 zzr();

    public abstract zzecy zzs();

    public abstract zzfeb zzt();

    public abstract zzdvs zzu();

    public abstract zzfie zzv();

    @Override // com.google.android.gms.internal.ads.zzckv
    public final zzevr zzw(zzbuv zzbuvVar, int i7) {
        return zzx(new zzewu(zzbuvVar, i7));
    }

    protected abstract zzevr zzx(zzewu zzewuVar);

    public abstract zzdud zzy();

    public abstract zzfds zzz();
}
