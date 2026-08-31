package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.lang.ref.WeakReference;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdom extends zzcqs {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgp zze;
    private final zzddd zzf;
    private final zzcwf zzg;
    private final zzcxm zzh;
    private final zzcrn zzi;
    private final zzbvx zzj;
    private final zzfor zzk;
    private final zzfcw zzl;
    private final zzdsm zzm;
    private boolean zzn;

    zzdom(zzcqr zzcqrVar, Context context, zzcek zzcekVar, zzdgp zzdgpVar, zzddd zzdddVar, zzcwf zzcwfVar, zzcxm zzcxmVar, zzcrn zzcrnVar, zzfcj zzfcjVar, zzfor zzforVar, zzfcw zzfcwVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdgpVar;
        this.zzd = new WeakReference(zzcekVar);
        this.zzf = zzdddVar;
        this.zzg = zzcwfVar;
        this.zzh = zzcxmVar;
        this.zzi = zzcrnVar;
        this.zzk = zzforVar;
        zzbvt zzbvtVar = zzfcjVar.zzl;
        this.zzj = new zzbwr(zzbvtVar != null ? zzbvtVar.zza : "", zzbvtVar != null ? zzbvtVar.zzb : 1);
        this.zzl = zzfcwVar;
        this.zzm = zzdsmVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhe)).booleanValue()) {
                if (!this.zzn && zzcekVar != null) {
                    zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdol
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcekVar.destroy();
                        }
                    });
                }
            } else if (zzcekVar != null) {
                zzcekVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z7, Activity activity) {
        Context context;
        C7351t.m32349g();
        zzdgp zzdgpVar = this.zze;
        if (!C3431F0.m17428s(zzdgpVar.zzb())) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzom)).booleanValue()) {
                C7351t.m32349g();
                C3431F0.m17427r(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaR)).booleanValue()) {
                C7351t.m32349g();
                if (C3431F0.m17420k(this.zzc)) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaS)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("The rewarded ad have been showed.");
            this.zzg.zzc(zzfee.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzddd zzdddVar = this.zzf;
        zzdddVar.zza();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            zzdgpVar.zza(z7, context, this.zzg);
            zzdddVar.zzb();
            return true;
        } catch (zzdgo e7) {
            this.zzg.zzd(e7);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzbvx zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzcek zzcekVar = (zzcek) this.zzd.get();
        return (zzcekVar == null || zzcekVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfcw zzh() {
        return this.zzl;
    }
}
