package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.lang.ref.WeakReference;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfa extends zzcqs {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddd zze;
    private final zzdgp zzf;
    private final zzcrn zzg;
    private final zzfor zzh;
    private final zzcwf zzi;
    private final zzbyz zzj;
    private final zzdsm zzk;
    private boolean zzl;

    zzdfa(zzcqr zzcqrVar, Context context, zzcek zzcekVar, zzddd zzdddVar, zzdgp zzdgpVar, zzcrn zzcrnVar, zzfor zzforVar, zzcwf zzcwfVar, zzbyz zzbyzVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcekVar);
        this.zze = zzdddVar;
        this.zzf = zzdgpVar;
        this.zzg = zzcrnVar;
        this.zzh = zzforVar;
        this.zzi = zzcwfVar;
        this.zzj = zzbyzVar;
        this.zzk = zzdsmVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhe)).booleanValue()) {
                if (!this.zzl && zzcekVar != null) {
                    zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdez
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

    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
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
        zzfcj zzfcjVarZzC;
        zzddd zzdddVar = this.zze;
        zzdddVar.zza();
        C7351t.m32349g();
        zzdgp zzdgpVar = this.zzf;
        if (C3431F0.m17428s(zzdgpVar.zzb())) {
            zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmI)).booleanValue()) {
                if (this.zzl) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfee.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdgpVar.zza(z7, context, this.zzi);
                    zzdddVar.zzb();
                    this.zzl = true;
                    return true;
                }
            } else {
                if (this.zzl) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfee.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdgpVar.zza(z7, context, this.zzi);
                    zzdddVar.zzb();
                    this.zzl = true;
                    return true;
                }
            }
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzom)).booleanValue()) {
                C7351t.m32349g();
                C3431F0.m17427r(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaR)).booleanValue()) {
                C7351t.m32349g();
                if (C3431F0.m17420k(this.zzc)) {
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaS)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                } else {
                    zzcek zzcekVar2 = (zzcek) this.zzd.get();
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmI)).booleanValue() || zzcekVar2 == null || (zzfcjVarZzC = zzcekVar2.zzC()) == null || !zzfcjVarZzC.zzar || zzfcjVarZzC.zzas == this.zzj.zzj()) {
                        if (this.zzl) {
                            int i10 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f("The interstitial ad has been shown.");
                            this.zzi.zzc(zzfee.zzd(10, null, null));
                        }
                        context = activity;
                        if (!this.zzl) {
                            if (activity == null) {
                                context = this.zzc;
                            }
                            try {
                                zzdgpVar.zza(z7, context, this.zzi);
                                zzdddVar.zzb();
                                this.zzl = true;
                                return true;
                            } catch (zzdgo e7) {
                                this.zzi.zzd(e7);
                            }
                        }
                    } else {
                        int i11 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("The interstitial consent form has been shown.");
                        this.zzi.zzc(zzfee.zzd(12, "The consent form has already been shown.", null));
                    }
                }
            } else {
                zzcek zzcekVar3 = (zzcek) this.zzd.get();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmI)).booleanValue()) {
                    if (this.zzl) {
                        int i12 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfee.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdgpVar.zza(z7, context, this.zzi);
                        zzdddVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                } else {
                    if (this.zzl) {
                        int i13 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfee.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdgpVar.zza(z7, context, this.zzi);
                        zzdddVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
